package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Telefono;

public class TestTelefono {

	public static void main(String[] args) {
		Telefono telf=new Telefono("Movi","09941234123");
		telf.setCodigo(10);
		telf.ImprimirInfo();
	}

}
