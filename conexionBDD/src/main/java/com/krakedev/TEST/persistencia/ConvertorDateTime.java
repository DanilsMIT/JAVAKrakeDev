package com.krakedev.TEST.persistencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicio.AdminPersonas;

public class ConvertorDateTime {
	private static final String Fecha_Format="yyyy/MM/dd";
	private static final String Hora_Format="hh:mm";
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);

	public static Date conversorFecha(String Fecha) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat(Fecha_Format);
		Date D=null;
		try {
			D=sdf.parse(Fecha);
			LOGGER.trace("FECHA CONVERTIDA");
		} catch (ParseException e) {
			LOGGER.error("Formato incorrecto de Fecha"+Fecha,e);
			throw new Exception("Formato incorrecto de Fecha"+Fecha);
		}
		
		return D;
	}
	
	public static Date conversorHora(String Hora) throws Exception {
		SimpleDateFormat sdf=new SimpleDateFormat(Hora_Format);
		Date T=null;
		try {
			T=sdf.parse(Hora);
			LOGGER.trace("HORA CONVERTIDA");
		} catch (ParseException e) {
			LOGGER.error("Formato incorrecto de Hora"+Hora,e);
			throw new Exception("Formato incorrecto de Hora"+Hora);
		}
		
		return T;
	} 
}
