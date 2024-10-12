package com.krakedev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarma {
	private ArrayList<Alarma> alarmas;
	
	public void agregarAlarma(Alarma a) {
		alarmas.add(a);
	}
	
	public AdminAlarma() {
		ArrayList<Alarma> a=new ArrayList<Alarma>();
		this.alarmas = a;
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}	
}
