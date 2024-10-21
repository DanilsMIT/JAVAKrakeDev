package com.krakedev.Inventario.entidades;

public class Producto {
	private String code;
	private String name;
	private Categoria categoria;
	private double price;
	private int stock;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Producto [code=" + code + ", name=" + name + ", categoria=" + categoria + ", price=" + price
				+ ", stock=" + stock + "]";
	}

	public Producto() {

	}

	public Producto(String code, String name, Categoria categoria, double price, int stock) {
		super();
		this.code = code;
		this.name = name;
		this.categoria = categoria;
		this.price = price;
		this.stock = stock;
	}
	
	
}
