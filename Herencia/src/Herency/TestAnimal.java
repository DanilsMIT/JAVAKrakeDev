package Herency;

public class TestAnimal {

	public static void main(String[] args) {
		Gatito g=new Gatito();
		g.sleep();
		
		
		Animal a=new Animal();
		a.sleep();
		
		g.maullar();
		g.maullar("Ratoncillo");
	}
}
