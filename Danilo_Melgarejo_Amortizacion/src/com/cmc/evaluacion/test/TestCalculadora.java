package com.cmc.evaluacion.test;

import com.cmc.evaluacion.CalculadoraAmortizacion;
import com.cmc.evaluacion.Prestamo;

public class TestCalculadora {

	public static void main(String[] args) {
		///Monto - interes% - plazo/12
		Prestamo prestamo=new Prestamo(300000,3,180);
		CalculadoraAmortizacion CA=new CalculadoraAmortizacion();
		CA.generarTabla(prestamo);
			
		}
	}
	
/// La ultima cuota subio un poco porque era lo que faltaba por pagar en saldo pendiente