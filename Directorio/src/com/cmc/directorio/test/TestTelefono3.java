package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf1=new Telefono("Movi","098234234");
		telf1.setCodigo(10);
		
		Telefono telf2=new Telefono("Claro","097237234");
		telf2.setCodigo(20);
		
		Telefono telf3=new Telefono("Movi","099234234");
		telf3.setCodigo(10);
		
		AdminTelefono CM=new AdminTelefono();
		int cm=CM.contarMovi(telf1, telf2, telf3);
		
		System.out.println("Cantidad de telefonos Movi: "+cm);
	}

}
