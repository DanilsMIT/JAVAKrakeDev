package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item I1=new Item("Nagitana",20);
		
		System.out.println("=================");
		System.out.println("Inventario actual");
		System.out.println("=================");
		I1.ImprimirStock();
		
		I1.vender(12);
		I1.devolver(2);
		
		System.out.println("=================");
		System.out.println("Inventario Actualizado");
		System.out.println("=================");
		I1.ImprimirStock();
	}

}
