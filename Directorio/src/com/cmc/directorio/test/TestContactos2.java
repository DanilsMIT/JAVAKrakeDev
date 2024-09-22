package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono T1=new Telefono("Movi","09872667");
		Telefono T2=new Telefono("Claro","09879267");
		T1.setCodigo(10);
		T2.setCodigo(20);
		
		Contacto C1=new Contacto("Sara",T1,72.8);
		Contacto C2=new Contacto("Barbara",T2,73.4);
		
		AdminTelefono AT=new AdminTelefono();
		AdminContactos AC=new AdminContactos();
		AT.activarMensajeria(T1);
		AT.activarMensajeria(T2);
		AC.activarUsuario(C1);
		AC.activarUsuario(C2);

		System.out.println("=========");
		System.out.println("Cliente 1");
		C1.imprimirCInfo();
		System.out.println("=========");
		System.out.println("Cliente 2");
		C2.imprimirCInfo();
		
		String MP=AC.buscarMasPesado(C1, C2);

		System.out.println("=========");
		System.out.println("Quien mas pesa: "+MP);
		System.out.println("=========");
		
		boolean CO=AC.comprarOperadoras(C1, C2);
		System.out.println("=========");
		System.out.println("Operadoras iguales: "+CO);
		System.out.println("=========");
	}

}
