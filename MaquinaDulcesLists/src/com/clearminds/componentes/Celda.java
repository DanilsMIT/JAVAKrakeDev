package com.clearminds.componentes;

public class Celda {
	private  Producto Producto;
	private	int stock;
	private String Codigo;
	
	public void ingresarProducto(Producto product, int stocki) {
		Producto=product;
		stock=stocki;
	}
	
	public Celda(String codigo) {
		Codigo = codigo;
	}
	public Producto getProducto() {
		return Producto;
	}
	public void setProducto(Producto producto) {
		Producto = producto;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getCodigo() {
		return Codigo;
	}
	public void setCodigo(String codigo) {
		Codigo = codigo;
	}
	 
}
