package com.pokemonHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pokemonHub.dao.PokemonDao;
import com.pokemonHub.entity.PokemonEntity;
import com.pokemonHub.pojo.PokemonPojo;

@Service
public class PokemonServiceImpl implements PokemonService {

	public PokemonServiceImpl () {
		
	}

	@Override
	public List<PokemonPojo> getAllPokemons() {
		// TODO Auto-generated method stub
		
		List<PokemonEntity> allPoemonsEntity = PokemonDao.findAll();
		List<PokemonPojo> allPokemons = new ArrayList<PokemonPojo>();
		
		
		
		return allPokemons;
	}
}
