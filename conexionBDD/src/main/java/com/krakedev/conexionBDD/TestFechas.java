package com.krakedev.conexionBDD;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		//Date - java.util.date
		//Date - java.sql.date
		
		SimpleDateFormat sf=new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		String fechaSDF="2002/06/03 11:05:03";
		try {
			Date date=sf.parse(fechaSDF);
			long fechaMilS=date.getTime();
			
			java.sql.Date dateSQL= new java.sql.Date(fechaMilS);
			Time timeSQL= new Time(fechaMilS);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
