package com.Reto9;

public class CalculadoraJava {
	public int suma(int a, int b) {
		int result;
		result=a+b;
		return result;
	}
	
	public double resta(double a, double b) {
		double result;
		result=a-b;
		return result;
	}
	
	public double multiplicar (double a, double b) {
		double result;
		result=a*b;
		return result;
	}
	
	public double dividir (double a, double b) {
		double result;
		result=a/b;
		return result;
	}
	
	public double promedio (double a, double b, double c) {
		double resultS;
		double resultD;
		
		resultS=a+b+c;
		resultD=resultS/3;
		return resultD;
	}
	
	public void mostrarMensaje() {
		System.out.println("Mi retorno será en 15 minutos, debido a encontrarme en la busqueda de alimento del medio día");
	}
}
