package Reto10M2;

public class TestPerimetroRectangulo {

	public static void main(String[] args) {
		Rectangulo R1;
		Rectangulo R2;
		
		R1=new Rectangulo();
		R2=new Rectangulo();
		
		R1.longitud=30.60;
		R1.ancho=20.40;
		R2.longitud=50;
		R2.ancho=25;
		
		double resultr1=R1.calculoperimetro();
		double resultr2=R2.calculoarea();
		
		System.out.println("perimetro rectangulo 1: "+resultr1 );
		System.out.println("area rectangulo 2: "+resultr2 );

	}

}
