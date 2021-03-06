package com.rest.api.pokedex.core.repository.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import com.rest.api.pokedex.core.model.PokemonDto;
import com.rest.api.pokedex.core.repository.provider.PokemonProvider;

@Mapper
public interface IPokemonMapper {
	
	 
	@Results({
		@Result(column = "idPokemon", property = "idPokemon", javaType = Integer.class),
		@Result(column = "nombre", property = "nombre", javaType = String.class),
		@Result(column = "tipo", property = "tipo", javaType = String.class),
		@Result(column = "habilidad", property = "habilidad", javaType = String.class),
		@Result(column = "imagen", property = "imagen",  jdbcType  = JdbcType.BLOB)
	})
	@SelectProvider(type = PokemonProvider.class, method = "obtenerListaPokemon")List<PokemonDto> obtenerListaPokemon();
	
	
	@Results({
		@Result(column = "idPokemon", property = "idPokemon", javaType = Integer.class),
		@Result(column = "nombre", property = "nombre", javaType = String.class),
		@Result(column = "tipo", property = "tipo", javaType = String.class),
		@Result(column = "habilidad", property = "habilidad", javaType = String.class),
		@Result(column = "imagen", property = "imagen",  jdbcType  = JdbcType.BLOB)
	})
	@SelectProvider(type = PokemonProvider.class, method = "obtenerPokemon")PokemonDto obtenerPokemon(Integer id);
	
	 
	
	@Insert("INSERT into pokemon(idPokemon,nombre,tipo,habilidad,imagen) VALUES(#{idPokemon},#{nombre},#{tipo},#{habilidad},#{imagen})")
	Integer insertarPokemon(PokemonDto pokemon);
	
	@Update("UPDATE pokemon SET nombre=#{nombre}, tipo =#{tipo}, habilidad =#{habilidad}, imagen =#{imagen} WHERE idPokemon =#{idPokemon}")
	Integer actualizarPokemon(PokemonDto pokemon);
	
	@Delete("DELETE FROM pokemon WHERE idPokemon =#{idPokemon}")
	Integer borrarPokemon(Integer id);

}
