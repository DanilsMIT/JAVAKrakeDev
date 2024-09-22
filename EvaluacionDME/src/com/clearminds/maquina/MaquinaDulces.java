package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda Celda1;
	private Celda Celda2;
	private Celda Celda3;
	private Celda Celda4;
	private double Saldo;

	public void configurarMaquina(String c1, String c2, String c3, String c4) {
		Celda p1 = new Celda("0");
		Celda p2 = new Celda("0");
		Celda p3 = new Celda("0");
		Celda p4 = new Celda("0");

		setCelda1(p1);
		setCelda2(p2);
		setCelda3(p3);
		setCelda4(p4);

		Celda1.setCodigo(c1);
		Celda2.setCodigo(c2);
		Celda3.setCodigo(c3);
		Celda4.setCodigo(c4);

	}

	public void mostrarConfiguracion() {
		System.out.println("=================");
		System.out.println("Codigos de Celdas");
		System.out.println("=================");
		System.out.println(Celda1.getCodigo());
		System.out.println(Celda2.getCodigo());
		System.out.println(Celda3.getCodigo());
		System.out.println(Celda4.getCodigo());
		System.out.println("=================");
	}

	public Celda buscarCelda(String code) {
		if (Celda1.getCodigo() == code) {
			return Celda1;
		} else if (Celda2.getCodigo() == code) {
			return Celda2;
		} else if (Celda3.getCodigo() == code) {
			return Celda3;
		} else if (Celda4.getCodigo() == code) {
			return Celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto product, String codeCelda, int stockplus) {
		Celda CeldaRecuperada;
		CeldaRecuperada = buscarCelda(codeCelda);
		CeldaRecuperada.ingresarProducto(product, stockplus);
		;
	}

	public void mostrarProductos() {
		System.out.println("=================");
		System.out.println("Saldo Actual: " + Saldo);
		System.out.println("=================");
		System.out.println("Inventario de Productos");

		if (Celda1.getProducto() == null) {
			System.out.println("============Celda A1");
			System.out.println("C.Code: " + Celda1.getCodigo());
			System.out.println("stock: " + Celda1.getStock());
			System.out.println("CELDA SIN PRODUCTO!");

		} else {
			System.out.println("============Celda A1");
			System.out.println("C.Code: " + Celda1.getCodigo());
			System.out.println("stock: " + Celda1.getStock());
			System.out.println("Producto : " + Celda1.getProducto().getNombre());
			System.out.println("precio : " + Celda1.getProducto().getPrecio());
		}

		if (Celda2.getProducto() == null) {
			System.out.println("============Celda A2");
			System.out.println("C.Code: " + Celda2.getCodigo());
			System.out.println("stock: " + Celda2.getStock());
			System.out.println("CELDA SIN PRODUCTO!");

		} else {
			System.out.println("============Celda A2");
			System.out.println("C.Code: " + Celda2.getCodigo());
			System.out.println("stock: " + Celda2.getStock());
			System.out.println("Producto : " + Celda2.getProducto().getNombre());
			System.out.println("precio : " + Celda2.getProducto().getPrecio());
		}
		if (Celda3.getProducto() == null) {
			System.out.println("============Celda B1");
			System.out.println("C.Code: " + Celda3.getCodigo());
			System.out.println("stock: " + Celda3.getStock());
			System.out.println("CELDA SIN PRODUCTO!");

		} else {
			System.out.println("============Celda B1");
			System.out.println("C.Code: " + Celda3.getCodigo());
			System.out.println("stock: " + Celda3.getStock());
			System.out.println("Producto : " + Celda3.getProducto().getNombre());
			System.out.println("precio : " + Celda3.getProducto().getPrecio());
		}
		if (Celda4.getProducto() == null) {
			System.out.println("============Celda B2");
			System.out.println("C.Code: " + Celda4.getCodigo());
			System.out.println("stock: " + Celda4.getStock());
			System.out.println("CELDA SIN PRODUCTO!");

		} else {
			System.out.println("============Celda B2");
			System.out.println("C.Code: " + Celda4.getCodigo());
			System.out.println("stock: " + Celda4.getStock());
			System.out.println("Producto : " + Celda4.getProducto().getNombre());
			System.out.println("precio : " + Celda4.getProducto().getPrecio());
		}
	}

	public Producto buscarProductoEnCelda(String codeC) {
		if (Celda1.getCodigo() == codeC) {
			return Celda1.getProducto();
		} else if (Celda2.getCodigo() == codeC) {
			return Celda2.getProducto();
		} else if (Celda3.getCodigo() == codeC) {
			return Celda3.getProducto();
		} else if (Celda4.getCodigo() == codeC) {
			return Celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codeC) {
		if (Celda1.getCodigo() == codeC) {
			return Celda1.getProducto().getPrecio();
		} else if (Celda2.getCodigo() == codeC) {
			return Celda2.getProducto().getPrecio();
		} else if (Celda3.getCodigo() == codeC) {
			return Celda3.getProducto().getPrecio();
		} else if (Celda4.getCodigo() == codeC) {
			return Celda4.getProducto().getPrecio();
		} else {
			return 0.0;
		}
	}

	public Celda buscarCeldaProducto(String codeP) {
		if (Celda1.getProducto() != null) {
			if (Celda1.getProducto().getCodigo() == codeP) {
				return Celda1;
			} else {
				return null;
			}
		}

		if (Celda2.getProducto() != null)

		{
			if (Celda2.getProducto().getCodigo() == codeP) {
				return Celda2;
			} else {
				return null;
			}
		}

		if (Celda3.getProducto() != null) {
			if (Celda3.getProducto().getCodigo() == codeP) {
				return Celda3;
			} else {
				return null;
			}
		}

		if (Celda4.getProducto() != null) {
			if (Celda4.getProducto().getCodigo() == codeP) {
				return Celda4;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codeP, int stockUP) {
		Celda celdaEncontrada = buscarCeldaProducto(codeP);
		int CS = celdaEncontrada.getStock();
		CS = stockUP + CS;
		celdaEncontrada.setStock(CS);
	}

	public void vender(String codeC) {
		Celda celdaEncontrada = buscarCelda(codeC);
		int CS = celdaEncontrada.getStock();
		CS = CS - 1;
		celdaEncontrada.setStock(CS);
		double PV = celdaEncontrada.getProducto().getPrecio();
		PV = Saldo + PV;
		Saldo = PV;
	}

	public double venderConCambio(String codeC, double ValorIngresado) {
		Celda celdaEncontrada = buscarCelda(codeC);
		int CS = celdaEncontrada.getStock();
		CS = CS - 1;
		celdaEncontrada.setStock(CS);

		double cambio;
		cambio = celdaEncontrada.getProducto().getPrecio();
		cambio = ValorIngresado - cambio;
		return cambio;
	}

	public Celda getCelda1() {
		return Celda1;
	}

	public void setCelda1(Celda celda1) {
		Celda1 = celda1;
	}

	public Celda getCelda2() {
		return Celda2;
	}

	public void setCelda2(Celda celda2) {
		Celda2 = celda2;
	}

	public Celda getCelda3() {
		return Celda3;
	}

	public void setCelda3(Celda celda3) {
		Celda3 = celda3;
	}

	public Celda getCelda4() {
		return Celda4;
	}

	public void setCelda4(Celda celda4) {
		Celda4 = celda4;
	}

	public double getSaldo() {
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
	}

}
