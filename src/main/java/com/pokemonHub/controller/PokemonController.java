package com.pokemonHub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pokemonHub.pojo.PokemonPojo;
import com.pokemonHub.service.PokemonService;

@CrossOrigin
@RestController
@RequestMapping("api")
public class PokemonController {
	
	// Create rest end-points by defining the rest methods

	@Autowired
	PokemonService pokemonService;
	
	// http:localhost:7474/api/allpokemons
	@GetMapping("allpokemons")
	public List<PokemonPojo> getAllPokemons(){
		
		List<PokemonPojo> allPokemons = pokemonService.getAllPokemons();
		return allPokemons;
		
	}
	@RequestMapping("hello")
	public @ResponseBody String greeting() {
		return "Hello, World";
	}
}
