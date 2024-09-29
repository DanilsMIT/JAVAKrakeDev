package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Cliente> clientes;

	public ArrayList<Prestamo> buscarPrestamos(String ci) {
		ArrayList<Prestamo> prestamosCliente = new ArrayList<Prestamo>();
		Cliente C;
		for (int u = 0; u < clientes.size(); u++) {
			C = clientes.get(u);

			if (ci == C.getCedula()) {
				prestamosCliente = C.getPrestamos();
				break;
			}
		}

		return prestamosCliente;
	}

	public void asignarPrestamo(String ci, Prestamo p) {
		Cliente C = buscarCliente(ci);

		if (C != null) {
			C.getPrestamos().add(p);
		}

		if (C == null) {
			System.out.println("La cedula no corresponde a un cliente en este banco");
		}
	}

	public void agregarCliente(Cliente c) {
		Cliente cl;
		boolean nCliente = true;
		if (clientes.size() == 0) {
			clientes.add(c);
			return;
		}

		for (int i = 0; i < clientes.size(); i++) {
			cl = clientes.get(i);

			if (cl.getCedula().equals(c.getCedula())) {
				nCliente = false;
				break;
			} else {
				clientes.add(c);
				break;
			}
		}

		if (nCliente == false) {
			System.out.println("CLIENTE YA REGISTRADO");
		}
	}

	public Cliente buscarCliente(String cedula) {
		Cliente cl;

		Cliente clR = null;
		boolean founded = true;
		for (int i = 0; i < clientes.size(); i++) {
			cl = clientes.get(i);

			if (cedula.equals(cl.getCedula())) {
				clR = cl;
				break;
			} else {
				founded = false;
			}
		}

		if (founded = false) {
			System.out.println("CI NO REGISTRADO");

		}
		return clR;
	}

	public Banco() {
		ArrayList<Cliente> c = new ArrayList<Cliente>();
		clientes = c;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
}
