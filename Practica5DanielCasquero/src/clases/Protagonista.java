package clases;

public class Protagonista extends Actor {

	static final double PAGO_EXTRA = 400;
	private String especialidadTipoEspectaculo;
	private Representante repredsentante;

	public Protagonista(String nombre, int edad, String especialidadObra) {
		super(nombre, edad);
		this.especialidadTipoEspectaculo = especialidadObra;
	}

	public Representante getRepredsentante() {
		return repredsentante;
	}

	public void setRepredsentante(Representante repredsentante) {
		this.repredsentante = repredsentante;
	}

	public static double getPagoExtra() {
		return PAGO_EXTRA;
	}

	public String getEspecialidadObra() {
		return especialidadTipoEspectaculo;
	}

	public void setEspecialidadObra(String especialidadObra) {
		this.especialidadTipoEspectaculo = especialidadObra;
	}

	@Override
	public String toString() {
		return "Protagonista [ " + super.toString() + "repredsentante=" + repredsentante + ", toString()=]";
	}
	/**
	 * metodo que dice si un protagonista es protagonista
	 * @return devuelve true siempre
	 */
	public boolean esProtagonista() {
		return true;
	}
	/**
	 * El metodo suma el pago que tienen todos los actores con el pago extra que
	 * reciben los protagonistas
	 * 
	 * @return Devuelve la suma del pago y el pago extra
	 */
	public static double dineroObtenido() {
		return PAGO + PAGO_EXTRA;
	}
	/**
	 * Metodo que permite al protagonista actuar haciendo cosas específicas de protagonista
	 */
	public void actuar() {
		System.out.println(super.getNombre() + " está actuando, siendo el centro de atención");
	}

}
