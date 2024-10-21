package com.krakedev.M2FinalP1.entidades;

import java.util.Date;

public class historialMovimientos {
	private int serialNoMovimiento;
	private productos idProducto;
	private Date fecha_movimiento;
	
	public historialMovimientos() {
		
	}
	public historialMovimientos(int serialNoMovimiento, productos idProducto, Date fecha_movimiento) {
		super();
		this.serialNoMovimiento = serialNoMovimiento;
		this.idProducto = idProducto;
		this.fecha_movimiento = fecha_movimiento;
	}
	@Override
	public String toString() {
		return "historialMovimientos [serialNoMovimiento=" + serialNoMovimiento + ", idProducto=" + idProducto
				+ ", fecha_movimiento=" + fecha_movimiento + "]";
	}
	public int getSerialNoMovimiento() {
		return serialNoMovimiento;
	}
	public void setSerialNoMovimiento(int serialNoMovimiento) {
		this.serialNoMovimiento = serialNoMovimiento;
	}
	public productos getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(productos idProducto) {
		this.idProducto = idProducto;
	}
	public Date getFecha_movimiento() {
		return fecha_movimiento;
	}
	public void setFecha_movimiento(Date fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}
	
}
