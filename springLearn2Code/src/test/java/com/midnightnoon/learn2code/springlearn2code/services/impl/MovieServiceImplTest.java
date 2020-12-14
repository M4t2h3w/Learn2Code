package com.midnightnoon.learn2code.springlearn2code.services.impl;

import com.midnightnoon.learn2code.springlearn2code.model.Movie;
import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;
import com.midnightnoon.learn2code.springlearn2code.services.MovieService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieServiceImplTest {

    public static final String FIREPROOF = "Fireproof";
    @Autowired
    MovieService movieService;

    @Test
    @Transactional  //musim oznacit ako transactional aby sa postaral o tranzakcie,
                    // inac padne na chybe no session
    public void movieToServiceToDtoIsSame(){
        Movie movie = new Movie();
        movie.setName(FIREPROOF);
        movie.setId(1L);
//        Set<String> set = new HashSet<>();
//        set.add("Alex Kendrick");

        MovieDTO movieDTO = movieService.getMovieById(1L);

        assertEquals(movie.getName(), movieDTO.getName());
        assertEquals(movie.getId(), movieDTO.getId());
    }

    @Test
    @Transactional
    public void moviesFromServicesAreSame(){
        Movie movie = new Movie();
        movie.setName(FIREPROOF);
        movie.setId(1L);
        Movie movie2 = new Movie();
        movie2.setName(FIREPROOF);
        movie2.setId(2L);

        List<Movie> movies = new ArrayList<>();
        movies.add(movie);
        movies.add(movie2);

        List<MovieDTO> movieDTOS = movieService.getAllMovies();

        assertEquals(movie.getId(), movieDTOS.get(0).getId());
        assertEquals(movie.getName(), movieDTOS.get(0).getName());

        assertEquals(movie2.getId(), movieDTOS.get(1).getId());
        assertEquals(movie2.getName(), movieDTOS.get(1).getName());
    }

    @Test
    @Transactional
    public void movieFromDbIsFireproof(){
        List<MovieDTO> movieDTO = movieService.findMovieByName(FIREPROOF);
        assertEquals(movieDTO.get(0).getName(), FIREPROOF);
        assertEquals(movieDTO.get(1).getName(), FIREPROOF);
    }
}