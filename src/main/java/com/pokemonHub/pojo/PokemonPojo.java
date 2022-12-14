package com.pokemonHub.pojo;

import java.util.Objects;

import org.jetbrains.annotations.NotNull;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class PokemonPojo {

	
	private int pokemonId;

	private String pokemonName;


	private String pokemonSetName;


	private String pokemonCondition;

	private int pokemonPrice;
	
	private String pokemonImage;

	/**
	 * 
	 */
	public PokemonPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

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

	/**
	 * @param pokemonName
	 * @param pokemonSetName
	 * @param pokemonCondition
	 * @param pokemonPrice
	 * @param pokemonImage
	 */
	public PokemonPojo(String pokemonName, String pokemonSetName, String pokemonCondition, int pokemonPrice,
			String pokemonImage) {
		super();
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
		return "PokemonPojo [pokemonId=" + pokemonId + ", pokemonName=" + pokemonName + ", pokemonSetName="
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
		PokemonPojo other = (PokemonPojo) obj;
		return Objects.equals(pokemonCondition, other.pokemonCondition) && pokemonId == other.pokemonId
				&& Objects.equals(pokemonImage, other.pokemonImage) && Objects.equals(pokemonName, other.pokemonName)
				&& pokemonPrice == other.pokemonPrice && Objects.equals(pokemonSetName, other.pokemonSetName);
	}


}
