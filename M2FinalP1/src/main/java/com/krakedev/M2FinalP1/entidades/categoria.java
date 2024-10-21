package com.krakedev.M2FinalP1.entidades;

public class categoria {
	private String idC;
	private String nombre;

	public categoria() {

	}

	public categoria(String idC, String nombre) {
		super();
		this.idC = idC;
		this.nombre = nombre;
	}

	public String getIdC() {
		return idC;
	}

	public void setIdC(String idC) {
		this.idC = idC;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "categoria [idC=" + idC + ", nombre=" + nombre + "]";
	}

}

	