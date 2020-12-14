package com.midnightnoon.learn2code.springpokeapi;

import com.midnightnoon.learn2code.springpokeapi.model.Pokemon;
import com.midnightnoon.learn2code.springpokeapi.model.PokemonList;
import com.midnightnoon.learn2code.springpokeapi.services.RestApiServices;
import com.midnightnoon.learn2code.springpokeapi.services.implementations.RestApiServicesImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringpokeapiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringpokeapiApplication.class, args);
		PokemonList pokemonList = context.getBean(RestApiServices.class).pokemonList();
		for(Pokemon pokemon : pokemonList.getResults()){
			System.out.println(pokemon.getName() + " : " + pokemon.getUrl());
		}
	}

}
