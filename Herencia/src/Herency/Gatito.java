package Herency;

public class Gatito extends Animal {

	@Override
	public void sleep() {
		System.out.println("AAAAAAHHHHH");
	}

	public void maullar() {
		System.out.println("El gato ha rugido");
	}

	public void maullar(String s) {
		System.out.println("El gato ha rugido al " + s);
	}
}
