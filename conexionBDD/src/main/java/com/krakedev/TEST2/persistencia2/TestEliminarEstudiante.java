package com.krakedev.TEST2.persistencia2;

import com.krakedev.persistencia.servicio2.AdminEstudiantes;

public class TestEliminarEstudiante {

	public static void main(String[] args) {
		try {
			AdminEstudiantes.Eliminar("1234567890");
			AdminEstudiantes.Eliminar("2134657890");
		} catch (Exception e) {
			System.out.println("Error en el Sistema: " +e.getMessage());
		}
	}

}
