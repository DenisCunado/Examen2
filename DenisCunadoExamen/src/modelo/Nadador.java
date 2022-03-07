package modelo;

public class Nadador extends Atleta{
	
	private char estilo;

	public Nadador() {
		super();
	}

	public Nadador(String nombreApellidos, String poblacion, int dorsal, String tiempo, char estilo) {
		super(nombreApellidos, poblacion, dorsal, tiempo);
		this.estilo = estilo;
	}

	public char getEstilo() {
		return estilo;
	}

	public void setEstilo(char estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Identificador: " + getIdentificador() + "\n" + "Nombre y Apellidos: " + getNombreApellidos() +  "\n" + "Poblacion: "
				+ getPoblacion() + "\n" + "Dorsal: " + getDorsal() + "\n" + "Tiempo: " + getTiempo() + 
				"\n" +  "Estilo: " + estilo + "\n" + "\n" ;
	}
	
}