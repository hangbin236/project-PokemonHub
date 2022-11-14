package com.pokemonHub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pokemonHub.pojo.PokemonPojo;
import com.pokemonHub.service.PokemonService;

@RestController
@RequestMapping("api")
public class PokemonController {
	
	// Create rest end-points by defining the rest methods

	@Autowired
	PokemonService pokemonService;
	
	@GetMapping("pokemons")
	public List<PokemonPojo> getAllPokemons(){
		return null;
		
	}
}
