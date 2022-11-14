package com.pokemonHub.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.pokemonHub.pojo.PokemonPojo;

@Service
public interface PokemonService {
	
	List<PokemonPojo> getAllPokemons();

}
