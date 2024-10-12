package com.cmc.evaluacion.test;

import com.cmc.evaluacion.CalculadoraAmortizacionAleman;
import com.cmc.evaluacion.Prestamo;

public class TestCalculadora2 {

	public static void main(String[] args) {
		///Monto - interes% - plazos
		Prestamo prestamo=new Prestamo(18000,4.25,4);
		//Calculadora seteada en: Anual
		CalculadoraAmortizacionAleman CA=new CalculadoraAmortizacionAleman();
		CA.generarTabla(prestamo);
		CA.interesTotalPagado(prestamo);
	

}}
