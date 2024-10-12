package com.krakedev.estaticos.ejercicio.entidades;

import com.krakedev.estaticos.ejercicio.utils.Util;

public class Alarma {
	private int día;
	private int hora;
	private int minuto;
	
	public String toString() {
		return "Alarma ["+Util.formatearDía(día)+", "+Util.formatearHora(hora)+minuto+"]"; 
	}
	
	public Alarma(int día, int hora, int minuto) {
		super();
		this.día = día;
		this.hora = hora;
		this.minuto = minuto;
	}
	public int getDía() {
		return día;
	}
	public void setDía(int día) {
		this.día = día;
	}
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinuto() {
		return minuto;
	}
	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}
	
	
}
