package com.midnightnoon.learn2code.springlearn2code.services.impl;

import com.midnightnoon.learn2code.springlearn2code.mappers.MovieMapper;
import com.midnightnoon.learn2code.springlearn2code.model.Movie;
import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;
import com.midnightnoon.learn2code.springlearn2code.repositories.MovieRepository;
import com.midnightnoon.learn2code.springlearn2code.services.MovieService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service //oznacil som implementaciu interfaceu ako Spring bean/komponent - sucast Spring kontajneru
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;
    MovieMapper movieMapper;

    //takto poviem Springu aby dodal implementaciu
    //Spring injectne implementaciu --> dependency injection


    public MovieServiceImpl(MovieRepository movieRepository, MovieMapper movieMapper) {
        this.movieRepository = movieRepository;
        this.movieMapper = movieMapper;
    }

    @Override
    public Movie createAndAddMovie() {

        Movie movie = new Movie();
        movie.setName("Fireproof");

        return movieRepository.save(movie);
    }

    @Override
    public Movie createAndAddMovie2() {

        Movie movie = new Movie();
        movie.setName("Star Trek");

        return movieRepository.save(movie);
    }

    @Override
    public MovieDTO getMovieById(Long id) {
        return movieMapper.movieToMovieDto(movieRepository.findById(id).orElse(null));
    }

    @Override
    public List<MovieDTO> getAllMovies() {
        return movieRepository.findAll().stream()
                .map(movie -> movieMapper.movieToMovieDto(movie)).collect(Collectors.toList());
    }

    @Override
    public List<MovieDTO> findMovieByName(String name) {
        return movieRepository.findByName(name).stream()
                .map(movie -> movieMapper.movieToMovieDto(movie)).collect(Collectors.toList());
    }

    @Override
    public MovieDTO addMovie(MovieDTO movieDTO) {
        return movieMapper.movieToMovieDto(
                movieRepository.save(movieMapper.movieDtoToMovie(movieDTO)));
    }

    @Override
    public MovieDTO updateMovie(MovieDTO movieDTO, Long movieId) {
        return movieMapper.movieToMovieDto(movieRepository.findById(movieId)
                .map(movie -> {
                        movie.setName(movieDTO.getName());
                        movie.setDirectors(movieDTO.getDirectorsOfTheMovie());
                        return movieRepository.save(movie);
                    }
                    // ak sa nevykona map (vrati empty optional) tak sa orElseGet vykona, ináč nie
                ).orElseGet(() -> {
                    movieDTO.setId(movieId);
                    return movieRepository.save(movieMapper.movieDtoToMovie(movieDTO));
                    }
                )
        );
    }

    @Override
    public void deleteMovie(long movieId) {
        movieRepository.deleteById(movieId);
    }
}
