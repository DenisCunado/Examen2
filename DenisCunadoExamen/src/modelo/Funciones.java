package modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import controlador.ControlErrores;
import vista.Vista;

public class Funciones {

	public static ArrayList<Atleta> atletas = new ArrayList<Atleta>();

	public static void inicializar() {
		atletas.clear();
		// --corredores--
		atletas.add(new Corredor("Oihana Kortazar Aranzeta", "Elgeta", 9530, "45", 21));
		atletas.add(new Corredor("María Arregi Bilbao", "Elgeta", 9933, "70", 21));
		atletas.add(new Corredor("Peru Ruiz", "Gasteiz", 9531, "ABANDONA", 21));

		// --nadadores--
		atletas.add(new Nadador("Mikel Bildosola", "Algorta", 15, "30", 'M'));
		atletas.add(new Nadador("Iñaki Bildosola", "Algorta", 14, "35", 'M'));
		atletas.add(new Nadador("Gorka Mintegi", "Laudio", 16, "ABANDONA", 'M'));
		// --ciclistas--
		atletas.add(new Ciclista("Pello Bilbao", "Gernika", 4577, "Euskaltel", "14450", false));
		atletas.add(new Ciclista("Amaia Landaburu", "Bilbo", 4576, "Euskaltel", "14350", false));
		atletas.add(new Ciclista("Mikel Landa", "Bilbo", 4575, "Euskaltel", "14400", true));
		menu();
	}

	public static void menu() {
		boolean inicio = false;
		Vista.menuInicial();
		int opcion = ControlErrores.controlMenu();

		switch (opcion) {
		case 1:
			Funciones.inicializar();
			break;

		case 2:
			menuNuevo();
			break;

		case 3:
			borrarAtleta();
			break;

		case 4:
			mostrar();
			break;

		case 5:
			System.out.println("Vuelva pronto");
			break;

		default:

			break;
		}
	}

	public static void menuNuevo() {

		Vista.menuAtletas();
		int opcion = ControlErrores.controlMenuCNC();

		switch (opcion) {
		case 1:
			nuevoCorredor();
			break;

		case 2:
			nuevoNadador();
			break;

		case 3:
			nuevoCiclista();
			break;

		default:

			break;
		}
	}

	public static void nuevoCorredor() {
		Corredor corredor = new Corredor();
		System.out.println("Introduce el nombre y los apellidos");
		corredor.setNombreApellidos(ControlErrores.controlCadena());
		System.out.println("Introduzca su pueblo");
		corredor.setPoblacion(ControlErrores.controlCadena());
		System.out.println("Introduzca su dorsal");
		corredor.setDorsal(ControlErrores.controlInt());
		System.out.println("Introduzca su tiempo");
		corredor.setTiempo(ControlErrores.controlCadena());
		System.out.println("Introduzca la distancia recorrida");
		corredor.setDistancia(ControlErrores.controlInt());
		atletas.add(corredor);
		menu();
	}

	public static void nuevoNadador() {
		Nadador nadador = new Nadador();
		System.out.println("Introduce el nombre y los apellidos");
		nadador.setNombreApellidos(ControlErrores.controlCadena());
		System.out.println("Introduzca su pueblo");
		nadador.setPoblacion(ControlErrores.controlCadena());
		System.out.println("Introduzca su dorsal");
		nadador.setDorsal(ControlErrores.controlInt());
		System.out.println("Introduzca su tiempo");
		nadador.setTiempo(ControlErrores.controlCadena());
		System.out.println("Introduzca su estilo de nado");
		nadador.setEstilo(ControlErrores.esChar());
		atletas.add(nadador);
		menu();
	}

	public static void nuevoCiclista() {
		Ciclista ciclista = new Ciclista();
		System.out.println("Introduce el nombre y los apellidos");
		ciclista.setNombreApellidos(ControlErrores.controlCadena());
		System.out.println("Introduzca su pueblo");
		ciclista.setPoblacion(ControlErrores.controlCadena());
		System.out.println("Introduzca su dorsal");
		ciclista.setDorsal(ControlErrores.controlInt());
		System.out.println("Introduzca su tiempo");
		ciclista.setTiempo(ControlErrores.controlCadena());
		System.out.println("Introduzca su equipo de competicion");
		ciclista.setEquipo(ControlErrores.controlCadena());
		System.out.println("¿Es usted el lider de su grupo?");
		ciclista.setLider(ControlErrores.comprobacionboolean());
		atletas.add(ciclista);
		menu();
	}

	public static void borrarAtleta() {
		Atleta m = new Atleta();
		boolean encontrado = false;
		System.out.println("Introduzca el identificador");
		int identificador = ControlErrores.controlInt();

		for (int i = 0; i < atletas.size(); i++) {
			if (atletas.get(i).getIdentificador() == identificador) {
				m = (Atleta) atletas.get(i);
				atletas.remove(m);
				encontrado = true;
			}
		}
		if (encontrado == false) {
			System.out.println("El atleta que busca no esta registrado.");
		}
		menu();

	}

	public static void mostrar() {
		boolean encontrado = false;
		for (int i = 0; i < atletas.size(); i++) {
			System.out.println("Los Atletas registrados:");
			System.out.println(atletas.get(i));
			encontrado = true;
		}
		if (encontrado == false) {
			System.out.println("No hay atletas registrados.");
		}
		menu();
	}
}