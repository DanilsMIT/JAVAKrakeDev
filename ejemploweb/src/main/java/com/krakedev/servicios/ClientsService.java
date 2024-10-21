package com.krakedev.servicios;

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

import com.krakedev.entidades.Cliente;
import com.krakedev.excepciones.krakedevException;
import com.krakedev.persistencia.ClientsBDD;

@Path("customers")
public class ClientsService {
	
	@Path("listaClNhijos/{nhParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListaClientesNHijos(@PathParam("nhParam") int nh) {
		ArrayList<Cliente> CL= new ArrayList<Cliente>();
		ClientsBDD cbdd =new ClientsBDD();
		
		try {
			CL=cbdd.recuperarClientesPorNhijos(nh);
			return Response.ok(CL).build();
		} catch (krakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("buscarClPK/{ciParam}")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response ClientePK(@PathParam("ciParam") String ci){
		Cliente CL= new Cliente();
		ClientsBDD cbdd =new ClientsBDD();
		try {
			CL=cbdd.recuperarClientePK(ci);
			return Response.ok(CL).build();
		} catch (krakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
	@Path("listaCl")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response ListaClientes(){
		ArrayList<Cliente> CL= new ArrayList<Cliente>();
		ClientsBDD cbdd =new ClientsBDD();
		try {
			CL=cbdd.recuperarClientes();
			return Response.ok(CL).build();
		} catch (krakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	
	@Path("buscarCl")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Cliente buscarClient() {
		Cliente c=new Cliente("180345","BlueAin",177);
		return c;
	}
	
	@Path("insertarCl")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response InsertarCliente(Cliente cl) {
		System.out.println(">>>"+cl);
		ClientsBDD cbdd=new ClientsBDD();
		try {
			cbdd.insertarcl(cl);
			return Response.ok().build();
		} catch (krakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("actualizarCl")
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response ActualizarCliente(Cliente cl) {
		System.out.println("Actualización de Cliente: "+cl);
		ClientsBDD cbdd=new ClientsBDD();
		try {
			cbdd.actualizarcl(cl);
			return Response.ok().build();
		} catch (krakedevException e) {
			e.printStackTrace();
			return Response.serverError().build();
		}
	}
	
	@Path("m1")
	@GET
	public String saludar() {
		return "Hola michines desde RestWebServices";
	}
}
