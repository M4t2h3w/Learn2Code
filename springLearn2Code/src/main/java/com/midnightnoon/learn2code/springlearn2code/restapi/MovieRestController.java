package com.midnightnoon.learn2code.springlearn2code.restapi;

import com.midnightnoon.learn2code.springlearn2code.model.Movie;
import com.midnightnoon.learn2code.springlearn2code.model.dto.MovieDTO;
import com.midnightnoon.learn2code.springlearn2code.services.MovieService;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.RepresentationModelAssembler;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.ControllerLinkBuilder.methodOn;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    MovieService movieService;
    MovieResourceAssembler assembler;

    public MovieRestController(MovieService movieService, MovieResourceAssembler assembler) {
        this.movieService = movieService;
        this.assembler = assembler;
    }

    //inject cez konštruktor, môžem aj cez @Autowired anotáciu pred deklaráciou MovieService
//    public MovieRestController(MovieService movieService) {
//        this.movieService = movieService;
//    }

    @GetMapping("/movies")
    //ak chcem pouzivat parametre v ceste za ? tak pouzijem RequestParam
    List<MovieDTO> getMovies(@RequestParam(required = false) String name){
        if(name != null && !name.isEmpty()) return movieService.findMovieByName(name);
        else return movieService.getAllMovies();
    }

    @GetMapping("/movies/{id}")
    EntityModel<MovieDTO> getMovieById(@PathVariable("id") Long movieId){ //nakolko je iny nazov vstupnej premennej
        //ako v ceste /movies/{id} vs movieId tak musim spravit @PathVariable so zatvorkami () kde dam
        //nazov premennej z path

        MovieDTO movieDTO = movieService.getMovieById(movieId);

        return assembler.toModel(movieDTO);
    }

    @PostMapping("/movies")
    MovieDTO addMovie(@RequestBody MovieDTO movieDTO){
        return movieService.addMovie(movieDTO);
    }

    @PutMapping("/movies/{id}")
    MovieDTO updateMovie(@RequestBody MovieDTO movieDTO, @PathVariable("id") Long movieId){
        return movieService.updateMovie(movieDTO, movieId);
    }

    @DeleteMapping("/movies/{id}")
    void deleteMovie(@PathVariable("id") long movieId){
        movieService.deleteMovie(movieId);
    }


}
