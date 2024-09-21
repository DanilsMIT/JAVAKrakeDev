package Reto10M2;

public class Cuadrado {
	public double lado;

	public double calculoarea() {
		double r;
		r = Math.pow(lado, 2);
		return r;
	}

	public double calculoperimetro() {
		double r = lado * 4;
		return r;
	}
}
