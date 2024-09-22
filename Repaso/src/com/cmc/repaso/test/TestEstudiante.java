package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante e=new Estudiante("Salieri");
		e.calificar(7.80);
		System.out.println("Estudiante 1");
		System.out.println(e.getScore());
		System.out.println(e.getResult());
		
		Estudiante e2=new Estudiante("Ciel");
		e2.calificar(8.80);
		System.out.println("Estudiante 2");
		System.out.println(e2.getScore());
		System.out.println(e2.getResult());
	}

}
