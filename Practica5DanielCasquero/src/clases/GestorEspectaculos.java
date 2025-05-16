package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorEspectaculos {

	private ArrayList<Espectaculo> listaEspectaulos;
	private ArrayList<Representante> listaRepresentantes;
	private ArrayList<Actor> listaActores;
	private ArrayList<Tecnico> listaTecnicos;

	public GestorEspectaculos() {
		this.listaEspectaulos = new ArrayList<Espectaculo>();
		this.listaRepresentantes = new ArrayList<Representante>();
		this.listaActores = new ArrayList<Actor>();

	}

	//
	//
	//
	// Metodos relativos a Representante
	//
	//
	//
	/**
	 * Metodo que da de alta un representante en el ArrayList listaRepresentantes
	 * 
	 * @param nombre   nombre del representante
	 * @param agencia  agencia del representante
	 * @param telefono telefono del representante
	 */

	public void AltaRepresentante(String nombre, String agencia, String telefono) {
		listaRepresentantes.add(new Representante(nombre, agencia, telefono));
	}

	/**
	 * Metodo que recorre el ArrayList de representantes imprimiendo por pantalla el
	 * toString de cada uno
	 */
	public void listarRepresentantes() {
		for (Representante r : listaRepresentantes) {
			System.out.println(r.toString());
		}
	}

	/**
	 * Metodo que busca el representante que se pide por parametros en el ArrayList
	 * y devuelvlve el toString de ese representante
	 * 
	 * @param nombreRepresentante Nnombre del representante que desamos tener su
	 *                            toString
	 */
	public boolean existeRepresentante(String nombreRepresentante) {
		for (Representante r : listaRepresentantes) {
			if (r.getNombre().equalsIgnoreCase(nombreRepresentante)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que devuelve un objeto representante
	 * 
	 * @param nombreRepresentante nombre del representante que desamos devolver
	 * @return devuelve un representante si se encuentra, sino devuelve null
	 */
	public Representante devuelveRepresentante(String nombreRepresentante) {
		if (existeRepresentante(nombreRepresentante)) {
			for (Representante r : listaRepresentantes) {
				if (r.getNombre().equalsIgnoreCase(nombreRepresentante)) {
					return r;
				}
			}
		} else {
			System.out.println("No se ha encontrado un representante");
		}
		return null;
	}

	/**
	 * Metodo que elimina un Representante del ArrayList de representantes mediante
	 * un objeto Iterator
	 * 
	 * @param nombreRepresentante Nombre del representante que se busca
	 */
	public void eliminarRepresentante(String nombreRepresentante) {
		Iterator<Representante> it = listaRepresentantes.iterator();
		while (it.hasNext()) {
			Representante r = it.next();
			if (r.getNombre().equalsIgnoreCase(nombreRepresentante)) {
				it.remove();
			}
		}
	}

	/**
	 * Metodo que introduce un Representante en un Protagonista
	 * 
	 * @param nombreProtagonista  Nombre del protagonista que queremos que reciba el
	 *                            representante
	 * @param nombreRepresentante Nombre del representante que queremos meter en el
	 *                            Protagonista
	 */
	public void insertarRepresentanteEnProtagonista(String nombreProtagonista, String nombreRepresentante) {
		devuelveProtagonista(nombreProtagonista).setRepredsentante(devuelveRepresentante(nombreRepresentante));
	}

	//
	//
	//
	// Metodos relativos a Actor
	//
	//
	//
	/**
	 * Metodo que crea un objeto Actor y lo mete en un ArryList de Actores
	 * 
	 * @param nombre nombre del actor a introducir
	 * @param edad   edad del actor a introducir
	 */
	public void altaActor(String nombre, int edad) {
		listaActores.add(new Actor(nombre, edad));
	}

	/**
	 * Metodo que recorre la lista de actores e imprime por pantalla el toString de
	 * cada uno
	 */
	public void listarActores() {
		for (Actor a : listaActores) {
			System.out.println(a);
		}
	}

	/**
	 * Metodo que busca a un actor en especifico dentro del ArrayList de actores e
	 * imprime por pantalla su toString
	 * 
	 * @param nombreActor nombre del actor que buscamos en el ArrayList
	 */
	public boolean existeActor(String nombreActor) {
		for (Actor a : listaActores) {
			if (a.getNacionalidad().equalsIgnoreCase(nombreActor)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que busca a un actor en especifico dentro del ArrayList de actores y
	 * lo devuelve entero
	 * 
	 * @param nombreActor nombre del actor que buscamos en el ArrayList
	 * @return el objeto Actor en caso de haber, nada en caso de no haber
	 */
	public Actor devuelveActor(String nombreActor) {
		if (existeActor(nombreActor)) {
			for (Actor a : listaActores) {
				if (a.getNacionalidad().equalsIgnoreCase(nombreActor)) {
					return a;
				}
			}
		} else {
			System.out.println("No existe el Actor introducido");
		}
		return null;
	}

	/**
	 * Metodo que elimina un ACtor de un ArrayList de actores mediante el uso de la
	 * clase Iterator
	 * 
	 * @param nombreActor El nombre del Actor a eliminar
	 */
	public void eliminarActor(String nombreActor) {
		Iterator<Actor> it = listaActores.iterator();
		while (it.hasNext()) {
			Actor a = it.next();
			if (a.getNombre().equalsIgnoreCase(nombreActor)) {
				it.remove();
			}
		}
	}

	//
	//
	//
	// Metodos relativos a Protagonista
	//
	//
	//
	/**
	 * Metodo que crea un objeto Protagonista y lo mete a un ArrayList de Actores
	 * 
	 * @param nombre           nombre del protagonista
	 * @param edad             edad del protagonista
	 * @param especialidadObra el topo de obras en las que se especializa el
	 *                         protagonista (Drama, comedia...)
	 */
	public void altaProtagonista(String nombre, int edad, String especialidadObra) {
		listaActores.add(new Protagonista(nombre, edad, especialidadObra));
	}

	/**
	 * Metodo que lista solamente a los protagonistas que haya en el ArrayList de
	 * actores haciendo uso del metodo esProtagonista
	 */
	public void listarProtagonistas() {
		for (Actor a : listaActores) {
			if (a.esProtagonista()) {
				System.out.println(a);
			}
		}
	}

	/**
	 * Metodo que dice si exsite un protagonista con un nombre específico
	 * 
	 * @param nombreProtagonista Nombre del protagonista que desamos buscar
	 * @return si lo encuentra true, de lo contrario false
	 */
	public boolean existeProtagonista(String nombreProtagonista) {
		for (Actor a : listaActores) {
			if (a.esProtagonista() && a.getNombre().equalsIgnoreCase(nombreProtagonista)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que devuelve un protagonista sacado del ArrayList de actores
	 * 
	 * @param nombreProtagonista Nombre del protagonista que queremos encontrar
	 * @return Si encuentra al protagonista lo devuelve parseado de actor, sino
	 *         devuelve null
	 */
	public Protagonista devuelveProtagonista(String nombreProtagonista) {
		if (existeProtagonista(nombreProtagonista)) {
			for (Actor a : listaActores) {
				if (a.esProtagonista() && a.getNombre().equalsIgnoreCase(nombreProtagonista)) {
					return (Protagonista) a;
				}
			}
		} else {
			System.out.println("No se ha encontrado un Protagonista");
		}
		return null;
	}

	/**
	 * Metodo que elimina a un protagonista en especifico del ArrayList de
	 * protagonistas haciendo uso del metodo esProtagonista
	 * 
	 * @param nombreProtagonsita nombre del protagonista que queremos eliminar del
	 *                           ArrayList de Actores
	 */
	public void eliminarProtagonista(String nombreProtagonsita) {
		Iterator<Actor> it = listaActores.iterator();
		while (it.hasNext()) {
			Actor a = it.next();
			if (a.getNombre().equalsIgnoreCase(nombreProtagonsita) && a.esProtagonista()) {
				it.remove();
			}
		}
	}

	//
	//
	//
	// Metodos relativos a Tecnico
	//
	//
	//
	/**
	 * Metodo que crea un Tecnico y lo mete al ArrayList de tecnicos
	 * 
	 * @param nombre    Nombre del tecnico
	 * @param ocupacion Ocupacion que tiene (Sonido, Iluminación,Telón...)
	 */
	public void altaTecnico(String nombre, String ocupacion) {
		listaTecnicos.add(new Tecnico(nombre, ocupacion));
	}
	/**
	 * Metodo que lista los tecnicos dados de alta en el programa
	 */
	public void listarTecnicos() {
		for (Tecnico t : listaTecnicos) {
			System.out.println(t);
		}
	}
	/**
	 * Metodo que
	 * @param nombreTecnico
	 * @return
	 */
	public boolean existeTecnico(String nombreTecnico) {
		for (Tecnico t : listaTecnicos) {
			if (t.getNombre().equalsIgnoreCase(nombreTecnico)) {
				return true;
			}
		}
		return false;
	}

}























