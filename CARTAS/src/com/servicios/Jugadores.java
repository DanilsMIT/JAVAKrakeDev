package com.servicios;

import java.util.ArrayList;

public class Jugadores {
	private ArrayList<String> jugadores;
	
	public Jugadores() {
		ArrayList<String> plys=new ArrayList<String>();
		jugadores=plys;
	}

	public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
}
