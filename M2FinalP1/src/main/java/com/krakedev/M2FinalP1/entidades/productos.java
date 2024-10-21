package com.krakedev.M2FinalP1.entidades;

import java.math.BigDecimal;

public class productos {
	private String idP;
	private String nombre;
	private BigDecimal precio_venta;
	private BigDecimal precio_compra;
	private categoria idCategoria;

	public productos() {

	}

	public productos(String idP, String nombre, BigDecimal precio_venta, BigDecimal precio_compra,
			categoria idCategoria) {
		super();
		this.idP = idP;
		this.nombre = nombre;
		this.precio_venta = precio_venta;
		this.precio_compra = precio_compra;
		this.idCategoria = idCategoria;
	}

	@Override
	public String toString() {
		return "productos [idP=" + idP + ", nombre=" + nombre + ", precio_venta=" + precio_venta + ", precio_compra="
				+ precio_compra + ", idCategoria=" + idCategoria + "]";
	}

	public String getIdP() {
		return idP;
	}

	public void setIdP(String idP) {
		this.idP = idP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public BigDecimal getPrecio_venta() {
		return precio_venta;
	}

	public void setPrecio_venta(BigDecimal precio_venta) {
		this.precio_venta = precio_venta;
	}

	public BigDecimal getPrecio_compra() {
		return precio_compra;
	}

	public void setPrecio_compra(BigDecimal precio_compra) {
		this.precio_compra = precio_compra;
	}

	public categoria getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(categoria idCategoria) {
		this.idCategoria = idCategoria;
	}

}
