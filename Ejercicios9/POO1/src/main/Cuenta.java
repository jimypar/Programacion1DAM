package main;

public class Cuenta {

	String titular;
	String numeroCuenta;
	float saldo;
	
	Cuenta(){
		this.titular = "";
		this.numeroCuenta = "";
		this.saldo = 100;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Titular= " + titular + 
				"\nNumeroCuenta= " + numeroCuenta + 
				"\nSaldo= " + saldo;
	}
	
	
	
}

	

