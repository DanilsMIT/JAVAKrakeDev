package com.cmc.evaluacion.test;

import java.text.DecimalFormat;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Cuota;
import com.cmc.evaluacion.Prestamo;

public class TestCuota {

	public static void main(String[] args) {
		CalculadoraAmortizacion cA=new CalculadoraAmortizacion();
		double couta=Cuota.utilitario(cA.calcularCuota(new Prestamo(5000,12,12)));
		System.out.println(couta);
	}

}
