package com.entidades;

public class Random {
	public static int obtenerPosicion() {
		double aleatorio = 0;
		int posicion = 0;
		
		aleatorio=(Math.random()*52);
		posicion=(int)aleatorio;
		return posicion;
		
	}
}
