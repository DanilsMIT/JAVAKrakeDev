package com.krakedv;

public class TestCarro {

	public static void main(String[] args) {
		Carro auto1;
		Carro auto2;
		auto1 = new Carro();
		auto2 = new Carro();

		auto1.marca = "Chevrolet";
		auto1.age = 2015;
		auto1.precio = 15.250;

		auto2.marca = "Nissan";
		auto2.age = 2004;
		auto2.precio = 8.700;

		System.out.println("Carro 1 Marca: " + auto1.marca);
		System.out.println("Carro 1 año: " + auto1.age);
		System.out.println("Carro 1 precio: " + auto1.precio);

		System.out.println("Carro 2 Marca: " + auto2.marca);
		System.out.println("Carro 2 año: " + auto2.age);
		System.out.println("Carro 2 precio: " + auto2.precio);

	}

}
