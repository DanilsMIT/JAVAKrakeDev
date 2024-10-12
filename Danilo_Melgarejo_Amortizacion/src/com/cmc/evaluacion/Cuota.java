package com.cmc.evaluacion;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Cuota {
	private int numero;
	private double couta;
	private double capitalInicio;
	private double abonoAlInteres;
	private double abonoAlCapital;
	private double newCapitalSaldo;
	
	public static double utilitario(double d) {
		String s=String.format("%.2f", d);
		double dr=Double.parseDouble(s);
		return dr;
	}
	
	public void mostrarPrestamo() {
		double c1=utilitario(couta);
		double cI1=utilitario(capitalInicio);
		double aI1=utilitario(abonoAlInteres);
		double aC1=utilitario(abonoAlCapital);
		double nCs1=utilitario(newCapitalSaldo);
		System.out.println(numero+" | "+c1+" | "+cI1+" | "+aI1+" | "+aC1+" | "+nCs1);
	}
	
	public Cuota(int numero) {
		this.numero = numero;
	}
	public double getCouta() {
		return couta;
	}
	public void setCouta(double couta) {
		this.couta = couta;
	}
	public double getCapitalInicio() {
		return capitalInicio;
	}
	public void setCapitalInicio(double capitalInicio) {
		this.capitalInicio = capitalInicio;
	}
	public double getAbonoAlInteres() {
		return abonoAlInteres;
	}
	public void setAbonoAlInteres(double abonoAlInteres) {
		this.abonoAlInteres = abonoAlInteres;
	}
	public double getAbonoAlCapital() {
		return abonoAlCapital;
	}
	public void setAbonoAlCapital(double abonoAlCapital) {
		this.abonoAlCapital = abonoAlCapital;
	}
	public double getNewCapitalSaldo() {
		return newCapitalSaldo;
	}
	public void setNewCapitalSaldo(double newCapital) {
		this.newCapitalSaldo = newCapital;
	}	
}
