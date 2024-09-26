package com.clearminds.componentes;

public class Producto {
	private String Nombre;
	private double Precio;
	private String Codigo;
	
	//incrementa el precio acorde a un porcentaje del establecido
	public void incrementarPrecio(int porcentaje) {
		Precio= Precio*(porcentaje*0.01+1);
	}
	
	//descuento directo en cantidad
	public void disminuirPrecio(double resta) {
		Precio=Precio-resta;
	}

	
	
	public Producto(String codigo,String nombre, double precio) {
		super();
		Nombre = nombre;
		Precio = precio;
		Codigo = codigo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	
	
	
	
	
}
