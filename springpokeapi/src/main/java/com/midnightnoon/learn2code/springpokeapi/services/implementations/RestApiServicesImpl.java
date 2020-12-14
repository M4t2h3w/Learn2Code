package com.midnightnoon.learn2code.springpokeapi.services.implementations;

import com.midnightnoon.learn2code.springpokeapi.model.PokemonList;
import com.midnightnoon.learn2code.springpokeapi.services.RestApiServices;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.client.RestTemplate;

@Service
public class RestApiServicesImpl implements RestApiServices {

    RestTemplate restTemplate;

    public RestApiServicesImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
//    @ModelAttribute("pokemonList")
    @Bean
    public PokemonList pokemonList() {
        PokemonList pokemonList =
                restTemplate.getForObject("https://pokeapi.co/api/v2/pokemon?offset=20&limit=20", PokemonList.class);
        return pokemonList;
    }
}
