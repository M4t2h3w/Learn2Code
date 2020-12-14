package com.midnightnoon.learn2code.springpokeapi.controllers;

import com.midnightnoon.learn2code.springpokeapi.model.PokemonList;
import com.midnightnoon.learn2code.springpokeapi.services.RestApiServices;
import com.midnightnoon.learn2code.springpokeapi.services.implementations.RestApiServicesImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.ServletContext;

@Controller
public class PokemonController {

    private PokemonList pokemonList;

    public PokemonController(PokemonList pokemonList) {
        this.pokemonList = pokemonList;
    }

    @GetMapping("/pokemons")
    public String pokemonsModel(Model model){
        model.addAttribute("pokemons", pokemonList);
        return "pokemons";
    }
}
