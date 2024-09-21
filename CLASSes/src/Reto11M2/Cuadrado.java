package Reto11M2;

public class Cuadrado {
	private double lado;

	public double calculoarea() {
		double r;
		r = Math.pow(lado, 2);
		return r;
	}

	public double calculoperimetro() {
		double r = lado * 4;
		return r;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	
}
