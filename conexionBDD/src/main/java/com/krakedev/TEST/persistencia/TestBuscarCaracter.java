package com.krakedev.TEST.persistencia;

import java.util.ArrayList;

import com.krakedev.entidades.Persona;
import com.krakedev.persistencia.servicio.AdminPersonas;

public class TestBuscarCaracter {

	public static void main(String[] args) {
		ArrayList<Persona> personaBuscada=new ArrayList<Persona>();
		try {
			personaBuscada=AdminPersonas.buscarPorNombreCaracter("O");
			System.out.println(personaBuscada);
		} catch (Exception e) {
			System.out.println("Error en el Sistema: " +e.getMessage());
		}
	}

}
