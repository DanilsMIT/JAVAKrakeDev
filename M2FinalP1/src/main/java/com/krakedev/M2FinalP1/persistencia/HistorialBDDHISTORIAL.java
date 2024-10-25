package com.krakedev.M2FinalP1.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import com.krakedev.M2FinalP1.entidades.historialMovimientos;
import com.krakedev.M2FinalP1.excepciones.KrakeDevException;
import com.krakedev.M2FinalP1.utils.ConexionBDD;
import com.krakedev.M2FinalP1.utils.Convertidor;

public class HistorialBDDHISTORIAL {

	public void insertarMovimiento(historialMovimientos hm) throws KrakeDevException {
		Connection CON = null;
		PreparedStatement PS = null;

		try {
			CON = ConexionBDD.obtenerConexion();
			PS = CON.prepareStatement(
					"insert into historial_movimientos(id_producto,cantidad,fecha_del_movimiento) values(?,?,?)");
			PS.setString(1, hm.getIdProducto().getIdP());
			PS.setInt(2, hm.getCantidad());
			PS.setTimestamp(3, new java.sql.Timestamp(Convertidor.convertirFecha(hm.getFecha_movimiento()).getTime()));
			PS.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Consultar Categoria " + e.getMessage());
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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

	public ArrayList<historialMovimientos> obtenerMovimientos() throws KrakeDevException {
		Connection CON = null;
		PreparedStatement PS = null;
		historialMovimientos hM = null;
		ResultSet RS = null;
		ArrayList<historialMovimientos> hmL = new ArrayList<historialMovimientos>();
		HistorialBDDProductos hbddp = new HistorialBDDProductos();
		try {
			CON = ConexionBDD.obtenerConexion();
			PS = CON.prepareStatement("select * from historial_movimientos");
			RS = PS.executeQuery();
			while (RS.next()) {
				hM = new historialMovimientos();
				int noM = RS.getInt("No_Movimiento");
				String idP = RS.getString("id_producto");
				int cantidad = RS.getInt("cantidad");
				String fecha = RS.getString("fecha_del_movimiento");
				hM.setSerialNoMovimiento(noM);
				hM.setIdProducto(hbddp.consultarProductobyID(idP));
				hM.setCantidad(cantidad);
				hM.setFecha_movimiento(fecha);
				hmL.add(hM);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Consultar Categoria " + e.getMessage());
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (CON != null) {
				try {
					CON.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return hmL;

	}
}
