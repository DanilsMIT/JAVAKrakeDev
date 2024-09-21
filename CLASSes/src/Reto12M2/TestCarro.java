package Reto12M2;

public class TestCarro {

	public static void main(String[] args) {
		Carro auto1;
		Carro auto2;
		auto1 = new Carro("Chevrolet",2015,15.250);
		auto2 = new Carro("Nissan",2004,8.700);

		System.out.println("Carro 1 Marca: " + auto1.getMarca());
		System.out.println("Carro 1 año: " + auto1.getAge());
		System.out.println("Carro 1 precio: " + auto1.getPrecio());

		System.out.println("Carro 2 Marca: " + auto2.getMarca());
		System.out.println("Carro 2 año: " + auto2.getAge());
		System.out.println("Carro 2 precio: " + auto2.getPrecio());

	}

}
