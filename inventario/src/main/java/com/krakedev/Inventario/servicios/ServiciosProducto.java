package com.krakedev.Inventario.servicios;

import java.util.ArrayList;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.krakedev.Inventario.entidades.Categoria;
import com.krakedev.Inventario.entidades.Producto;

@Path("productos")
public class ServiciosProducto {
	
	@Path("insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void Insertar(Producto p) {
		System.out.println("Produco Registrado: "+p);
	}
	
	@Path("actualizar")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void Actualizar(Producto p) {
		System.out.println("Produco Modificado: "+p);
	}
	
	@Path("consultar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Producto> RecuperarTodos() {
		ArrayList<Producto> pl=new ArrayList<Producto>();
		
		Categoria c1= new Categoria(101,"Vegetables");
		Categoria c2= new Categoria(102,"Frutitas");

		Producto p1=new Producto("1810","Cebollin",c1,0.75,305);
		Producto p2=new Producto("1812","Valbaya",c2,2.40,1200);
		Producto p3=new Producto("1814","Coliflor",c1,3.20,55);
		
		pl.add(p1);
		pl.add(p2);
		pl.add(p3);
		return pl;		
	}
}
