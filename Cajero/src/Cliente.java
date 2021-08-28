
import java.util.ArrayList;

public class Cliente {
	private String nombre;
	private String codigo;
	private int pin;
	 ArrayList<Cuenta> numCuentas = new ArrayList<Cuenta>();

	
	public Cliente() {
		
	}

	public void aniadirCuentas() {
		if (getCodigo().equals("jperez")) {
			this.setPin(3333);
			Cuenta cnt1 = new Cuenta(111122, "Bolivianos", "Caja de ahorros", 12000);
			Cuenta cnt2 = new Cuenta(112211, "USD", "Cuenta Corriente", 100);
			numCuentas.add(cnt1);
			numCuentas.add(cnt2);
		} else if (getCodigo().equals("mperez")) {
			this.setPin(4444);
			Cuenta cnt1 = new Cuenta(221122, "Bolivianos", "Caja de ahorros", 0);
			numCuentas.add(cnt1);
		} else if (getCodigo().equals("cperez")) {
			this.setPin(3333);
			Cuenta cnt1 = new Cuenta(111122, "Bolivianos", "Caja de ahorros", 12000);
			Cuenta cnt2 = new Cuenta(112211, "USD", "Cuenta Corriente", 100);
			Cuenta cnt3 = new Cuenta(332233, "Bolivianos", "Caja de ahorros", 100000);
			numCuentas.add(cnt1);
			numCuentas.add(cnt2);
			numCuentas.add(cnt3);

		}

	}
	
	public boolean revisarPin(String usuario) {
		boolean flag=false;
		if (usuario.equals("jperez")) {
			if(this.getPin()==3333);
			return true;
		} else if (usuario.equals("mperez")) {
			if(this.getPin()==4444);
			return true;
		} else if (usuario.equals("cperez")) {
			if(this.getPin()==3333);
			return true;
		}
		return flag;
	}
	
	public boolean revisarClientes(String codigoRev) {
		boolean flag=false;
		if (getCodigo().equals("jperez")) {
			flag=true;
		} else if (getCodigo().equals("mperez")) {
			flag= true;
		} else if (getCodigo().equals("cperez")) {
			flag= true;
		}
		return flag;//retorna true si encuentra el nombre y si da false no lo encontro
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
