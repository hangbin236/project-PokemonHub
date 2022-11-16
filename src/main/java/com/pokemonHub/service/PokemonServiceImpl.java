package com.pokemonHub.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pokemonHub.dao.PokemonDao;
import com.pokemonHub.entity.PokemonEntity;
import com.pokemonHub.pojo.PokemonPojo;

@Service
public class PokemonServiceImpl implements PokemonService {

	@Autowired
	PokemonDao pokemonDao;
		
	public PokemonServiceImpl() {

	}

	@Override
	public List<PokemonPojo> getAllPokemons() {
		// TODO Auto-generated method stub

		List<PokemonEntity> allPoemonsEntity = pokemonDao.findAll();
		List<PokemonPojo> allPokemons = new ArrayList<PokemonPojo>();

		for (PokemonEntity fetchedPokemonEntity : allPoemonsEntity) {
			PokemonPojo returnPokemonPojo = new PokemonPojo(fetchedPokemonEntity.getPokemonId(),
					fetchedPokemonEntity.getPokemonName(), fetchedPokemonEntity.getPokemonSetName(),
					fetchedPokemonEntity.getPokemonCondition(), fetchedPokemonEntity.getPokemonPrice(),
					fetchedPokemonEntity.getPokemonImage());

			allPokemons.add(returnPokemonPojo);
		}
		return allPokemons;
	}
}
