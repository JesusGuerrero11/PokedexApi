package com.rest.api.pokedex.core.repository.impl;

import java.lang.invoke.MethodHandles;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;
import org.springframework.web.server.ResponseStatusException;
import com.rest.api.pokedex.core.model.LstPokemonDto;
import com.rest.api.pokedex.core.model.PokemonDto;
import com.rest.api.pokedex.core.model.ResponseDto;
import com.rest.api.pokedex.core.repository.IPokemonRepository;
import com.rest.api.pokedex.core.repository.mapper.IPokemonMapper;




@Repository
public class PokemonRepository implements IPokemonRepository{
	
	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	
	@Autowired
	IPokemonMapper pokemonMapper;
	
	
	@Override
	public LstPokemonDto obtenerListaPokemon() {
		logger.info("ingresa a capa de Repository :: obtenerListaPokemon");
		try {
			List<PokemonDto>  pokemons =pokemonMapper.obtenerListaPokemon();
			return new LstPokemonDto(pokemons);
		} catch (Exception e) {
			logger.info("Ocurrio un error al actualizar el registro {}",e);
			throw new ResponseStatusException(HttpStatus.CONFLICT);
		}
	}
	

	@Override
	public PokemonDto obtenerPokemon(Integer id) {
		logger.info("ingresa a capa de Repository :: obtenerPokemon");
		try {
			return pokemonMapper.obtenerPokemon(id);
		} catch (Exception e) {
			logger.info("Ocurrio un error al actualizar el registro {}",e);
			throw new ResponseStatusException(HttpStatus.CONFLICT);
		}
	}

	

	@Override
	public ResponseDto actualizarPokemon(PokemonDto pokemon) {
		logger.info("ingresa a capa de Repository :: actualizarPokemon");
		try {
			Integer result=pokemonMapper.actualizarPokemon(pokemon);
			if(result!=1) {
				return new ResponseDto(-1,"No fue posible actualizar");
			}
			return new ResponseDto(0,"se ejecuto de forma exitosa");
		} catch (Exception e) {
			logger.info("Ocurrio un error al actualizar el registro {}",e);
			throw new ResponseStatusException(HttpStatus.CONFLICT);
		}
		
	}
	

	@Override
	public ResponseDto registrarPokemon(PokemonDto pokemon) {
		logger.info("ingresa a capa de Repository ::  registrarPokemon");
		try {
			Integer result=pokemonMapper.insertarPokemon(pokemon);
			if(result!=1) {
				return new ResponseDto(-1,"No fue posible Registrar");
			}
			return new ResponseDto(0,"se ejecuto de forma exitosa");
		} catch (Exception e) {
			logger.info("Ocurrio un error al registrar {}",e);
			throw new ResponseStatusException(HttpStatus.CONFLICT);
		}
	}

	
	@Override
	public ResponseDto borrarPokemon(Integer id) {
		logger.info("ingresa a capa de Repository :: borrarPokemon");
		try {
			Integer result=pokemonMapper.borrarPokemon(id);
			if(result!=1) {
				return new ResponseDto(-1,"No fue posible Borrar el Registro");
			}
			return new ResponseDto(0,"se ejecuto de forma exitosa");
		} catch (Exception e) {
			logger.info("Ocurrio un error al borrar el registro {}",e);
			throw new ResponseStatusException(HttpStatus.CONFLICT);
		}
	}


}
