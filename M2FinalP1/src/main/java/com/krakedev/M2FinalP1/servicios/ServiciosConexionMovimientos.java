package com.krakedev.M2FinalP1.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.krakedev.M2FinalP1.entidades.historialMovimientos;
import com.krakedev.M2FinalP1.excepciones.KrakeDevException;
import com.krakedev.M2FinalP1.persistencia.HistorialBDDHISTORIAL;

@Path("historialMovimientos")
public class ServiciosConexionMovimientos {
	
	@Path("insertarMovimiento")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertarMovimiento(historialMovimientos hM) {
		HistorialBDDHISTORIAL hbddH = new HistorialBDDHISTORIAL();
		
		try {
			hbddH.insertarMovimiento(hM);
			return Response.ok().build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("consultarTodos")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultarTodos() {
		HistorialBDDHISTORIAL hbddH = new HistorialBDDHISTORIAL();
		ArrayList<historialMovimientos> hmL = new ArrayList<historialMovimientos>();
		
		try {
			hmL=hbddH.obtenerMovimientos();
			return Response.ok(hmL).build();
		} catch (KrakeDevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
}
