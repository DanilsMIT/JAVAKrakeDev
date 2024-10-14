package com.krakedev.TEST2.persistencia2;

import java.util.Date;

import com.krakedev.TEST.persistencia.ConvertorDateTime;
import com.krakedev.entidades2.Estudiantes;
import com.krakedev.entidades2.Maestros;
import com.krakedev.persistencia.servicio2.AdminEstudiantes;

public class TestActualizarEstudiante {
	public static void main(String[] args) {
		Maestros m1 = new Maestros(1805, "Profe Alex");
		Maestros m2 = new Maestros(1806, "Profe David");
		
		Estudiantes S = new Estudiantes("1234567890", "Julio", "Martínez", "martinez.julio@example.com", m2);
		Date bd=null;
		try {
			bd = ConvertorDateTime.conversorFecha("2003/09/18");
			S.setBirth_date(bd);
			AdminEstudiantes.Actualizar(S);
		} catch (Exception e) {
			System.out.println("Error en el Sistema: " +e.getMessage());
		}
	}
}
