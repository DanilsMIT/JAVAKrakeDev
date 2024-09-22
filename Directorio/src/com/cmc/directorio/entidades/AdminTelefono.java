package com.cmc.directorio.entidades;

public class AdminTelefono {

	public void activarMensajeria(Telefono phone) {
		if (phone.getOperadora() == "Movi") {
			phone.setWhatsapp(true);
		}
	}

	public int contarMovi(Telefono phone1, Telefono phone2, Telefono phone3) {
		int cp = 0;

		if (phone1.getOperadora() == "Movi") {
			cp = cp+1;
		}else {
			cp = cp + 0;
		}
		
		if (phone2.getOperadora() == "Movi") {
			cp = cp+1;
		}else {
			cp = cp + 0;
		}
		
		if (phone3.getOperadora() == "Movi") {
			cp = cp+1;
		} else {
			cp = cp + 0;
		}
		return cp;
	}
	
	public int contarClaro(Telefono phone1, Telefono phone2, Telefono phone3, Telefono phone4) {
		int cp = 0;

		if (phone1.getOperadora() == "Claro") {
			cp = cp+1;
		}else {
			cp = cp + 0;
		}
		
		if (phone2.getOperadora() == "Claro") {
			cp = cp+1;
		}else {
			cp = cp + 0;
		}
		
		if (phone3.getOperadora() == "Claro") {
			cp = cp+1;
		} else {
			cp = cp + 0;
		}
		
		if (phone4.getOperadora() == "Claro") {
			cp = cp+1;
		} else {
			cp = cp + 0;
		}
		return cp;
	}
}
