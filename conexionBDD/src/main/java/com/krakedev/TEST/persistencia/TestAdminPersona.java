package com.krakedev.TEST.persistencia;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.entidades.EstadoCivil;
import com.krakedev.entidades.Persona;
import com.krakedev.persistencia.servicio.AdminPersonas;

public class TestAdminPersona {

	public static void main(String[] args) {
		EstadoCivil E1=new EstadoCivil("U","Union Libre");
		EstadoCivil E2=new EstadoCivil("C","Casado");
		EstadoCivil E3=new EstadoCivil("S","Soltero");
		
		Persona p1=new Persona("6990453734","SOLDADO","UNO",E3);
		p1.setEstatura(1.70);
		p1.setNumero_hijos(3);
		
		Date FechN = null;
		Date HoraN = null;
		try {
			FechN = ConvertorDateTime.conversorFecha("2002/08/12");
			HoraN=ConvertorDateTime.conversorHora("10:43");
			p1.setFecha_nacimiento(FechN);
			p1.setHora_nacimiento(HoraN);
			p1.setCantidadAhorrada(new BigDecimal(1030.70));

			System.out.println(p1);
		} catch (Exception e) {
			System.out.println("Error en el Sistema: " +e.getMessage());
		}
		
	
	}

}
