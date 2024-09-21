package Reto11M2;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado C1;
		Cuadrado C2;
		Cuadrado C3;
		
		C1=new Cuadrado();
		C2=new Cuadrado();
		C3=new Cuadrado();

		C1.setLado(2);
		C2.setLado(4);
		C3.setLado(8);

		double rAc1;
		double rAc2;
		double rAc3;

		rAc1=C1.calculoarea();
		rAc2=C2.calculoarea();
		rAc3=C3.calculoarea();
		
		double rPc1;
		double rPc2;
		double rPc3;
		
		rPc1=C1.calculoperimetro();
		rPc2=C2.calculoperimetro();
		rPc3=C3.calculoperimetro();

		System.out.println("Area cuadrado 1: "+rAc1);
		System.out.println("Perimetro cuadrado 1: "+rPc1);
		System.out.println("Area cuadrado 2: "+rAc2);
		System.out.println("Perimetro cuadrado 2: "+rPc2);
		System.out.println("Area cuadrado 3: "+rAc3);
		System.out.println("Perimetro cuadrado 3: "+rPc3);

	}

}
