package com.krakedev.persistencia.servicio2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.entidades.Persona;
import com.krakedev.entidades2.Estudiantes;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminEstudiantes {
	private static final Logger LOGGER = LogManager.getLogger(AdminEstudiantes.class);
	
	public static void Eliminar(String cedulaP) throws Exception {
		Connection CONX = null;
		PreparedStatement PS = null;
		try {
			// Conexion OPEN
			CONX = ConexionBDD.conexion();
			PS = CONX.prepareStatement("Delete from students where CI = ?");
			PS.setString(1, cedulaP);
			PS.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al eliminar", e);
			throw new Exception("Error al eliminar");
		} finally {
			// Conexion CLOSING
			try {
				CONX.close();
				PS.close();
				// Conexion CLOSED
			} catch (SQLException e) {
				LOGGER.error("Error al cerrar la conexion", e);
				throw new Exception("Error al cerrar la conexion");
				// Error al cerrar conexion
			}
		}
	}
	
	
	public static void Actualizar(Estudiantes s) throws Exception {
		Connection CONX = null;
		PreparedStatement PS = null;
		try {
			// Conexion OPEN
			CONX = ConexionBDD.conexion();
			PS = CONX.prepareStatement(
					"UPDATE students SET nombre = ? , apellido = ? , email = ? , code_teacher = ? , birth_date = ? "
							+ "where CI = ?");
			PS.setString(1, s.getNombre());
			PS.setString(2, s.getApellido());
			PS.setString(3, s.getEmail());
			PS.setInt(4, s.getCode_teacher().getCodigo());
			PS.setDate(5, new java.sql.Date(s.getBirth_date().getTime()));
			PS.setString(6, s.getCI());
			PS.executeUpdate();
			
		}catch (Exception e) {
			LOGGER.error("Error al Actualizar", e);
			throw new Exception("Error al insertar");
		} finally {
			// Conexion CLOSING
			try {
				CONX.close();
				PS.close();
				// Conexion CLOSED
			} catch (SQLException e) {
				LOGGER.error("Error al cerrar la conexion", e);
				throw new Exception("Error al cerrar la conexion");
				// Error al cerrar conexion
			}
		}
	}
	
	public static void Insertar(Estudiantes s) throws Exception {

		Connection CONX = null;
		PreparedStatement PS = null;
		try {
			// Conexion OPEN
			CONX = ConexionBDD.conexion();
			PS = CONX.prepareStatement(
					"insert into students (CI, nombre, apellido, email, code_teacher, birth_date)"
							+ "values(?,?,?,?,?,?)");
			PS.setString(1, s.getCI());
			PS.setString(2, s.getNombre());
			PS.setString(3, s.getApellido());
			PS.setString(4, s.getEmail());
			PS.setInt(5, s.getCode_teacher().getCodigo());
			PS.setDate(6, new java.sql.Date(s.getBirth_date().getTime()));
			
			PS.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al insertar", e);
			throw new Exception("Error al insertar");
		} finally {
			// Conexion CLOSING
			try {
				CONX.close();
				PS.close();
				// Conexion CLOSED
			} catch (SQLException e) {
				LOGGER.error("Error al cerrar la conexion", e);
				throw new Exception("Error al cerrar la conexion");
				// Error al cerrar conexion
			}
		}
	}
}
