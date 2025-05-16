package clases;

import java.util.ArrayList;

public class Espectaculo {

	private String tipoEspectaculo;
	private String nombre;
	protected ArrayList<Actor> listaActores;
	protected ArrayList<Tecnico> listaTecnicos; 

	public Espectaculo(String nombre, String tipoEspectaculo) {
		this.nombre = nombre;
		this.tipoEspectaculo = tipoEspectaculo;
		this.listaActores = new ArrayList<Actor>();
		this.listaTecnicos = new ArrayList<Tecnico>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoEspectaculo() {
		return tipoEspectaculo;
	}

	public void setTipoEspectaculo(String tipoEspectaculo) {
		this.tipoEspectaculo = tipoEspectaculo;
	}

	public ArrayList<Actor> getListaActores() {
		return listaActores;
	}

	public void setListaActores(ArrayList<Actor> listaActores) {
		this.listaActores = listaActores;
	}

	public ArrayList<Tecnico> getListaTecnicos() {
		return listaTecnicos;
	}

	public void setListaTecnicos(ArrayList<Tecnico> listaTecnicos) {
		this.listaTecnicos = listaTecnicos;
	}

	@Override
	public String toString() {
		return "Espectaculo [tipoEspectaculo=" + tipoEspectaculo + ", listaActores="
				+ listaActores + ", listaTecnicos=" + listaTecnicos + "]";
	}

}
