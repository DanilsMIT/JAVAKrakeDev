package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1=new Cuenta("03475");
		cuenta1.setSaldo(675);
		
		Cuenta cuenta2=new Cuenta("03476","C",98);
		
		Cuenta cuenta3=new Cuenta("03477");
		cuenta3.setTipo("C");
		
		System.out.println("VALORES INICIALES");
		System.out.println("=================");
		System.out.println("CUENTA 1");
		cuenta1.MostrarCuentaCreada();
		System.out.println("CUENTA 2");
		cuenta2.MostrarCuentaCreada();
		System.out.println("CUENTA 3");
		cuenta3.MostrarCuentaCreada();
		
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");
		System.out.println("=================");
		System.out.println("VALORES MODIFICADOS");
		System.out.println("CUENTA 1");
		cuenta1.MostrarCuentaCreada();
		System.out.println("CUENTA 2");
		cuenta2.MostrarCuentaCreada();
		System.out.println("CUENTA 3");
		cuenta3.MostrarCuentaCreada();
		System.out.println("=================");
		
		Cuenta cuenta4=new Cuenta("0987");
		cuenta4.setSaldo(10);
		
		Cuenta cuenta5=new Cuenta("0557","C",10);
		
		Cuenta cuenta6=new Cuenta("0666");
		
		System.out.println("=================");
		System.out.println("CUENTAS ADICIONALES");
		System.out.println("CUENTA 4");
		cuenta4.MostrarCuentaCreada();
		System.out.println("CUENTA 5");
		cuenta5.MostrarCuentaCreada();
		System.out.println("CUENTA 6");
		cuenta6.MostrarCuentaCreada();
		System.out.println("=================");

	}
	
}
