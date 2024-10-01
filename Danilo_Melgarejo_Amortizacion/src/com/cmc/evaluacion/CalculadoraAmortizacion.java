package com.cmc.evaluacion;

import java.util.ArrayList;

public class CalculadoraAmortizacion {

	public double calcularCuota(Prestamo prestamo) {
		double coutaMensual;
		double interesMensual;

		interesMensual = (prestamo.getInteres() * 0.01) / 12;
		coutaMensual = (prestamo.getMonto() * interesMensual)
				/ (1 - (Math.pow(1 + interesMensual, -prestamo.getPlazo())));
		return coutaMensual;
	}

	public void calcularValoresCuota(double i, Cuota cActual, Cuota cSiguiente) {
		double interesDecimal = (i/100) / 12;
		double AbonoAlInteres = cActual.getCapitalInicio() * interesDecimal;
		double AbonoAlCapital = cActual.getCouta() - AbonoAlInteres;
		double saldoPendiente = cActual.getCapitalInicio() - AbonoAlCapital;

		cActual.setAbonoAlInteres(AbonoAlInteres);
		cActual.setAbonoAlCapital(AbonoAlCapital);
		cActual.setNewCapitalSaldo(saldoPendiente);
		cSiguiente.setCapitalInicio(saldoPendiente);
		
}
	
	public void calcularValoresCuotaF(double i, Cuota cActual) {
		double interesDecimal = (i/100) / 12;
		double AbonoAlInteres = cActual.getCapitalInicio() * interesDecimal;
		double AbonoAlCapital = cActual.getCouta() - AbonoAlInteres;
		double saldoPendiente = cActual.getCapitalInicio() - AbonoAlCapital;

		cActual.setAbonoAlInteres(AbonoAlInteres);
		cActual.setAbonoAlCapital(AbonoAlCapital);
		cActual.setNewCapitalSaldo(saldoPendiente);
		
		
		cActual.setCouta(cActual.getCouta() + cActual.getNewCapitalSaldo());
		cActual.setNewCapitalSaldo(0);

	}


	public void generarTabla(Prestamo prm) {
		double cuotaMes = Cuota.utilitario(calcularCuota(prm));
		Cuota C;
		for (int c = 0; c < prm.getCuotas().size(); c++) {
			C = new Cuota(c + 1);
			C.setCouta(cuotaMes);
			if (c == 0 ) {
				C.setCapitalInicio(prm.getMonto());
			}
			prm.getCuotas().set(c, C);
		}

		Cuota CuL;
		Cuota CuL2;
		System.out.println("No" + " | " + "Cuota" + " | " + "CapitalInicial" + " | " + "interes" + " | " + "Amortizacion" + " | "
				+ "Saldo Pendiente");
		System.out.println("======================================================================");

		for (int d = 0; d < prm.getCuotas().size() - 1; d++) {

			CuL = prm.getCuotas().get(d);
			CuL2 = prm.getCuotas().get(d + 1);
			calcularValoresCuota(prm.getInteres(), CuL, CuL2);

			if (d == prm.getCuotas().size() - 2) {
				calcularValoresCuotaF(prm.getInteres(), CuL2);

			}
		}

		/// Una vez el arreglo tenga sus valores vamos a barrerlo para imprimir

		Cuota CcC;
		for (int i = 0; i < prm.getCuotas().size(); i++) {
			CcC = prm.getCuotas().get(i);
			CcC.mostrarPrestamo();
		}
		System.out.println("======================================================================");
	}
}
