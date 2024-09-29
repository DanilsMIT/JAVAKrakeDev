package com.cmc.evaluacion.test;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCalculadora2 {

	public static void main(String[] args) {
		///Monto - interes% - plazo/12
		Prestamo prestamo=new Prestamo(500000,12,15);
		CalculadoraAmortizacion CA=new CalculadoraAmortizacion();
		CA.generarTabla(prestamo);
		
		///La logica de impresion resto 1 centavo a la ultima cuota porque eso es lo que de hecho sobro de más
		// de la penultima cuota
	}

}
