package com.rest.api.pokedex.core.service.impl;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.api.pokedex.core.model.LstPokemonDto;
import com.rest.api.pokedex.core.model.PokemonDto;
import com.rest.api.pokedex.core.model.ResponseDto;
import com.rest.api.pokedex.core.repository.IPokemonRepository;
import com.rest.api.pokedex.core.service.IPokemonService;



@Service
public class PokemonService implements IPokemonService{

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	
	@Autowired
	IPokemonRepository pokemonRepository;

	@Override
	public PokemonDto obtenerPokemon(Integer id) {
		logger.info("pasando metodo de obtenerPokemon en capa de servicio..");
		return pokemonRepository.obtenerPokemon(id);
	
	}

	@Override
	public ResponseDto actualizarPokemon(PokemonDto pokemon) {
		logger.info("pasando metodo de actualizarPokemon en capa de servicio..");
		return pokemonRepository.actualizarPokemon(pokemon);
	}

	@Override
	public ResponseDto registrarPokemon(PokemonDto pokemon) {
		logger.info("pasando metodo de registrarPokemon en capa de servicio..");
		return pokemonRepository.registrarPokemon(pokemon);
	}

	@Override
	public ResponseDto borrarPokemon(Integer id) {
		logger.info("pasando metodo de borrarPokemon en capa de servicio..");
		return pokemonRepository.borrarPokemon(id);
	}

	@Override
	public LstPokemonDto obtenerListaPokemon() {
		logger.info("pasando metodo de obtenerListaPokemon en capa de servicio..");
		return pokemonRepository.obtenerListaPokemon();
	}

	
	
}
