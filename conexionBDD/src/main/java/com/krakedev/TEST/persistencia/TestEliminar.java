package com.krakedev.TEST.persistencia;

import com.krakedev.persistencia.servicio.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
		try {
			AdminPersonas.Eliminar("7890123456");
		} catch (Exception e) {
			System.out.println("Error en el Sistema: " +e.getMessage());
		}
	}

}
