package HerencyP2;

public class TestCuentaOverride {

	public static void main(String[] args) {
		Cuenta c=new Cuenta("1811002",135.90);
		System.out.println(c);
		
		String C=c.toString();
		System.out.println(C);
	}

}
