package com.rest.api.pokedex.core.service;


import com.rest.api.pokedex.core.model.LstPokemonDto;
import com.rest.api.pokedex.core.model.PokemonDto;
import com.rest.api.pokedex.core.model.ResponseDto;

public interface IPokemonService {

	public PokemonDto obtenerPokemon(Integer id);


	public ResponseDto actualizarPokemon(PokemonDto pokemon);


	public ResponseDto registrarPokemon(PokemonDto pokemon);


	public ResponseDto borrarPokemon(Integer id);


	public LstPokemonDto obtenerListaPokemon();




}
