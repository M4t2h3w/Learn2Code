package com.midnightnoon.learn2code.springlearn2code.restapi;

import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;
import com.midnightnoon.learn2code.springlearn2code.restapi.MovieRestController;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.methodOn;

@Component
public class MovieResourceAssembler implements RepresentationModelAssembler<MovieDTO, EntityModel<MovieDTO>> {
    @Override
    public EntityModel<MovieDTO> toModel(MovieDTO movieDTO) {
        return new EntityModel<>(movieDTO,
                linkTo(methodOn(MovieRestController.class).getMovieById(movieDTO.getId())).withSelfRel(),
                linkTo(methodOn(MovieRestController.class).getMovies("")).withRel("movies")
        );
    }
}
