package Reto12M2;

public class Carro {
	private String marca;
	private int age;
	private double precio;
	
	//constructor
	public Carro(String marca, int age, double precio) {
		this.marca=marca;
		this.age=age;
		this.precio=precio;
	}
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
}
