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
		DecimalFormat dr=new DecimalFormat("#.##");
		String decimalR=dr.format(d);
		double drc=Double.parseDouble(decimalR);
		return drc;
	}
	
	public void mostrarPrestamo() {
		String c1=String.format("%.2f", couta);
		String cI1=String.format("%.2f", capitalInicio);
		String aI1=String.format("%.2f", abonoAlInteres);
		String aC1=String.format("%.2f", abonoAlCapital);
		String nCs1=String.format("%.2f", newCapitalSaldo);
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
