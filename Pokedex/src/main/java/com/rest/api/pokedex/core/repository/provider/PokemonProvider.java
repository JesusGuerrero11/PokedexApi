package com.rest.api.pokedex.core.repository.provider;

import org.apache.ibatis.jdbc.SQL;

public class PokemonProvider {
	
	public static String obtenerListaPokemon() {
		SQL innQuery = new SQL();
		innQuery.SELECT("idPokemon,nombre,tipo,habilidad,imagen");
		innQuery.FROM("pokemon");
		return innQuery.toString();
	}
	
	public static String obtenerPokemon(Integer idPokemon) {
		SQL innQuery = new SQL();
		innQuery.SELECT("idPokemon,nombre,tipo,habilidad,imagen");
		innQuery.FROM("pokemon");
		innQuery.WHERE("idPokemon=#{idPokemon}");
		return innQuery.toString();
	}

}
