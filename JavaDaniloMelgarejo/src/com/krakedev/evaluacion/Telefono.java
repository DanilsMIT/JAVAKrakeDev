package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		if (numero == null) {
			this.numero = "null";
			this.estado = "E";
			this.tipo = tipo;

		}

		if (tipo == null) {
			this.tipo = "null";
			this.estado = "E";
			this.numero = numero;

		}

		if (numero != null && tipo != null) {
			if (tipo.equalsIgnoreCase("movil") && numero.length() == 10
					|| tipo.equalsIgnoreCase("convencional") && numero.length() == 7) {
				this.estado = "C";
			} else {
				this.estado = "E";
			}
		}
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
