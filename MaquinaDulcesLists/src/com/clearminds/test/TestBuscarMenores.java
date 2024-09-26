package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A1"));
        maquina.agregarCelda(new Celda("A2"));
        maquina.agregarCelda(new Celda("A3"));
        maquina.agregarCelda(new Celda("A4"));
        maquina.agregarCelda(new Celda("A5"));
        maquina.agregarCelda(new Celda("A6"));
        
        Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A1", 4);
		
		Producto producto2=new Producto("D456","Doritos",0.70);
		maquina.cargarProducto(producto2, "A2", 6);
		
		Producto producto3=new Producto("KE35","Rufles",0.95);
		maquina.cargarProducto(producto3, "A3", 5);
		
		Producto producto4=new Producto("D457","Popetas",0.65);
		maquina.cargarProducto(producto4, "A4", 6);
		
		Producto producto5=new Producto("KE36","Galletas",0.45);
		maquina.cargarProducto(producto5, "A5", 6);
		
		Producto producto6=new Producto("D458","Tostado",0.55);
		maquina.cargarProducto(producto6, "A6", 6);
		
		ArrayList<Producto> plL=maquina.buscarMenores(1.10);
		System.out.println("Productos Menores: "+ plL.size());
		
		Producto pmS;
		for(int a=0;a<plL.size();a++) {
			pmS=plL.get(a);
			System.out.println("Nombre Producto: "+ pmS.getNombre()+" Precio: "+pmS.getPrecio());
		}
		
	
	}

}
