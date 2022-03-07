package modelo;

public class Ciclista extends Atleta{
	
	private String equipo;
	private boolean lider;
	
	public Ciclista() {
		super();
	}
	
	public Ciclista(String nombreApellidos, String poblacion, int dorsal, String tiempo, String equipo, boolean lider) {
		super(nombreApellidos, poblacion, dorsal, tiempo);
		this.equipo = equipo;
		this.lider = lider;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	public boolean getLider() {
		return lider;
	}

	public void setLider(boolean lider) {
		this.lider = lider;
	}

	@Override
	public String toString() {
		return "Identificador: " + getIdentificador() + "\n" + "Nombre y Apellidos: " + getNombreApellidos() +  "\n" + "Poblacion: "
				+ getPoblacion() + "\n" + "Dorsal: " + getDorsal() + "\n" + "Tiempo: " + getTiempo() + 
				"\n" +  "Equipo: " + equipo + "\n" +  "Lider: " + lider + "\n" + "\n" ;
	}

}
