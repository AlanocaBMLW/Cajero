import java.util.Scanner;

public class MainCajero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codigo = "";
		int pin = 0;
		int contador = 3;// contador que se encarga de que no haya mas de 3 intentos por sesion
		boolean flag = true;
		Cliente pruebas = new Cliente();
		while (flag && contador != 0) {// inicio de sesion
			System.out.println("Ingrese el codigo de usuario: \n");
			codigo = sc.nextLine();
			pruebas.aniadirCuentas();
			// devuelve true si lo encuentra al cliente false si no
			if (pruebas.revisarClientes(codigo)) {
				
				System.out.println("Ingrese el pin de seguridad: \n");
				pin = sc.nextInt();
				// devuelve true si el pin es correcto false si no lo es
				if (pruebas.revisarPin(codigo)) {
					flag = false;
				} else {
					System.out.println("Intente de nuevo!");
					contador--;
				}
			} else {
				System.out.println("Intente de nuevo!");
				contador--;
			}
		}
		if (contador != 0) {
			System.out.println("\n\n\n\n\n\nSe cerro sesion!");
		} else {// el flag es false entonces se entro correctamente
			flag = true;
			int decision=0;
			while (flag) {//menu de despliegue
				System.out.println("\n\n\n\n\n\nEscoja su opcion\n1.) Ver Saldo\n"
						+ "2.)Retiro\n3.)Deposito\n4.)Salir");
				decision=sc.nextInt();
				if(decision>=1||decision<5) {
					if(decision==1) {
						saldo(pruebas);
					}else if(decision==2) {
						retiro(pruebas);
					}else if(decision==3) {
						deposito(pruebas);
					}else if(decision==4) {
						flag=false;
					}
				}else {
					System.out.println("\n\nIngrese un numero correcto!");
				}
				
			}//fin de while de menu
			System.out.println("Se cerro sesion correctamente, hasta luego.");
		}

	}

	public static void deposito(Cliente pruebas) {
		
	}

	public static void retiro(Cliente pruebas) {
		
	}

	public static void saldo(Cliente pruebas) {
		String moneda,tipo;
		int saldo;
		for(int i=0;pruebas.numCuentas.size()<i;i++) {
			moneda=pruebas.numCuentas.get(i).getMoneda();
			tipo=pruebas.numCuentas.get(i).getTipo();
			saldo=pruebas.numCuentas.get(i).getSaldo();
			System.out.println();
		}
	}
}
