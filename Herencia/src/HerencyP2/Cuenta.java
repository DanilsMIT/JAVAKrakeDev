package HerencyP2;

public class Cuenta {
	private String nCuenta;
	private double saldo;
	
	@Override
	public String toString() {
		return "[ No.Cuenta: "+nCuenta+", saldo: "+saldo+" ]";
	}
	
	public Cuenta(String nCuenta, double saldo) {
		super();
		this.nCuenta = nCuenta;
		this.saldo = saldo;
	}
	public String getnCuenta() {
		return nCuenta;
	}
	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
