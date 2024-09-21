package Reto10M2;

public class Rectangulo {
	public double longitud;
	public double ancho;
	
	public double calculoperimetro() {
		
		double result=2*(longitud+ancho);
		return result;
	}

	public double calculoarea() {
		
		double result=longitud*ancho;
		return result;
	}
}
