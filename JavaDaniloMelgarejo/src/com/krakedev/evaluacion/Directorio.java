package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	/// atributos agregados requerimiento 12
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public void depurar() {
		
		Contacto c;
		for(int i=0;i<contactos.size();i++) {
			c=contactos.get(i);
			if(c.getDireccion()!=null) {
				correctos.add(c);
			}else {
				incorrectos.add(c);
			}
		}
		ArrayList<Contacto> cdp=new ArrayList<Contacto>();
		contactos=cdp;
	}

	public int contarFijos() {
		int fijos = 0;

		Telefono c;
		Contacto t;
		for (int i = 0; i < contactos.size(); i++) {
			t = contactos.get(i);
			for (int u = 0; u < t.getTelefonos().size(); u++) {
				c = t.getTelefonos().get(u);

				if (c.getTipo().equals("Convencional") && c.getEstado().equals("C")) {
					fijos = fijos + 1;
				}
			}
		}

		return fijos;
	}

	public int contarPerdidos() {
		int perdidos = 0;

		Contacto c;
		for (int i = 0; i < contactos.size(); i++) {
			c = contactos.get(i);

			if (c.getDireccion() == null) {
				perdidos = perdidos + 1;
			}
		}

		return perdidos;
	}

	public String consultarUltimaModificacion() {
		String fM = null;
		if (fechaModificacion != null) {
			SimpleDateFormat fechaformato = new SimpleDateFormat();
			fM = fechaformato.format(fechaModificacion);
		}
		return fM;
	}

	public boolean agregarContacto(Contacto c) {
		boolean contactoAgregado = false;
		if (contactos.size() == 0) {
			contactos.add(c);
			contactoAgregado = true;
			this.fechaModificacion = new Date();
		}

		Contacto cS;
		if (contactos.size() > 0) {
			for (int cs = 0; cs < contactos.size(); cs++) {
				cS = contactos.get(cs);

				if (cS.getCedula().equals(c.getCedula())) {
					contactoAgregado = false;
					break;
				} else {
					contactoAgregado = true;
				}
			}
			if (contactoAgregado == true) {
				contactos.add(c);
				contactoAgregado = true;
				this.fechaModificacion = new Date();

			}
		}
		return contactoAgregado;
	}

	public Contacto buscarPorCedula(String cC) {
		Contacto C = null;
		Contacto cS;
		for (int cs = 0; cs < contactos.size(); cs++) {
			cS = contactos.get(cs);

			if (cS.getCedula().equals(cC)) {
				C = cS;
			} else {
				C = null;
			}
		}

		return C;
	}

	public Directorio() {
		ArrayList<Contacto> cl = new ArrayList<Contacto>();
		ArrayList<Contacto> c = new ArrayList<Contacto>();
		ArrayList<Contacto> ic = new ArrayList<Contacto>();
		contactos = cl;
		correctos=c;
		incorrectos=ic;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	
	

}
