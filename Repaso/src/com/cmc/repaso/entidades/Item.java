package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales;
	private int productosDevueltos;
	private int ProductosVendidos;
	
	public Item(String nombre, int stock) {
		this.nombre=nombre;
		this.productosActuales=stock;
		this.productosDevueltos=0;
		this.ProductosVendidos=0;
	}
	
	public void ImprimirStock() {
		System.out.println(nombre);
		System.out.println(productosActuales);
		System.out.println(productosDevueltos);
		System.out.println(ProductosVendidos);

	}
	
	public void vender(int pVendidos) {
		this.productosActuales=productosActuales-pVendidos;
		this.ProductosVendidos=ProductosVendidos+pVendidos;

	}
	
	public void devolver(int pdevoluciones) {
		this.productosActuales=productosActuales+pdevoluciones;
		this.productosDevueltos=productosDevueltos+pdevoluciones;
		this.ProductosVendidos=ProductosVendidos-pdevoluciones;

	}
	
}
