package Reto11M2;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;
		
		productoA=new Producto();
		productoB=new Producto();
		productoC=new Producto();
		
		
		productoA.setNombre("Manzana");
		productoA.setDetalles("roja y mediana");
		productoA.setPrecio(1.50);
		productoA.setStock(35);
		
		productoB.setNombre("Manzana nueva");
		productoB.setDetalles("verde y grande");
		productoB.setPrecio(3.50);
		productoB.setStock(25);
		
		productoC.setNombre("Manzana Americana");
		productoC.setDetalles("roja y grande");
		productoC.setPrecio(2.00);
		productoC.setStock(55);
		
		
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
