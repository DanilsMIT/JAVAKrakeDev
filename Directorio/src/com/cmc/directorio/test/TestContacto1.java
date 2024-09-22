package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf=new Telefono("Claro","0924527");
		Contacto c=new Contacto("BroAdrian",telf,72.9);
		c.imprimirCInfo();		

	}

}
