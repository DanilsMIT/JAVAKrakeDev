package com.krakedev.persistencia.servicio;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.entidades.EstadoCivil;
import com.krakedev.entidades.Persona;
import com.krakedev.persistencia.utils.ConexionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getLogger(AdminPersonas.class);

	public static ArrayList<Persona> buscarPorNombreCaracter(String CaracterToSearch) throws Exception{
		ArrayList<Persona> PL= new ArrayList<Persona>();
		Connection CONX = null;
		PreparedStatement PS = null;
		ResultSet RS=null;
		try {
			CONX = ConexionBDD.conexion();
			PS=CONX.prepareStatement("select * from persona where nombre like ? ");
			PS.setString(1, "%"+CaracterToSearch+"%");
			RS=PS.executeQuery();
			
			while(RS.next()) {
				String cedula=RS.getString("cedula");
				String nombre=RS.getString("nombre");
				String apellido=RS.getString("apellido");
				Double estatura=RS.getDouble("estatura");
				String estado_civil=RS.getString("estado_civil");
				int numeroHijos=RS.getInt("numero_hijos");
				Date fechaNacimiento= RS.getDate("fecha_nacimiento");
				Time horaNacimiento=RS.getTime("hora_nacimiento");
				String saldo= RS.getString("cantidad_ahorrada");
				String saldoNS=saldo.replace("$", "").replace(",", "");
				Double CA=Double.parseDouble(saldoNS);
				String SA=Double.toString(CA);
				
				Persona p=new Persona();
				p.setCedula(cedula);
				p.setNombre(nombre);
				p.setApellido(apellido);
				p.setEstatura(estatura);
				p.setEstado_civil(new EstadoCivil(estado_civil,"Soltero/Unionlibre/Casado"));
				p.setNumero_hijos(numeroHijos);
				p.setFecha_nacimiento(fechaNacimiento);
				p.setHora_nacimiento(horaNacimiento);
				p.setCantidadAhorrada(new BigDecimal(SA));
				
				PL.add(p);
			}
			
		} catch (Exception e) {
			LOGGER.error("Error al Consultar", e);
			throw new Exception("Error al Consultar");
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

		return PL;
	}

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
