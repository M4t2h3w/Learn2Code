package com.midnightnoon.learn2code.springlearn2code.services;

import com.midnightnoon.learn2code.springlearn2code.model.Movie;
import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;

import java.util.List;

public interface MovieService {

    Movie createAndAddMovie();

    MovieDTO getMovieById(Long id);

    List<MovieDTO> getAllMovies();

    List<MovieDTO> findMovieByName(String name);

    Movie createAndAddMovie2();

    MovieDTO addMovie(MovieDTO movieDTO);

    MovieDTO updateMovie(MovieDTO movieDTO, Long movieId);

    void deleteMovie(long movieId);
}
