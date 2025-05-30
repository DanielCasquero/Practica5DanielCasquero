package clases;

public class TecnicoEspecializado extends Tecnico {

	private String especialidad;
	private String certificacion;
	private int anyosExperiencia;

	public TecnicoEspecializado(String nombre, String ocupacion, String especialidad) {
		super(nombre, ocupacion);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	public String getCertificacion() {
		return certificacion;
	}

	public void setCertificacion(String certificacion) {
		this.certificacion = certificacion;
	}

	public int getAnyosExperiencia() {
		return anyosExperiencia;
	}

	public void setAnyosExperiencia(int anyosExperiencia) {
		this.anyosExperiencia = anyosExperiencia;
	}
	/**
	 * Metodo que dice si está o no especializado
	 * @return siempre devuelve true
	 */
	public boolean estaEspecializado () {
		return true;
	}

	@Override
	public String toString() {
		return "TecnicoEspecializado [especialidad=" + especialidad + ", certificacion=" + certificacion
				+ ", anyosExperiencia=" + anyosExperiencia + ", toString()=" + super.toString() + "]";
	}
	/**
	 * Metodo que permite al tecnico preparar su equipo para un Espectaculo
	 */
	public void prepararEquipo() {
	    System.out.println(super.getNombre() + " está preparando su equipo de trabajo para la función con sumo cuidado");
	}
	/**
	 * Metodo que permite al Tecnico realizar tareas en un Espectaculo
	 */
	public void mantenerEspectaculo() {
		System.out.println(super.getNombre() + " está ajustando la iluminación y el sonido a la perfeción");
	}
}
