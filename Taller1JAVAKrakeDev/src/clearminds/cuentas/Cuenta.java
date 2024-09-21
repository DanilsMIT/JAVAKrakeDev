package clearminds.cuentas;

public class Cuenta {
	private String id;
	private String tipo;
	private double saldo;
	
	//Constructores
	public Cuenta(String id) {
		this.id=id;
		this.tipo="A";
	}
	
	public Cuenta(String id, String tipo, double saldo) {
		this.id=id;
		this.tipo=tipo;
		this.saldo=saldo;
	}
	
	//metodo para imprimir la cuenta en consola
	public void MostrarCuentaCreada() {
		System.out.println("************");
		System.out.println("ID: "+id);
		System.out.println("TIPO: "+tipo);
		System.out.println("SALDO: "+saldo);
		System.out.println("************");
	}
	
	public String getId() {
		return id;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}
