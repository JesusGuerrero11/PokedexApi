package com.rest.api.pokedex.core.controller;

import java.lang.invoke.MethodHandles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rest.api.pokedex.core.model.LstPokemonDto;
import com.rest.api.pokedex.core.model.PokemonDto;
import com.rest.api.pokedex.core.model.ResponseDto;
import com.rest.api.pokedex.core.service.IPokemonService;

@RestController
@RequestMapping(value="/api/v1")
public class PokemonController {

	private static final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

	@Autowired
	private IPokemonService pokemonService;
	 
 
	@GetMapping(value="/pokemon")
	public ResponseEntity<LstPokemonDto> obtenerListaPokemon(){
		logger.info("ingresa a capa de controller obtenerListaPokemon Method:: GET..");
		return new ResponseEntity<>(pokemonService.obtenerListaPokemon(),HttpStatus.OK);
	}
	
	@GetMapping(value="/pokemon/{id}")
	public ResponseEntity<PokemonDto> obtenerPokemon(@PathVariable Integer id){
		logger.info("ingresa a capa de controller obtenerListaPokemon Method:: GET..");
		return new ResponseEntity<>(pokemonService.obtenerPokemon(id),HttpStatus.OK);
	}
	
	@PutMapping(value="/pokemon")
	public ResponseEntity<ResponseDto> actualizarPokemon(@RequestBody  PokemonDto pokemon){
		logger.info("ingresa a capa de controller obtenerListaPokemon Method:: PUT..");
		return new ResponseEntity<>(pokemonService.actualizarPokemon(pokemon), HttpStatus.OK);
	}
	@PostMapping(value="/pokemon")
	public ResponseEntity<ResponseDto> registrarPokemon(@RequestBody PokemonDto pokemon){
		logger.info("ingresa a capa de controller obtenerListaPokemon Method:: POST..");
		return new ResponseEntity<>(pokemonService.registrarPokemon(pokemon), HttpStatus.OK);
	}
	@DeleteMapping(value="/pokemon/{id}")
	public ResponseEntity<ResponseDto> borrarPokemon(@PathVariable Integer id){
		logger.info("ingresa a capa de controller obtenerListaPokemon Method:: DELETE..");
		return new ResponseEntity<>(pokemonService.borrarPokemon(id), HttpStatus.OK);

	}
}