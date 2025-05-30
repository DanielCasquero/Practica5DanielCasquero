package clases;

public class Actor {


	private String nombre;
	private int edad;
	static final double PAGO = 600;
	private String nacionalidad;

	public Actor(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
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

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	@Override
	public String toString() {
		return "Actor [nombre=" + nombre + ", edad=" + edad + ", nacionalidad="
				+ nacionalidad + "]";
	}
	/**
	 * metodo que dice si un actor es protagonista
	 * @return devuelve false siempre
	 */
	public boolean esProtagonista() {
		return false;
	}
	/**
	 * Metodo que devuelve el pago del actor
	 * 
	 * @return Devuelve el pago del actor
	 */
	public static double dineroObtenido() {
		return PAGO;
	}
	/**
	 * Metodo que permite al Actor ensayar su papel para el espectaculo
	 */
	public void ensayar() {
		System.out.println(this.nombre +" está ensayando");
	}
	/**
	 * Metodo que permite al Actor actuar
	 */
	public void actuar() {
		System.out.println(this.nombre + " está actuando");
	}
}
