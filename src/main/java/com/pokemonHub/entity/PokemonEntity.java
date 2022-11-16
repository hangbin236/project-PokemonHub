package com.pokemonHub.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pokemon_details")
public class PokemonEntity {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		
		@Column(name ="pokemon_id")
		private int pokemonId;

		@Column(name ="pokemon_name")
		private String pokemonName;

		@Column(name ="pokemon_setName")
		private String pokemonSetName;

		@Column(name ="pokemon_condition")
		private String pokemonCondition;

		@Column(name ="pokemon_price")
		private int pokemonPrice;

		@Column(name ="pokemon_image")
		private String pokemonImage;

		/**
		 * 
		 */
		public PokemonEntity() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @param pokemonId
		 * @param pokemonName
		 * @param pokemonSetName
		 * @param pokemonCondition
		 * @param pokemonPrice
		 * @param pokemonImage
		 */
		public PokemonEntity(int pokemonId, String pokemonName, String pokemonSetName, String pokemonCondition,
				int pokemonPrice, String pokemonImage) {
			super();
			this.pokemonId = pokemonId;
			this.pokemonName = pokemonName;
			this.pokemonSetName = pokemonSetName;
			this.pokemonCondition = pokemonCondition;
			this.pokemonPrice = pokemonPrice;
			this.pokemonImage = pokemonImage;
		}

		public int getPokemonId() {
			return pokemonId;
		}

		public void setPokemonId(int pokemonId) {
			this.pokemonId = pokemonId;
		}

		public String getPokemonName() {
			return pokemonName;
		}

		public void setPokemonName(String pokemonName) {
			this.pokemonName = pokemonName;
		}

		public String getPokemonSetName() {
			return pokemonSetName;
		}

		public void setPokemonSetName(String pokemonSetName) {
			this.pokemonSetName = pokemonSetName;
		}

		public String getPokemonCondition() {
			return pokemonCondition;
		}

		public void setPokemonCondition(String pokemonCondition) {
			this.pokemonCondition = pokemonCondition;
		}

		public int getPokemonPrice() {
			return pokemonPrice;
		}

		public void setPokemonPrice(int pokemonPrice) {
			this.pokemonPrice = pokemonPrice;
		}

		public String getPokemonImage() {
			return pokemonImage;
		}

		public void setPokemonImage(String pokemonImage) {
			this.pokemonImage = pokemonImage;
		}

		@Override
		public String toString() {
			return "PokemonEntity [pokemonId=" + pokemonId + ", pokemonName=" + pokemonName + ", pokemonSetName="
					+ pokemonSetName + ", pokemonCondition=" + pokemonCondition + ", pokemonPrice=" + pokemonPrice
					+ ", pokemonImage=" + pokemonImage + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(pokemonCondition, pokemonId, pokemonImage, pokemonName, pokemonPrice, pokemonSetName);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			PokemonEntity other = (PokemonEntity) obj;
			return Objects.equals(pokemonCondition, other.pokemonCondition) && pokemonId == other.pokemonId
					&& Objects.equals(pokemonImage, other.pokemonImage)
					&& Objects.equals(pokemonName, other.pokemonName) && pokemonPrice == other.pokemonPrice
					&& Objects.equals(pokemonSetName, other.pokemonSetName);
		}
		
		
}
