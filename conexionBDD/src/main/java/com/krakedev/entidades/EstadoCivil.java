package com.krakedev.entidades;

public class EstadoCivil {
	private String Code;
	private String descripcion;
	
	public EstadoCivil() {}
	public EstadoCivil(String code, String descripcion) {
		Code = code;
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		return "EstadoCivil [Code=" + Code + ", descripcion=" + descripcion + "]";
	}
	public String getCode() {
		return Code;
	}
	public void setCode(String code) {
		Code = code;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
