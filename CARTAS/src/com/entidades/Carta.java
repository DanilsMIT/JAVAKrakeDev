package com.entidades;

public class Carta {
	private Numero numero;
	private String palo;
	private String Estado;
	
	public void printC() {
		System.out.println(numero+"-"+palo);
	}
	
	public Carta(Numero numero, String palo) {
		super();
		this.numero = numero;
		this.palo = palo;
		this.Estado="N";
		//N de carta no barajada
	}
	public Numero getNumero() {
		return numero;
	}
	public void setNumero(Numero numero) {
		this.numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}
	
	
}
