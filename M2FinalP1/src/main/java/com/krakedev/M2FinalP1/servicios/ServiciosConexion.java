package com.krakedev.M2FinalP1.servicios;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.M2FinalP1.entidades.categoria;
import com.krakedev.M2FinalP1.excepciones.KrakeDevException;
import com.krakedev.M2FinalP1.persistencia.HistorialBDD;
import com.krakedev.M2FinalP1.utils.ConexionBDD;

@Path("bases")
public class ServiciosConexion {
	
	@Path("consultarTodos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response RetornarTodosCTG() {
		HistorialBDD hbdd=new HistorialBDD();
		ArrayList<categoria> ctgL=new ArrayList<categoria>();
		
		try {
			ctgL=hbdd.RecuperarTodos();
			return Response.ok(ctgL).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("probarBuscar/{idCParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response buscarCategoriaID(@PathParam("idCParam") String idC) {
		HistorialBDD hbdd=new HistorialBDD();
		categoria ctg=null;
		try {
			ctg=hbdd.BuscarPorIDC(idC);
			return Response.ok(ctg).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("probarActualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ActualizarCategoria(categoria c){
		HistorialBDD hbdd=new HistorialBDD();
		try {
			hbdd.Actualizar(c);;
			System.out.println("Categoria Actualizada: "+c);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("probarInsertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response InsertarCategoria(categoria c){
		HistorialBDD hbdd=new HistorialBDD();
		try {
			hbdd.Insertar(c);
			System.out.println("Categoria Ingresada: "+c);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
	@Path("probarConexion")
	@GET
	public void probarConn() {
		Connection C = null;
		try {
			C = ConexionBDD.obtenerConexion();
			if (C != null) {
				System.out.println("conexion exitosa");
			}
		} catch (KrakeDevException e) {
			e.printStackTrace();
			System.out.println("conexion fallo");
		} finally {
			if (C != null) {
				try {
					C.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
