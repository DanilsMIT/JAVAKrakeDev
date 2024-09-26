package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> Celdas;
	private double saldo;
	
	
	public ArrayList<Producto> buscarMenores(double limite){
		ArrayList<Producto> pL=new ArrayList<Producto>();
		Celda c;
		for (int i = 0; i < Celdas.size(); i++) {
			c = Celdas.get(i);
			if (c.getProducto() != null) {
				if(c.getProducto().getPrecio()<limite) {
					pL.add(c.getProducto());
				}
			}
		}
		return pL;
	}
	
	public double venderConCambio(String codeC, double valorRecibido) {
		double vuelto = 0;
		Celda c;
		for (int i = 0; i < Celdas.size(); i++) {
			c = Celdas.get(i);
			if (c.getProducto() != null) {
				if (codeC.equals(c.getCodigo())) {
					c.setStock(c.getStock() - 1);
					vuelto = valorRecibido - c.getProducto().getPrecio();
					saldo+=c.getProducto().getPrecio();
				}
			}
		}
		return vuelto;
	}

	public void vender(String codeC) {
		Celda c;
		for (int i = 0; i < Celdas.size(); i++) {
			c = Celdas.get(i);

			if (c.getProducto() != null) {
				if (codeC.equals(c.getCodigo())) {
					c.setStock(c.getStock() - 1);
					saldo += c.getProducto().getPrecio();
				}
			}
		}
	}

	public void incrementarProductos(String codeP, int stockplus) {
		Celda c = buscarCeldaProducto(codeP);
		if (c.getProducto() != null) {
			c.setStock(c.getStock() + stockplus);
			;
		}
	}

	public Celda buscarCeldaProducto(String codeP) {
		Celda c = null;
		Celda p = null;

		for (int pc = 0; pc < Celdas.size(); pc++) {
			p = Celdas.get(pc);

			if (p.getProducto() != null) {
				if (codeP == p.getProducto().getCodigo()) {
					c = p;
				}
			}
		}

		return c;
	}

	public double consultarPrecio(String codeC) {
		double p = 0;
		Celda c = null;
		for (int i = 0; i < Celdas.size(); i++) {
			c = Celdas.get(i);
			if (codeC.equals(c.getCodigo())) {
				p = c.getProducto().getPrecio();
			}
		}
		return p;
	}

	public Producto buscarProductoEnCelda(String codeC) {
		Producto p = null;
		Celda c = null;
		for (int i = 0; i < Celdas.size(); i++) {
			c = Celdas.get(i);
			if (codeC.equals(c.getCodigo())) {
				p = c.getProducto();
			}
		}
		return p;
	}

	public void cargarProducto(Producto p, String codeC, int stock) {
		Celda cE = buscarCelda(codeC);
		cE.ingresarProducto(p, stock);
	}

	public void mostrarProductos() {
		Celda c = null;
		System.out.println("=========================");

		for (int i = 0; i < Celdas.size(); i++) {
			c = Celdas.get(i);
			if (c.getProducto() != null) {

				System.out.println("Celda: " + c.getCodigo() + " " + "Stock: " + c.getStock() + " " + "Producto: "
						+ c.getProducto().getNombre() + " " + "Precio: " + c.getProducto().getPrecio());
			} else {

				System.out.println(
						"Celda: " + c.getCodigo() + " " + "Stock: " + c.getStock() + " " + "Sin Producto asignado");
			}
		}
		System.out.println("Saldo de Maquina: " + saldo);                                                
	}

	public Celda buscarCelda(String codeC) {
		Celda cr = null;
		Celda c;
		for (int cl = 0; cl < Celdas.size(); cl++) {
			c = Celdas.get(cl);
			if (codeC.equals(c.getCodigo())) {
				cr = c;
			}
		}
		return cr;
	}

	public MaquinaDulces() {
		Celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda Codecelda) {
		Celdas.add(Codecelda);
	}

	public void mostrarConfiguracion() {
		Celda cclist;
		for (int l = 0; l < Celdas.size(); l++) {
			cclist = Celdas.get(l);
			System.out.println("Celda: " + cclist.getCodigo());

		}
	}

	public ArrayList<Celda> getCeldas() {
		return Celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		Celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
