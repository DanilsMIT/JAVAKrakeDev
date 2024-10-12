package com.cmc.evaluacion.test;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCalculadora {

	public static void main(String[] args) {
		///Monto - interes% - plazo en años
		Prestamo prestamo=new Prestamo(70000,7,15*12);
		//Calculadora seteada en: mensual
		CalculadoraAmortizacion CA=new CalculadoraAmortizacion();
		CA.generarTabla(prestamo);
		CA.interesTotalPagado(prestamo);
		}
	}
	
