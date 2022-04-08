package com.rest.api.pokedex.core.model;

import java.io.Serializable;

public class ResponseDto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3203493585742630526L;
	
	private Integer codigo;
	private String mensaje;
	
	
	public ResponseDto() {}
	
	
	public ResponseDto(Integer codigo, String mensaje) {
		this.codigo=codigo;
		this.mensaje=mensaje;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
