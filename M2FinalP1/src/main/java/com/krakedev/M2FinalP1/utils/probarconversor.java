package com.krakedev.M2FinalP1.utils;

import java.util.Date;

public class probarconversor {

	public static void main(String[] args) {
		String f="2020-10-28 12:23:00";
		try {
			Date d=Convertidor.convertirFecha(f);
			System.out.println(d);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
