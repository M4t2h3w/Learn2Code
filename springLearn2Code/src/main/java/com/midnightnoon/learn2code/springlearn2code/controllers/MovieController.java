package com.midnightnoon.learn2code.springlearn2code.controllers;

import com.midnightnoon.learn2code.springlearn2code.repositories.MovieRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //ak chcem aby nejaka metoda bola v ramci SpringMVC controller tak ju musim oanotovať
public class MovieController {

    MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @RequestMapping("/movies")
    public String getMovies(Model model){
        model.addAttribute("movies", movieRepository.findAll());
        return "movies";
    }
}
