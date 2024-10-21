package com.krakedev.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.conexion.ConexionBDD;
import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.krakedevException;

public class ClientsBDD {
	
	public ArrayList<Cliente> recuperarClientesPorNhijos(int nhijos) throws krakedevException {
		ArrayList<Cliente> cl = new ArrayList<Cliente>();
		Connection CON = null;
		PreparedStatement PS = null;
		Cliente c = null;
		try {
			CON = ConexionBDD.obtenerConexion();
			PS = CON.prepareStatement("Select cedula, nombre, numeroHijos from clientes where numeroHijos >= ? ");
			PS.setInt(1, nhijos);
			ResultSet RS = PS.executeQuery();

			while (RS.next()) {
				c = new Cliente();
				c.setCi(RS.getString("cedula"));
				c.setName(RS.getString("nombre"));
				c.setNhijos(RS.getInt("numeroHijos"));

				cl.add(c);
			}

		} catch (krakedevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new krakedevException("Error al consultar: " + e.getMessage());
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return cl;
	}

	
	public Cliente recuperarClientePK(String PK) throws krakedevException {
		Connection CON = null;
		PreparedStatement PS = null;
		Cliente c = new Cliente();
		ResultSet RS = null;
		try {
			CON = ConexionBDD.obtenerConexion();
			PS = CON.prepareStatement("Select cedula, nombre, numeroHijos from clientes where cedula = ? ");
			PS.setString(1, PK);
			
			RS=PS.executeQuery();
			if (RS.next()) {
				c.setCi(RS.getString("cedula"));
				c.setName(RS.getString("nombre"));
				c.setNhijos(RS.getInt("numeroHijos"));
			}

		} catch (krakedevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new krakedevException("Error al consultar: " + e.getMessage());
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return c;
	}

	public ArrayList<Cliente> recuperarClientes() throws krakedevException {
		ArrayList<Cliente> cl = new ArrayList<Cliente>();
		Connection CON = null;
		PreparedStatement PS = null;
		Cliente c = null;
		try {
			CON = ConexionBDD.obtenerConexion();
			PS = CON.prepareStatement("Select cedula, nombre, numeroHijos from clientes");
			ResultSet RS = PS.executeQuery();

			while (RS.next()) {
				c = new Cliente();
				c.setCi(RS.getString("cedula"));
				c.setName(RS.getString("nombre"));
				c.setNhijos(RS.getInt("numeroHijos"));

				cl.add(c);
			}

		} catch (krakedevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new krakedevException("Error al consultar: " + e.getMessage());
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return cl;
	}

	public void insertarcl(Cliente C) throws krakedevException {
		Connection CON = null;
		try {
			CON = ConexionBDD.obtenerConexion();
			PreparedStatement ps = CON
					.prepareStatement("insert into clientes(cedula, nombre, numeroHijos)" + "values(?,?,?)");
			ps.setString(1, C.getCi());
			ps.setString(2, C.getName());
			ps.setInt(3, C.getNhijos());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new krakedevException("Error al insertar un cliente: " + e.getMessage());
		} catch (krakedevException e) {
			throw e;
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void actualizarcl(Cliente C) throws krakedevException {
		Connection CON = null;
		try {
			CON = ConexionBDD.obtenerConexion();
			PreparedStatement ps = CON
					.prepareStatement("update clientes set nombre = ?, numeroHijos = ? " + "where cedula = ?");
			ps.setString(1, C.getName());
			ps.setInt(2, C.getNhijos());
			ps.setString(3, C.getCi());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new krakedevException("Error al actualizar un cliente: " + e.getMessage());
		} catch (krakedevException e) {
			throw e;
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
