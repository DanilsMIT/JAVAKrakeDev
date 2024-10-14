package com.krakedev.ejerciciosLOG;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Admin {
	private static Logger Logger=LogManager.getLogger(Admin.class);
	
	public void agregar() {
		Logger.warn("Ingresando a warn...");
		Logger.info("Ingresando a info...");
		Logger.debug("Ingresando a debug...");
		Logger.trace("Ingresando a trace...");
		
		
		Logger.error("Ingresando a error...");
	}
}
