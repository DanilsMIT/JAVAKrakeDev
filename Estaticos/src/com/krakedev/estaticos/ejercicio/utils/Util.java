package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	
	public static String formatearHora(int i) {
		String iS=i+"";
		
		String valor="0";
		if(i>=1 && i<=9) {
			valor+=iS;
			valor+=":";
			return valor;
		}else {
			return iS+":";
		}
	}
	public static String formatearDía(int i) {
		String c = null;
		if(i==DiasSemana.Lunes) {
			c="Lunes";
		}else if(i==DiasSemana.Martes) {
			c="Martes";
		}else if(i==DiasSemana.Miercoles) {
			c="Miercoles";
		}else if(i==DiasSemana.Jueves) {
			c="Jueves";
		}else if(i==DiasSemana.Viernes) {
			c="Viernes";
		}else if(i==DiasSemana.Sabado) {
			c="Sabado";
		}else if(i==DiasSemana.Domingo) {
			c="Domingo";
		}
		return c;
	}

}

