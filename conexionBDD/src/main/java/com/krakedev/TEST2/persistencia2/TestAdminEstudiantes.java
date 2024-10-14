package com.krakedev.TEST2.persistencia2;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.TEST.persistencia.ConvertorDateTime;
import com.krakedev.entidades2.Estudiantes;
import com.krakedev.entidades2.Maestros;
import com.krakedev.persistencia.servicio.AdminPersonas;
import com.krakedev.persistencia.servicio2.AdminEstudiantes;

public class TestAdminEstudiantes {
	public static void main(String[] args) {
		Maestros m1 = new Maestros(1805, "Profe Alex");
		Maestros m2 = new Maestros(1806, "Profe David");

		Estudiantes S = new Estudiantes("1234567890", "Julián", "Martínez", "julian.martinez@example.com", m1);
		Estudiantes S2 = new Estudiantes("2134657890", "Adrian", "Toledo", "adrian.toledo@example.com", m1);
		Date eBD= null;
		Date SBD= null;
		try {
			eBD = ConvertorDateTime.conversorFecha("2003/08/13");
			SBD = ConvertorDateTime.conversorFecha("2002/10/21");
			
			S.setBirth_date(eBD);
			S2.setBirth_date(SBD);
			AdminEstudiantes.Insertar(S);
			AdminEstudiantes.Insertar(S2);
		} catch (Exception e) {
			System.out.println("Error en el Sistema: " +e.getMessage());
		}
	}
}
