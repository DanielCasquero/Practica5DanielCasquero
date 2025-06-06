package clases;

public class Tecnico {

	private String nombre;
	private int edad;
	private String ocupacion;
	private int aniosExperiencia;

	public Tecnico(String nombre, String ocupacion) {
		this.nombre = nombre;
		this.ocupacion = ocupacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getOcupacion() {
		return ocupacion;
	}

	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}
	/**
	 * Metodo que dice si está o no especializado
	 * @return siempre devuelve false
	 */
	public boolean estaEspecializado () {
		return false;
	}

	@Override
	public String toString() {
		return "Tecnico [nombre=" + nombre + ", edad=" + edad + ", ocupacion=" + ocupacion + ", aniosExperiencia="
				+ aniosExperiencia + "]";
	}
	/**
	 * Metodo que permite al tecnico preparar su equipo para un Espectaculo
	 */
	public void prepararEquipo() {
	    System.out.println(nombre + " está preparando su equipo de trabajo para la función");
	}
	/**
	 * Metodo que permite al Tecnico realizar tareas en un Espectaculo
	 */
	public void mantenerEspectaculo() {
		System.out.println(this.nombre + " está ajustando la iluminación y el sonido");
	}
}
