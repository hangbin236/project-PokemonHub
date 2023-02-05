package com.pokemonHub.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="pokemon_details")
@Data
public class PokemonEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name ="pokemon_id")
		private int pokemonId;

		@Column(name ="pokemon_name")
		private String pokemonName;

		@Column(name ="pokemon_setname")
		private String pokemonSetName;

		@Column(name ="pokemon_condition")
		private String pokemonCondition;

		@Column(name ="pokemon_price")
		private int pokemonPrice;

		@Column(name ="pokemon_image")
		private String pokemonImage;
		
		public PokemonEntity() {
			super();
		}
	
}
