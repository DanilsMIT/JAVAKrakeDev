package com.krakedev.persistencia.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.servicio.AdminPersonas;

public class ConexionBDD {
	private final static String DRIVER="org.postgresql.Driver";
	private final static String URL="jdbc:postgresql://localhost:5432/postgres";
	private final static String USER="postgres";
	private final static String PASS="Anexo377";
	private static final Logger LOGGER=LogManager.getLogger(AdminPersonas.class);

	public static Connection conexion() throws Exception {
		
		Connection C=null;
		try {
			Class.forName(DRIVER);
			C = DriverManager.getConnection(URL,USER,PASS);
			LOGGER.trace("CONEXION SQL EXITOSA");
		} catch (ClassNotFoundException e) {
			LOGGER.error("Error de infraestructura",e);
			throw new Exception("Error de infraestructura");
		}catch( SQLException e) {
			LOGGER.error("Error de autentificacion, USUARIO o CONTRAASEÑA incorrectos",e);
			throw new Exception("Error de autentificacion, USUARIO o CONTRAASEÑA incorrectos");
		}
		return C;
	}
}
