package modelo;

public class Atleta {

	private static int indice = 0;

	private int identificador;
	private String nombreApellidos;
	private String poblacion;
	private int dorsal;
	private String tiempo;

	public Atleta() {

		indice = indice + 1;

		this.identificador = indice;
		this.nombreApellidos = "";
		this.poblacion = "";
		this.dorsal = 0;
		this.tiempo = "";
	}

	public Atleta(String nombreApellidos, String poblacion, int dorsal, String tiempo) {
		this();
		this.nombreApellidos = nombreApellidos;
		this.poblacion = poblacion;
		this.dorsal = dorsal;
		this.tiempo = tiempo;
	}

	public static int getIndice() {
		return indice;
	}

	public static void setIndice(int indice) {
		Atleta.indice = indice;
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getNombreApellidos() {
		return nombreApellidos;
	}

	public void setNombreApellidos(String nombreApellidos) {
		this.nombreApellidos = nombreApellidos;
	}

	public String getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getTiempo() {
		return tiempo;
	}

	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public String toString() {
		return "Atleta [identificador=" + identificador + ", nombreApellidos=" + nombreApellidos + ", poblacion="
				+ poblacion + ", dorsal=" + dorsal + ", tiempo=" + tiempo + "]";
	}

}
