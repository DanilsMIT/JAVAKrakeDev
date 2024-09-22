package com.cmc.directorio.entidades;

public class AdminContactos {

	public String buscarMasPesado(Contacto c1, Contacto c2) {
		String CM;
		if (c1.getPeso() > c2.getPeso()) {
			CM = c1.getNombre();

		} else {
			CM = c2.getNombre();
		}
		return CM;

	}

	public boolean comprarOperadoras(Contacto c1, Contacto c2) {
		boolean CM;

		if (c1.getPhone().getOperadora() == c2.getPhone().getOperadora()) {
			CM = true;
		} else {
			CM = false;
		}
		return CM;
	}

	public void activarUsuario(Contacto c) {
		if (c.getPhone().isWhatsapp() == true) {
			c.setActivo(true);
		}
	}
}
