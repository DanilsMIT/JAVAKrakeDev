package com.cmc.directorio.entidades;

public class AdminTelefono {
	
	public void activarMensajeria (Telefono phone) {
		if(phone.getOperadora()=="Movi") {
			phone.setWhatsapp(true);
		}
	}
}
