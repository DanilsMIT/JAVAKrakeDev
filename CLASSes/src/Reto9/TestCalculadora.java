package com.Reto9;

public class TestCalculadora {

	public static void main(String[] args) {
		CalculadoraJava calculator;
		calculator =new CalculadoraJava();
		
		int rsuma;
		double rresta;
		double rmultiplicacion;
		double rdivision;
		
		rsuma=calculator.suma(3, 4);
		rresta=calculator.resta(5.20,2.25);
		rmultiplicacion=calculator.multiplicar(237.2,2.3);
		rdivision=calculator.dividir(1, 4);
		
		System.out.println("Resultado suma: "+rsuma);
		System.out.println("Resultado resta: "+rresta);
		System.out.println("Resultado producto: "+rmultiplicacion);
		System.out.println("Resultado division: "+rdivision);
		
		calculator.mostrarMensaje();
	}

}
