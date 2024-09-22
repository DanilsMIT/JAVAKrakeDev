package com.clearminds.componentes;

public class Celda {
	private Producto Producto;
	private int stock;
	private String codigo;
	
	public Celda(String codigo) {
		this.codigo = codigo;
	}
	
	public void ingresarProducto(Producto Producto, int stock) {
		this.Producto=Producto;
		this.stock=stock;
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
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	
}
