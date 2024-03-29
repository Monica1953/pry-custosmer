package com.springboot.customers.monica.model;

public class Respuesta {
	private Integer codigo;
	private String descripcion;

	public Respuesta() {
		super();
	}

	public Respuesta(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Respuesta [codigo=" + codigo + ", descripcion=" + descripcion + "]";
	}

}
