package Reto12M2;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA=new Producto("Manzana","Roja",1.50,35);
		productoB=new Producto("Manzana","Verde",3.50,25);
		productoC=new Producto("Manzana","Americana",2.00,55);
		
		
		System.out.println("Producto 1: "+productoA.getNombre());
		System.out.println("detalles: "+productoA.getDetalles());
		System.out.println("precio: "+productoA.getPrecio());
		System.out.println("stock: "+productoA.getStock());

		System.out.println("Producto 2: "+productoB.getNombre());
		System.out.println("detalles: "+productoB.getDetalles());
		System.out.println("precio: "+productoB.getPrecio());
		System.out.println("stock: "+productoB.getStock());
		
		System.out.println("Producto 3: "+productoC.getNombre());
		System.out.println("detalles: "+productoC.getDetalles());
		System.out.println("precio: "+productoC.getPrecio());
		System.out.println("stock: "+productoC.getStock());

	}
	

}
