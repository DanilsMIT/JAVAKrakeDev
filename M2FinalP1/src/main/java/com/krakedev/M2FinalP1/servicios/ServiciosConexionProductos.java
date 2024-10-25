package com.krakedev.M2FinalP1.servicios;

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

import com.krakedev.M2FinalP1.entidades.productos;
import com.krakedev.M2FinalP1.excepciones.KrakeDevException;
import com.krakedev.M2FinalP1.persistencia.HistorialBDDProductos;

@Path("Cnxproductos")
public class ServiciosConexionProductos {
	
	@Path("consultarProducto/{idParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultarProducto(@PathParam("idParam") String id) {
		productos pL=new productos();
		HistorialBDDProductos hbddp= new HistorialBDDProductos();
		
		try {
			pL=hbddp.consultarProductobyID(id);
			return Response.ok(pL).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("insertarProducto")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response InsertarProducto(productos p) {
		HistorialBDDProductos hbddp= new HistorialBDDProductos();
		try {
			hbddp.InsertarProducto(p);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("actualizarProducto")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ActualizarProducto(productos p) {
		HistorialBDDProductos hbddp= new HistorialBDDProductos();
		try {
			hbddp.ActualizarProductoCodeC(p);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
	@Path("consultaProductos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultarProductos() {
		ArrayList<productos> pL=new ArrayList<productos>();
		HistorialBDDProductos hbddp= new HistorialBDDProductos();
		
		try {
			pL=hbddp.ObtenerProductos();
			return Response.ok(pL).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
