package modelo;

public class Corredor extends Atleta{
	
	private int distancia;
	
	public Corredor(String nombreApellidos, String poblacion, int dorsal, String tiempo, int distancia) {
		super(nombreApellidos, poblacion, dorsal, tiempo);
		this.distancia = distancia;
	}

	public Corredor() {
		super();
	}

	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int distancia) {
		this.distancia = distancia;
	}

	@Override
	public String toString() {
		return "Identificador: " + getIdentificador() + "\n" + "Nombre y Apellidos: " + getNombreApellidos() +  "\n" + "Poblacion: "
				+ getPoblacion() + "\n" + "Dorsal: " + getDorsal() + "\n" + "Tiempo: " + getTiempo() + 
				"\n" +  "Distancia: " + distancia + "\n" + "\n" ;
	}

}
