package com.cmc.evaluacion.test;

import com.cmc.evaluacion.Cuota;

public class TestImpresion {

	public static void main(String[] args) {
		Cuota C=new Cuota(1);
		
		C.setCouta(444.23456);
		C.setCapitalInicio(5000.000000000000);
		C.setAbonoAlInteres(50.000);
		C.setAbonoAlCapital(394.241);
		C.setNewCapitalSaldo(4605.763);
		
		C.mostrarPrestamo();
	}

}
