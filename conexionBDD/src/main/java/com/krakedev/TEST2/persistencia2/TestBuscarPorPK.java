package com.krakedev.TEST2.persistencia2;

import com.krakedev.entidades2.Estudiantes;
import com.krakedev.persistencia.servicio2.AdminEstudiantes;

public class TestBuscarPorPK {

	public static void main(String[] args) {
		Estudiantes e;
		try {
			e=AdminEstudiantes.buscarPorClavePrimaria("2134657890");
			System.out.println(e.toString());
		} catch (Exception e1) {
			System.out.println("Error en el Sistema: " +e1.getMessage());
		}
	}

}
