package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas;
	/// interes anual, convertido a decimal correspondiente al mes
	/// plazo de años convertido en meses
	/// monto corresponde al capital prestado y a pagar
	
	public void mostrarPrestamo() {
		System.out.println("Monto: "+monto+", Interes: "+interes+"%, Plazos: "+plazo);
	}
	
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		
		ArrayList<Cuota> CL= new ArrayList<Cuota>();
		for(int i=1;i<=plazo;i++) {
			Cuota c=new Cuota(i);
			CL.add(c);
		}
		cuotas=CL;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}
	
	
	
}
