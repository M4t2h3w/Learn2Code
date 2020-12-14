package com.midnightnoon.learn2code.springlearn2code.mappers;

import com.midnightnoon.learn2code.springlearn2code.model.Movie;
import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MovieMapper {

    MovieMapper INSTANCE = Mappers.getMapper(MovieMapper.class);

    @Mapping(target = "directorsOfTheMovie", source = "directors")
    MovieDTO movieToMovieDto(Movie movie);

    @Mapping(target = "directors", source = "directorsOfTheMovie")
    Movie movieDtoToMovie(MovieDTO movieDTO);
}
