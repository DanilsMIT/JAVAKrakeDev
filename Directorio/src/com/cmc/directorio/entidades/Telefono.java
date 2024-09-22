package com.cmc.directorio.entidades;

public class Telefono {
	private String operadora;
	private String numero;
	private int codigo;
	private boolean Whatsapp;
	
	public Telefono(String operadora, String numero) {
		this.operadora=operadora;
		this.numero=numero;
		this.Whatsapp=false;
	}

	public void ImprimirInfo() {
		System.out.println(operadora);
		System.out.println(numero);
		System.out.println(codigo);
		System.out.println(Whatsapp);

	}
	
	
	
	
	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public boolean isWhatsapp() {
		return Whatsapp;
	}

	public void setWhatsapp(boolean whatsapp) {
		Whatsapp = whatsapp;
	}
	
	
}
