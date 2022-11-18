package com.pokemonHub.dao;

import java.util.List;

import com.pokemonHub.entity.PokemonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonDao extends JpaRepository<PokemonEntity, Integer>{

	

}
