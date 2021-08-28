
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String codigo;
	private int pin;
	private ArrayList<Cuenta> numCuentas = new ArrayList();

	public Cliente(String nombre, String codigo, int pin) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.pin = pin;
		aniadirCuentas(numCuentas);
	}

	public void aniadirCuentas(ArrayList<Cuenta> numCuentas2) {
		if (getCodigo().equals("jperez")) {
			Cuenta cnt1 = new Cuenta(111122, "Bolivianos", "Caja de ahorros", 12000);
			Cuenta cnt2 = new Cuenta(112211, "USD", "Cuenta Corriente", 100);
			numCuentas.add(cnt1);
			numCuentas.add(cnt2);
		} else if (getCodigo().equals("mperez")) {
			Cuenta cnt1 = new Cuenta(221122, "Bolivianos", "Caja de ahorros", 0);
			numCuentas.add(cnt1);
		} else if (getCodigo().equals("cperez")) {
			Cuenta cnt1 = new Cuenta(111122, "Bolivianos", "Caja de ahorros", 12000);
			Cuenta cnt2 = new Cuenta(112211, "USD", "Cuenta Corriente", 100);
			Cuenta cnt3 = new Cuenta(332233, "Bolivianos", "Caja de ahorros", 100000);
			numCuentas.add(cnt1);
			numCuentas.add(cnt2);
			numCuentas.add(cnt3);

		}

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public ArrayList<Cuenta> getNumCuentas() {
		return numCuentas;
	}

	public void setNumCuentas(ArrayList<Cuenta> numCuentas) {
		this.numCuentas = numCuentas;
	}

}
