package controlador;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ControlErrores {
	
	public static String controlCadena() {
		Scanner sc = new Scanner(System.in);
		String String = null;
		try {
			String = sc.next();

		} catch (Exception e) {
			System.out.println("No has introducido una campo valido");
			controlCadena();
		}
		return String;
	}

	public static int controlInt() {
		Scanner sc = new Scanner(System.in);
		boolean numeroEntero = true;
		int numero = 0;

		try {
			numero = sc.nextInt();
			numeroEntero = false;
		} catch (Exception e) {
			System.out.println("Su seleccion no se corresponde a lo que se le ha pedido");
			System.out.println();
			controlInt();
		}
		return numero;
	}

	public static double controlDouble() {
		Scanner sc = new Scanner(System.in);
		boolean numeroReal = true;
		double numero = 0;

		try {
			numero = sc.nextDouble();
			numeroReal = false;
		} catch (Exception e) {
			System.out.println("Su seleccion no se corresponde a lo que se le ha pedido");
			System.out.println();
			controlDouble();
		}
		return numero;
	}
	
	public static int controlMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la opcion deseada");
		int opcion = 0;
		try {
			opcion = sc.nextInt();
			if (!(1 <= opcion && opcion <= 5)) {
				System.out.println("El numero introducido no estaba entre las opciones posibles 1 y 5");
				opcion = controlMenu();
			}
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("No has introducido un numero");
			System.out.println();
			opcion = controlMenu();
		}
		return opcion;
	}
	
	public static int controlMenuCNC() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la opcion deseada");
		int opcion = 0;
		try {
			opcion = sc.nextInt();
			if (!(1 <= opcion && opcion <= 3)) {
				System.out.println("El numero introducido no estaba entre las opciones posibles 1 y 3");
				opcion = controlMenu();
			}
		} catch (InputMismatchException e) {
			System.out.println();
			System.out.println("No has introducido un numero");
			System.out.println();
			opcion = controlMenu();
		}
		return opcion;
	}
	
	public static char esChar() {
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		char opcion = sc.next().charAt(0);
		System.out.println("Has seleccionado la opcion: " + opcion);

		while (!(opcion=='C' || opcion=='M' || opcion=='E' || opcion=='B')) {
			System.out.println(" La opcion " + opcion + " no es valida ");
			opcion = sc.next().charAt(0);
			return opcion;
		}
		return opcion;
	}
	
	public static boolean comprobacionboolean() {
		Scanner sc = new Scanner(System.in);
		boolean comprobacion= true;
		boolean estado= false;
		do {
			try {
				comprobacion = true;
				System.out.println("ponga true o ponga false");
				estado = sc.nextBoolean();
				sc.nextLine();
			}catch(Exception e) {
				System.out.println("error ponga true o ponga false");
				comprobacion = false;
				sc.nextLine();
			}
		}while(comprobacion == false);
		return estado;
	}
}