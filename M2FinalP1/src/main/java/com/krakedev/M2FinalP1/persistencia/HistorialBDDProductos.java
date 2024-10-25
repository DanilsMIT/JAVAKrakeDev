package com.krakedev.M2FinalP1.persistencia;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.M2FinalP1.entidades.categoria;
import com.krakedev.M2FinalP1.entidades.productos;
import com.krakedev.M2FinalP1.excepciones.KrakeDevException;
import com.krakedev.M2FinalP1.utils.ConexionBDD;

public class HistorialBDDProductos {
	
	public productos consultarProductobyID(String ID) throws KrakeDevException {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs=null;
		productos p=null;
		HistorialBDD hb=new HistorialBDD();
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("SELECT * FROM productos where idP = ? ");
			ps.setString(1, ID);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				p=new productos();
				p.setIdP(rs.getString("idP"));
				p.setNombre(rs.getString("nombre"));
				String pventa = (rs.getString("precio_venta")).replace("$", "").trim();
				p.setPrecio_venta(new BigDecimal(pventa));
				String pcompra = (rs.getString("precio_compra")).replace("$", "").trim();
				p.setPrecio_compra(new BigDecimal(pcompra));
				p.setIdCategoria(hb.BuscarPorIDC(rs.getString("id_categoria")));
			}
			
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener producto..." + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return p;
	}
	
	public void InsertarProducto(productos p) throws KrakeDevException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("insert into productos (idP,nombre,precio_venta,precio_compra,ID_Categoria) values(?,?,?,?,?) ");
			ps.setString(1, p.getIdP());
			ps.setString(2, p.getNombre());
			ps.setBigDecimal(3, p.getPrecio_venta());
			ps.setBigDecimal(4, p.getPrecio_compra());
			ps.setString(5, p.getIdCategoria().getIdC());
			ps.executeUpdate();

		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener al insertar producto..." + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void ActualizarProductoCodeC(productos p) throws KrakeDevException {
		Connection con = null;
		PreparedStatement ps = null;
		
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("Update productos set ID_Categoria = ? where idP = ? ");
			ps.setString(1, p.getIdCategoria().getIdC());
			ps.setString(2, p.getIdP());
			
			ps.executeUpdate();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener al actualizar producto..." + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public ArrayList<productos> ObtenerProductos() throws KrakeDevException {
		Connection con = null;
		PreparedStatement ps = null;
		ArrayList<productos> pL = new ArrayList<productos>();
		productos p = null;
		ResultSet rs = null;
		HistorialBDD hb=new HistorialBDD();

		try {
			con = ConexionBDD.obtenerConexion();
			ps = con.prepareStatement("select * from productos");
			rs = ps.executeQuery();

			while (rs.next()) {
				p = new productos();
				p.setIdP(rs.getString("idP"));
				p.setNombre(rs.getString("nombre"));
				String pventa = (rs.getString("precio_venta")).replace("$", "").trim();
				p.setPrecio_venta(new BigDecimal(pventa));
				String pcompra = (rs.getString("precio_compra")).replace("$", "").trim();
				p.setPrecio_compra(new BigDecimal(pcompra));
				p.setIdCategoria(hb.BuscarPorIDC(rs.getString("id_categoria")));

				pL.add(p);
			}

		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al obtener el listado de productos..." + e.getMessage());
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

		return pL;

	}
}
