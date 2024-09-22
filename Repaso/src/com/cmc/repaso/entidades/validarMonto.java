package com.cmc.repaso.entidades;

public class validarMonto {

	public boolean Validacion(double monto) {

		if (monto > 0) {
			return true;
		}else {
			return false;
		}
	}
}
