package com.krakedev.M2FinalP1.entidades;

import com.krakedev.M2FinalP1.excepciones.KrakeDevException;
import com.krakedev.M2FinalP1.persistencia.HistorialBDDProductos;

public class historialMovimientos {
	private int serialNoMovimiento;
	private productos idProducto;
	private int cantidad;
	private String fecha_movimiento;
	
	
	public historialMovimientos() {
		super();
	}
	
	
	public historialMovimientos(String idProducto, int cantidad, String fecha_movimiento) {
		super();
		HistorialBDDProductos hb= new HistorialBDDProductos();
		try {
			this.idProducto = hb.consultarProductobyID(idProducto);
		} catch (KrakeDevException e) {
			e.printStackTrace();
		}
		this.cantidad = cantidad;
		this.fecha_movimiento = fecha_movimiento;
	}


	public historialMovimientos(int serialNoMovimiento, productos idProducto, int cantidad, String fecha_movimiento) {
		super();
		this.serialNoMovimiento = serialNoMovimiento;
		this.idProducto = idProducto;
		this.cantidad = cantidad;
		this.fecha_movimiento = fecha_movimiento;
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
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getFecha_movimiento() {
		return fecha_movimiento;
	}
	public void setFecha_movimiento(String fecha_movimiento) {
		this.fecha_movimiento = fecha_movimiento;
	}
	@Override
	public String toString() {
		return "historialMovimientos [serialNoMovimiento=" + serialNoMovimiento + ", idProducto=" + idProducto
				+ ", cantidad=" + cantidad + ", fecha_movimiento=" + fecha_movimiento + "]";
	}
}
	
	