package com.cmc.repaso.test;

import com.cmc.repaso.entidades.validarMonto;

public class TestValidacion {

	public static void main(String[] args) {
		validarMonto v1=new validarMonto();
		boolean rv1=v1.Validacion(2.30);
		boolean rv2=v1.Validacion(-1);
		
		System.out.println(rv1);
		System.out.println(rv2);

	}
}
