package com.krakedev.M2FinalP1.persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.krakedev.M2FinalP1.entidades.categoria;
import com.krakedev.M2FinalP1.excepciones.KrakeDevException;
import com.krakedev.M2FinalP1.utils.ConexionBDD;

public class HistorialBDD {
	
	public ArrayList<categoria> RecuperarTodos() throws KrakeDevException{
		ArrayList<categoria> ctgL=new ArrayList<categoria>();
		categoria ctg=null;
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("select * from categorias");
			rs=ps.executeQuery();
			while(rs.next()) {
				ctg=new categoria();
				ctg.setIdC(rs.getString("idC"));
				ctg.setNombre(rs.getString("nombre"));
				
				ctgL.add(ctg);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Consultar Categoria "+e.getMessage());
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return ctgL;
	}
	
	public categoria BuscarPorIDC(String idC) throws KrakeDevException {
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		categoria ctg= null;

		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("select * from categorias where idC = ? ");
			ps.setString(1, idC);
			rs=ps.executeQuery();
			if(rs.next()) {
				ctg=new categoria(rs.getString("IdC"),rs.getString("nombre"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Consultar Categoria "+e.getMessage());
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return ctg;
	}
	
	public void Actualizar(categoria ctg) throws KrakeDevException{
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("Update categorias set nombre = ? where idC = ? ");
			ps.setString(1, ctg.getNombre());
			ps.setString(2, ctg.getIdC());

			ps.executeUpdate();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Actualizar Categoria "+e.getMessage());
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public void Insertar(categoria ctg) throws KrakeDevException{
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=ConexionBDD.obtenerConexion();
			ps=con.prepareStatement("insert into categorias(idC,nombre) values(?,?) ");
			ps.setString(1, ctg.getIdC());
			ps.setString(2, ctg.getNombre());
			
			ps.executeUpdate();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			throw e;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new KrakeDevException("Error al Insertar Categoria "+e.getMessage());
		}finally {
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
