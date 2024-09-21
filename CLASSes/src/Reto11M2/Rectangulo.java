package Reto11M2;

public class Rectangulo {
	private double longitud;
	private double ancho;
	
	public double calculoperimetro() {
		
		double result=2*(longitud+ancho);
		return result;
	}

	public double calculoarea() {
		
		double result=longitud*ancho;
		return result;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	
	
}
