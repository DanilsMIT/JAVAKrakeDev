package Reto11M2;

public class TestPerimetroRectangulo {

	public static void main(String[] args) {
		Rectangulo R1;
		Rectangulo R2;
		
		R1=new Rectangulo();
		R2=new Rectangulo();
		
		R1.setLongitud(30.60);
		R1.setAncho(20.40);
		R2.setLongitud(50);
		R2.setAncho(25);
		
		double resultr1=R1.calculoperimetro();
		double resultr2=R2.calculoarea();
		
		System.out.println("perimetro rectangulo 1: "+resultr1 );
		System.out.println("area rectangulo 2: "+resultr2 );

	}

}
