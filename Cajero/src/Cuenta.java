
public class Cuenta {
	private int numCuenta;
	private String moneda;
	private String tipo;
	private int saldo;

	public Cuenta(int numCuenta, String moneda, String tipo, int saldo) {
		this.numCuenta = numCuenta;
		this.moneda = moneda;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public String getMoneda() {
		return moneda;
	}

	public void setMoneda(String moneda) {
		this.moneda = moneda;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

}
