package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono T1=new Telefono("Claro","09872667");
		T1.setCodigo(10);
		Contacto C1=new Contacto("Dain",T1,82.7);
		
		AdminTelefono AT=new AdminTelefono();
		AdminContactos AC=new AdminContactos();
		AT.activarMensajeria(T1);
		AC.activarUsuario(C1);

		System.out.println("=========");
		System.out.println("Datos Cliente");
		C1.imprimirCInfo();
		System.out.println("=========");
		System.out.println("Datos Telefono");
		T1.ImprimirInfo();
		
		System.out.println("=========");
		System.out.println("=========");
		System.out.println("=========");
		System.out.println("Cambio de Operadora");
		
		T1.setOperadora("Movi");
		AT.activarMensajeria(T1);
		AC.activarUsuario(C1);
		
		System.out.println("=========");
		System.out.println("Datos Cliente");
		C1.imprimirCInfo();
		System.out.println("=========");
		System.out.println("Datos Telefono");
		T1.ImprimirInfo();
		
		
	}

}
