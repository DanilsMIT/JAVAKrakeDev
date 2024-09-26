package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	///atributo añadido para TestMostrarTelefonos
	private ArrayList<Telefono> telefonos;
	
	public ArrayList<Telefono> recuperarIncorrectos(){
		ArrayList<Telefono> tl = new ArrayList<Telefono>();
		Telefono t;
		for(int n=0;n<telefonos.size();n++) {
			t=telefonos.get(n);
			
			if(t.getEstado().equalsIgnoreCase("E")) {
				tl.add(t);
			}
		}
		return tl;
	}
	public void agregarTelefono(Telefono t) {	
		telefonos.add(t);
	}
	
	public void mostrarTelefonos() {
		Telefono p;
		System.out.println("Telefonos con estado 'C'");
		for(int m=0;m<telefonos.size();m++) {
			p=telefonos.get(m);
			
			if(p.getEstado().equalsIgnoreCase("C")){
				System.out.println("Numero: "+p.getNumero()+", Tipo: "+p.getTipo());
			}
		}
	}
	
	public void imprimir() {

		if (direccion != null) {
			System.out.println("Informacion del Contacto: ");
			System.out.println("Cedula: " + cedula);
			System.out.println("Nombre: " + nombre);
			System.out.println("Apellido: " + apellido);
			System.out.println("Direccion:");
			System.out.println("   Calle Principal: " + direccion.getCallePrincipal());
			System.out.println("   Calle Secundaria: " + direccion.getCalleSecundaria());
		}
		if (direccion != null) {
			System.out.println("======================================");
			System.out.println("Forma 2 de TestContacto 2");
			System.out.println("--------------------------------------");
			System.out.println("***" + nombre + " " + apellido + "****");
			System.out.println("Direccion: " + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
		} else {
			System.out.println("***" + nombre + " " + apellido + "****");
			System.out.println("No tiene una direccion asociada");
		}
	}

	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		ArrayList<Telefono> tl=new ArrayList<Telefono>();
		telefonos=tl;		
	}
	
	
	

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
