package com.rest.api.pokedex.core.model;

import java.io.Serializable;
import java.util.List;

public class LstPokemonDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2187650379818130196L;
	
	private List<PokemonDto> pokemons;

	public LstPokemonDto() {}
	public LstPokemonDto(List<PokemonDto> pokemons) {
		this.pokemons=pokemons;
	}

	public List<PokemonDto> getPokemons() {
		return pokemons;
	}

	public void setPokemons(List<PokemonDto> pokemons) {
		this.pokemons = pokemons;
	}
	
	

}
