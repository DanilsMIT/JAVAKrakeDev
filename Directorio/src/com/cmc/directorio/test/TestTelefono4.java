package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {

	public static void main(String[] args) {
		
		Telefono telf1=new Telefono("Movi","098234234");
		Telefono telf2=new Telefono("Claro","098234234");
		Telefono telf3=new Telefono("Claro","098234234");
		Telefono telf4=new Telefono("Claro","098234234");
		
		AdminTelefono cc=new AdminTelefono();
		int CC=cc.contarClaro(telf1, telf2, telf3, telf4);
		System.out.println("Cantidad de telefonos Claro: "+CC);
	}

}
