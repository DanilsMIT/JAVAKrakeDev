package com.krakedev.persistencia.servicio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static void Eliminar(String cedulaP) throws Exception {
		Connection CONX = null;
		PreparedStatement PS = null;
		try {
			// Conexion OPEN
			CONX = ConexionBDD.conexion();
			PS = CONX.prepareStatement("Delete from persona where cedula = ?");
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

	public static void Actualizar(Persona p) throws Exception {
		Connection CONX = null;
		PreparedStatement PS = null;
		try {
			// Conexion OPEN
			CONX = ConexionBDD.conexion();
			PS = CONX.prepareStatement(
					"update persona set nombre = ?, apellido = ?, estatura = ?, estado_civil = ?, numero_hijos = ?, fecha_nacimiento = ?, hora_nacimiento = ?, cantidad_ahorrada = ? "
							+ "where cedula = ?");
			PS.setString(1, p.getNombre());
			PS.setString(2, p.getApellido());
			PS.setDouble(3, p.getEstatura());
			PS.setString(4, p.getEstado_civil().getCode());
			PS.setInt(5, p.getNumero_hijos());
			PS.setDate(6, new java.sql.Date(p.getFecha_nacimiento().getTime()));
			PS.setTime(7, new java.sql.Time(p.getHora_nacimiento().getTime()));
			PS.setBigDecimal(8, p.getCantidadAhorrada());
			PS.setString(9, p.getCedula());

			PS.executeUpdate();
		} catch (Exception e) {
			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actualizar");
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

	public static void Insertar(Persona p) throws Exception {

		Connection CONX = null;
		PreparedStatement PS = null;
		try {
			// Conexion OPEN
			CONX = ConexionBDD.conexion();
			PS = CONX.prepareStatement(
					"insert into persona (cedula, nombre, apellido, estatura,estado_civil ,numero_hijos, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada)"
							+ "values(?,?,?,?,?,?,?,?,?)");
			PS.setString(1, p.getCedula());
			PS.setString(2, p.getNombre());
			PS.setString(3, p.getApellido());
			PS.setDouble(4, p.getEstatura());
			PS.setString(5, p.getEstado_civil().getCode());
			PS.setInt(6, p.getNumero_hijos());
			PS.setDate(7, new java.sql.Date(p.getFecha_nacimiento().getTime()));
			PS.setTime(8, new java.sql.Time(p.getHora_nacimiento().getTime()));
			PS.setBigDecimal(9, p.getCantidadAhorrada());

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
