package com.cmc.repaso.entidades;

public class Producto {
	private String name;
	private double price;
	
	public Producto(String name, double price) {
		this.name=name;
		this.price=price;
	}
	
	public void setPrecio() {
		if(price<0) {
			price=price*-1;
		}
	}
	
	public double calcularPrecioPromo( double disccount) {
		
		disccount=disccount/100;
		disccount=(price*disccount);
		price=price-disccount;
		return disccount;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}


	
	
}
