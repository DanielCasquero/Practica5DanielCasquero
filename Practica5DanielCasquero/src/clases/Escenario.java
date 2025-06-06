package clases;

public class Escenario {

	private String nombre;
	private String loalizacion;
	private int aforoMaximo;
	private Espectaculo espectaculo;

	public Escenario(String nombre, String loalizacion, int aforoMaximo) {
		this.nombre = nombre;
		this.loalizacion = loalizacion;
		this.aforoMaximo = aforoMaximo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLoalizacion() {
		return loalizacion;
	}

	public void setLoalizacion(String loalizacion) {
		this.loalizacion = loalizacion;
	}

	public int getAforoMaximo() {
		return aforoMaximo;
	}

	public void setAforoMaximo(int aforoMaximo) {
		this.aforoMaximo = aforoMaximo;
	}

	public Espectaculo getEspectaculo() {
		return espectaculo;
	}

	public void setEspectaculo(Espectaculo espectaculo) {
		this.espectaculo = espectaculo;
	}

	@Override
	public String toString() {
		return "Escenario [nombre=" + nombre + ", loalizacion=" + loalizacion + ", aforoMaximo=" + aforoMaximo
				+ ", espectaculo=" + espectaculo + "]";
	}



}
