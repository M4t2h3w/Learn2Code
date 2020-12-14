package com.midnightnoon.learn2code.springlearn2code.mappers;

import com.midnightnoon.learn2code.springlearn2code.model.Director;
import com.midnightnoon.learn2code.springlearn2code.model.Movie;
import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

public class MovieMapperTest {

    @Test
    public void movieToMovieDtoIsSame(){
        Movie movie = new Movie();
        movie.setName("Star Trek");
        movie.setId(1L);
        Set<String> set = new HashSet<>();
        set.add("Axel Movie");

        MovieDTO movieDTO = MovieMapper.INSTANCE.movieToMovieDto(movie);

        assertEquals(movie.getId(), movieDTO.getId());
        assertEquals(movie.getName(), movieDTO.getName());
        assertArrayEquals(movie.getDirectors().toArray(),
                movieDTO.getDirectorsOfTheMovie().toArray());
    }

}