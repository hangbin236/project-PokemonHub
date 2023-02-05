package com.pokemonHub.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class PokemonPojo {

	
	private int pokemonId;

	private String pokemonName;


	private String pokemonSetName;


	private String pokemonCondition;

	private int pokemonPrice;
	
	private String pokemonImage;


	public PokemonPojo(int pokemonId, String pokemonName, String pokemonSetName, String pokemonCondition,
			int pokemonPrice, String pokemonImage) {
		super();
		this.pokemonId = pokemonId;
		this.pokemonName = pokemonName;
		this.pokemonSetName = pokemonSetName;
		this.pokemonCondition = pokemonCondition;
		this.pokemonPrice = pokemonPrice;
		this.pokemonImage = pokemonImage;
	}
	
	

}
