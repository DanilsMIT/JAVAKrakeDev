package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p1=new Producto("Arroz",-10.60);
		System.out.println("Precio ingresado: "+p1.getPrice());
		p1.setPrecio();
		System.out.println("Precio arreglado: "+p1.getPrice());
		
		//Descuento acorde a porcentaje
		double descuento=p1.calcularPrecioPromo(10);
		System.out.println("Descuento: "+descuento);
		System.out.println("Precio final: "+p1.getPrice());
	}

}
