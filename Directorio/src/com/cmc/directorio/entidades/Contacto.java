package com.cmc.directorio.entidades;

public class Contacto {
	private String Nombre;
	private boolean Activo;
	private Telefono phone;
	private double peso;

	public Contacto(String Nombre, Telefono phone, double peso) {
		this.Nombre=Nombre;
		this.phone=phone;
		this.peso=peso;
	}
	
	public void imprimirCInfo() {
		System.out.println(Nombre);
		System.out.println("Whatsapp/Activo: "+Activo);
		System.out.println(phone.getNumero());
		System.out.println(phone.getOperadora());
		System.out.println("Peso: "+peso);

	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public boolean isActivo() {
		return Activo;
	}

	public void setActivo(boolean activo) {
		Activo = activo;
	}

	public Telefono getPhone() {
		return phone;
	}

	public void setPhone(Telefono phone) {
		this.phone = phone;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
