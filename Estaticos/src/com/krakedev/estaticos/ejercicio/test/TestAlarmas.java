package com.krakedev.estaticos.ejercicio.test;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarma;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		Alarma a1=new Alarma(DiasSemana.Miercoles,10,30);
		Alarma a2=new Alarma(DiasSemana.Sabado,12,25);
		Alarma a3=new Alarma(DiasSemana.Viernes,15,20);
		
		AdminAlarma aA=new AdminAlarma();
		aA.agregarAlarma(a1);
		aA.agregarAlarma(a2);
		aA.agregarAlarma(a3);
		
		for(int i=0;i<aA.getAlarmas().size();i++) {
			System.out.println(aA.getAlarmas().get(i).toString());
		}
	}
}
