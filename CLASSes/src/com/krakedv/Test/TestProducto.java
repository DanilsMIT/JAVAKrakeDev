package com.krakedv.Test;

import com.krakedv.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA=new Producto();
		productoB=new Producto();
		productoC=new Producto();
		
		
		productoA.nombre="Manzana";
		productoA.detalles="roja y mediana";
		productoA.precio=1.50;
		productoA.stock=35;
		
		productoB.nombre="Manzana nueva";
		productoB.detalles="verde y grande";
		productoB.precio=3.50;
		productoB.stock=25;
		
		productoC.nombre="Manzana Americana";
		productoC.detalles="roja y grande";
		productoC.precio=2.00;
		productoC.stock=55;
		
		
		System.out.println("Producto 1: "+productoA.nombre);
		System.out.println("detalles: "+productoA.detalles);
		System.out.println("precio: "+productoA.precio);
		System.out.println("stock: "+productoA.stock);

		System.out.println("Producto 2: "+productoB.nombre);
		System.out.println("detalles: "+productoB.detalles);
		System.out.println("precio: "+productoB.precio);
		System.out.println("stock: "+productoB.stock);
		
		System.out.println("Producto 3: "+productoC.nombre);
		System.out.println("detalles: "+productoC.detalles);
		System.out.println("precio: "+productoC.precio);
		System.out.println("stock: "+productoC.stock);

	}
	

}
