package com.cmc.evaluacion;

public class CalculadoraAmortizacionAleman {
	public void interesTotalPagado(Prestamo p) {
		double iT = 0;
		Cuota c;
		for (int d = 0; d < p.getCuotas().size(); d++) {
			c = p.getCuotas().get(d);
			iT = iT + c.getAbonoAlInteres();
		}

		System.out.println("Cantidad de Interes pagado: " + Cuota.utilitario(iT));
	}

	public double calcularAmortizacion(Prestamo prestamo) {
		double coutaMensual;

		coutaMensual = prestamo.getMonto() / prestamo.getPlazo();

		return coutaMensual;
	}

	public void calcularValoresCuota(double i, Cuota cActual, Cuota cSiguiente) {
		double interesDecimal = (i / 100) ;
		double AbonoAlInteres = cActual.getCapitalInicio() * interesDecimal;
		double AbonoACuota = AbonoAlInteres + cActual.getAbonoAlCapital();
		double saldoPendiente = cActual.getCapitalInicio() - cActual.getAbonoAlCapital();

		cActual.setAbonoAlInteres(AbonoAlInteres);
		cActual.setCouta(AbonoACuota);
		cActual.setNewCapitalSaldo(saldoPendiente);
		cSiguiente.setCapitalInicio(saldoPendiente);

	}

	public void calcularValoresCuotaF(double i, Cuota cActual, Cuota cPasada) {
		double interesDecimal = (i / 100);
		double AbonoAlInteres = cActual.getCapitalInicio() * interesDecimal;
		double AbonoACuota = AbonoAlInteres + cActual.getAbonoAlCapital();
		double saldoPendiente = cActual.getCapitalInicio() - cActual.getAbonoAlCapital();

		cActual.setAbonoAlInteres(AbonoAlInteres);
		cActual.setCouta(AbonoACuota);
		cActual.setNewCapitalSaldo(saldoPendiente);
		
		double abonoPasado=cActual.getNewCapitalSaldo()*-1;
		double capitalPast=cPasada.getNewCapitalSaldo()+abonoPasado;
		cPasada.setNewCapitalSaldo(capitalPast);
		cActual.setNewCapitalSaldo(0);
		
	}

	public void generarTabla(Prestamo prm) {
		double cuotaAmortizacion = calcularAmortizacion(prm);
		Cuota C;
		for (int c = 0; c < prm.getCuotas().size(); c++) {
			C = new Cuota(c + 1);
			C.setAbonoAlCapital(cuotaAmortizacion);
			if (c == 0) {
				C.setCapitalInicio(prm.getMonto());
			}
			prm.getCuotas().set(c, C);
		}

		Cuota CuL;
		Cuota CuL2;
		System.out.println("No" + " | " + "Cuota" + " | " + "CapitalInicial" + " | " + "interes" + " | "
				+ "Amortizacion" + " | " + "Saldo Pendiente");
		System.out.println("======================================================================");

		for (int d = 0; d < prm.getCuotas().size() - 1; d++) {

			CuL = prm.getCuotas().get(d);
			CuL2 = prm.getCuotas().get(d + 1);
			calcularValoresCuota(prm.getInteres(), CuL, CuL2);

			if (d == prm.getCuotas().size() - 2) {
				calcularValoresCuotaF(prm.getInteres(), CuL2, CuL);

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
