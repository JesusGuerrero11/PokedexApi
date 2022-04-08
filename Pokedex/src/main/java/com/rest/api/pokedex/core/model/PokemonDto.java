package com.rest.api.pokedex.core.model;

import java.io.Serializable;

public class PokemonDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2548447076868421569L;
	private Integer idPokemon;
	private String nombre;
	private String tipo;
	private String habilidad;
	private byte[] imagen;
	
	public PokemonDto() {}
	
	public PokemonDto(Integer idPokemon,String nombre, String tipo, String habilidad) {
		this.idPokemon=idPokemon;
		this.nombre=nombre;
		this.tipo=tipo;
		this.habilidad=habilidad;
	}
	public PokemonDto(Integer idPokemon,String nombre, String tipo, String habilidad,byte[] imagen) {
		this.idPokemon=idPokemon;
		this.nombre=nombre;
		this.tipo=tipo;
		this.habilidad=habilidad;
		this.imagen=imagen;
	}
	
	public byte[] getImagen() {
		return imagen;
	}

	public void setImagen(byte[] imagen) {
		this.imagen = imagen;
	}

	public Integer getIdPokemon() {
		return idPokemon;
	}
	public void setIdPokemon(Integer idPokemon) {
		this.idPokemon = idPokemon;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getHabilidad() {
		return habilidad;
	}
	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}
	
	

}
