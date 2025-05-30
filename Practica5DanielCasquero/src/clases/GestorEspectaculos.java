package clases;

import java.util.ArrayList;
import java.util.Iterator;

public class GestorEspectaculos {

	private ArrayList<Espectaculo> listaEspectaculos;
	private ArrayList<Representante> listaRepresentantes;
	private ArrayList<Actor> listaActores;
	private ArrayList<Tecnico> listaTecnicos;
	private ArrayList<Escenario> listaEscenarios;

	public GestorEspectaculos() {
		this.listaEspectaculos = new ArrayList<Espectaculo>();
		this.listaRepresentantes = new ArrayList<Representante>();
		this.listaActores = new ArrayList<Actor>();
		this.listaEscenarios = new ArrayList<Escenario>();
		this.listaTecnicos = new ArrayList<Tecnico>();

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
	 * Metodo que busca un Representante en específico
	 * 
	 * @param nombreRepresentante
	 */
	public void BuscarRepresentante(String nombreRepresentante) {
		if (existeRepresentante(nombreRepresentante)) {
			System.out.println(devuelveRepresentante(nombreRepresentante));
		} else {
			System.out.println("No se ha encontrado representante");
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
		if (existeRepresentante(nombreRepresentante)) {
			Iterator<Representante> it = listaRepresentantes.iterator();
			while (it.hasNext()) {
				Representante r = it.next();
				if (r.getNombre().equalsIgnoreCase(nombreRepresentante)) {
					it.remove();
				}
			}
			System.out.println("Representante eliminado correctamente");
		} else {
			System.out.println("No existe un representante con ese nombre");
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
	 * Metodo que imprime por pantalla un actor si este existe
	 * 
	 * @param nombreActor nombre del actor a imprimir
	 */
	public void buscarActor(String nombreActor) {
		if (existeActor(nombreActor)) {
			System.out.println(devuelveActor(nombreActor));
		} else {
			System.out.println("No se ha encontrado un actor");
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
			if (a.getNombre().equalsIgnoreCase(nombreActor)) {
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
				if (a.getNombre().equalsIgnoreCase(nombreActor)) {
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
		if (existeActor(nombreActor)) {
			Iterator<Actor> it = listaActores.iterator();
			while (it.hasNext()) {
				Actor a = it.next();
				if (a.getNombre().equalsIgnoreCase(nombreActor)) {
					it.remove();
				}
			}
		} else {
			System.out.println("No existe un Actor con ese nombre");
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
	 * Metodo que busca un protagonista segun el nombre que recibe
	 * 
	 * @param nombreProtagonista el nombre del protagonista a buscar
	 */
	public void buscarProtagonista(String nombreProtagonista) {
		if (existeProtagonista(nombreProtagonista)) {
			System.out.println(devuelveProtagonista(nombreProtagonista));
		} else {
			System.out.println("No existe ese protagonista");
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
		if (existeProtagonista(nombreProtagonsita)) {
			Iterator<Actor> it = listaActores.iterator();
			while (it.hasNext()) {
				Actor a = it.next();
				if (a.getNombre().equalsIgnoreCase(nombreProtagonsita) && a.esProtagonista()) {
					it.remove();
				}
			}
		} else {
			System.out.println("No existe un Protagonista con ese nombre");
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
	 * Metodo que busca un Tecnico dentro del ArrayList de tecnicos, para imprimirlo
	 * por pantalla
	 * 
	 * @param nombreTecnico Nombre del tecnico a buscar
	 */
	public void buscarTecnico(String nombreTecnico) {
		if (existeTecnico(nombreTecnico)) {
			System.out.println(devuelveTecnico(nombreTecnico));
		} else {
			System.out.println("No se ha encontrado un Tecnico");
		}
	}

	/**
	 * Metodo que comprueva si existe un Tecnico en especifico dentro de un
	 * ArrayList de tecnicos
	 * 
	 * @param nombreTecnico nombre del Tecnico a buscar
	 * @return si lo encuentra true, sino false
	 */
	public boolean existeTecnico(String nombreTecnico) {
		for (Tecnico t : listaTecnicos) {
			if (t.getNombre().equalsIgnoreCase(nombreTecnico)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que devuelve un Tecnico sacado del ArrayList de Tecnicos
	 * 
	 * @param nombreTecnico Nombre del Tecnico que buscamos
	 * @returnSi encuentra al Tecnico devuelve un objeto Tecnico, sino devuelve null
	 */
	public Tecnico devuelveTecnico(String nombreTecnico) {
		if (existeTecnico(nombreTecnico)) {
			for (Tecnico t : listaTecnicos) {
				if (t.getNombre().equalsIgnoreCase(nombreTecnico)) {
					return t;
				}
			}
		} else {
			System.out.println("No sea ha encontrado el Tecnico introducido");
		}
		return null;
	}

	/**
	 * Metodo que elimina un Tecnico de un ArrayList de tecnicos mediante el uso de
	 * la clase Iterator
	 * 
	 * @param nombreTecnico Nombre del Tecnico que quiero eliminar
	 */
	public void eliminarTecnico(String nombreTecnico) {
		if (existeTecnico(nombreTecnico)) {
			Iterator<Tecnico> it = listaTecnicos.iterator();
			while (it.hasNext()) {
				Tecnico t = it.next();
				if (t.getNombre().equalsIgnoreCase(nombreTecnico)) {
					it.remove();
				}
			}
		} else {
			System.out.println("No existe un Tecnico con ese nombre");
		}
	}

	//
	//
	//
	// Metodos relativos a TecnicoEspecializado
	//
	//
	//

	/**
	 * Metodo que crea un objeto Tecnico y lo introduce en un ArrayList de tecnicos
	 * 
	 * @param nombre       nombre del tecnico a introducir
	 * @param ocupacion    ocupacion del tecnico a introducir
	 * @param especialidad especialidad del tecnico a introducir
	 */
	public void altaTecnicoEspecializado(String nombre, String ocupacion, String especialidad) {
		listaTecnicos.add(new TecnicoEspecializado(nombre, ocupacion, especialidad));
	}

	/**
	 * Metodo que comprueba si un tecnico dentro del ArrayList de tecnicos estás
	 * especializado mediante un metodo estaEspecializado, muestra por pantalla tan
	 * solo los TecnicosEspecializados
	 */
	public void listarTecnicosEspecializados() {
		for (Tecnico t : listaTecnicos) {
			if (t.estaEspecializado()) {
				System.out.println(t);
			}
		}
	}

	/**
	 * Metodo que busca un Tecnico Especializado en un ArrayList de tecnicos, si lo
	 * encuentra lo imprime por pantalla
	 * 
	 * @param nombreTecnicoEspecializado Nombre del Tecnico Especializado a buscar
	 */
	public void buscarTecnicoEspecializado(String nombreTecnicoEspecializado) {
		if (existeTecnicoEspcializado(nombreTecnicoEspecializado)) {
			System.out.println(devuelveTecnicoEspecializado(nombreTecnicoEspecializado));
		} else {
			System.out.println("No se ha encontrado un Tecnico Espcializado");
		}
	}

	/**
	 * Metodo que nos dice si existe un tecnico especializado dentro del ArrayList
	 * de tecnicos
	 * 
	 * @param nombreTecnicoEspecializado nombre del Tecnico a buscar
	 * @return si lo encuantra devuelve true, sino false
	 */
	public boolean existeTecnicoEspcializado(String nombreTecnicoEspecializado) {
		for (Tecnico t : listaTecnicos) {
			if (t.estaEspecializado() && t.getNombre().equalsIgnoreCase(nombreTecnicoEspecializado)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que Busca un TecnicoEspecializado mediante otro metodo
	 * existeTecnicoEspecializado que nos devuelve un booleano con true o false
	 * 
	 * @param nombreTecnicoEspecializado nombre del Tecnico a buscar
	 * @return si lo encuentra devuelve un TecnicoEspecializado parseado, sino
	 *         devuelve null
	 */
	public TecnicoEspecializado devuelveTecnicoEspecializado(String nombreTecnicoEspecializado) {
		if (existeTecnicoEspcializado(nombreTecnicoEspecializado)) {
			for (Tecnico t : listaTecnicos) {
				if (t.estaEspecializado() && t.getNombre().equalsIgnoreCase(nombreTecnicoEspecializado)) {
					return (TecnicoEspecializado) t;
				}
			}
		} else {
			System.out.println("No se ha encontrado un Tecnico Especializado");
		}
		return null;
	}

	/**
	 * Metodo que emplea la clase Iterator para eliminar un TecnicoEspecializado del
	 * ArrayList de tecnicos
	 * 
	 * @param nombreTecnicoEspecializado nombre del Tecnico a eliminar
	 */
	public void eliminarTecnicoEspecializado(String nombreTecnicoEspecializado) {
		if (existeTecnicoEspcializado(nombreTecnicoEspecializado)) {
			Iterator<Tecnico> it = listaTecnicos.iterator();
			while (it.hasNext()) {
				Tecnico t = it.next();
				if (t.getNombre().equalsIgnoreCase(nombreTecnicoEspecializado) && t.estaEspecializado()) {
					it.remove();
				}
			}
		} else {
			System.out.println("No existe un Tecnico Especializado con ese nombre");
		}
	}

	//
	//
	//
	// Metodos relativos a Escenario
	//
	//
	//
	/**
	 * Metodo que de de alta un Escenario en el ArryList de escenarios
	 * 
	 * @param nombre      nombre del Escenario a introducir
	 * @param loalizacion loalizacion del Escenario a introducir
	 * @param aforoMaximo aforoMaximo del Escenario a introducir
	 */
	public void altaEscenario(String nombre, String loalizacion, int aforoMaximo) {
		listaEscenarios.add(new Escenario(nombre, loalizacion, aforoMaximo));
	}

	/**
	 * Metodo que muestra por pantalla todos los escenarios dados de alta en el
	 * ArrayList de escenarios
	 */
	public void listarEscenarios() {
		for (Escenario e : listaEscenarios) {
			System.out.println(e);
		}
	}

	/**
	 * Metodo que busca un escenario en un ArrayList de escenarios y lo imprime por
	 * pantalla en caso de encontrarlo
	 * 
	 * @param nombreEscenario
	 */
	public void buscarEscenario(String nombreEscenario) {
		if (existeEscenario(nombreEscenario)) {
			System.out.println(devuelveEscenario(nombreEscenario));
		} else {
			System.out.println("No se ha encontrado un Escenario");
		}
	}

	/**
	 * Metodo que busca un Escenario en específico dentro del ArrayList de
	 * escenarios para comprobar si existe o no
	 * 
	 * @param nombreEscenario nombre del escenario a introducir
	 * @return si lo encuentra devuelve true, sino false
	 */
	public boolean existeEscenario(String nombreEscenario) {
		for (Escenario e : listaEscenarios) {
			if (e.getNombre().equalsIgnoreCase(nombreEscenario)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que busca a un Escenario en especifico dentro del ArrayList de
	 * Escenario y lo devuelve entero
	 * 
	 * @param nombreEscenario nombre del Escenario a devolver
	 * @return si lo encuentra devuelve el objeto Escenario, sino null
	 */
	public Escenario devuelveEscenario(String nombreEscenario) {
		if (existeEscenario(nombreEscenario)) {
			for (Escenario e : listaEscenarios) {
				if (e.getNombre().equalsIgnoreCase(nombreEscenario)) {
					return e;
				}
			}
		} else {
			System.out.println("No se ha encontrado un Escenario");
		}
		return null;
	}

	/**
	 * Metodo que elimina un Escenario de un ArrayList de escenarios mediante la
	 * clase Iterator
	 * 
	 * @param nombreEscenario nombre del escenario a eliminar
	 */
	public void eliminarEscenario(String nombreEscenario) {
		if (existeEscenario(nombreEscenario)) {
			Iterator<Escenario> it = listaEscenarios.iterator();
			while (it.hasNext()) {
				Escenario e = it.next();
				if (e.getNombre().equalsIgnoreCase(nombreEscenario)) {
					it.remove();
				}
			}
		} else {
			System.out.println("No existe un escenario con ese nombre");
		}
	}

	/**
	 * Metodo que introduce un esoectaculo en un escenario, comprobando antes si
	 * ambos existen y utilizando metodos que devuelven tanto Escenarios como
	 * Espectaculos
	 * 
	 * @param nombreEspectaculo nombre del Espectaculo a introducir
	 * @param nombreEscenario   nombre del Escenario donde introducir el Espectaculo
	 */
	public void introducirEspectaculoEscenario(String nombreEspectaculo, String nombreEscenario) {
		if (existeEspectaculo(nombreEspectaculo)) {
			if (existeEscenario(nombreEscenario)) {
				devuelveEscenario(nombreEscenario).setEspectaculo(devuelveEspectaculo(nombreEspectaculo));
			} else {
				System.out.println("No escenario no exise");
			}
		} else {
			System.out.println("El espectaculo no existe");
		}
	}

	//
	//
	//
	// Metodos relativos a Espectaculo
	//
	//
	//
	/**
	 * Metodo que da de alta un espectaculo en un ArrayList de espectaculo
	 * 
	 * @param tipoEspectaculo no muestra el tipo de epectaculo que va a ser
	 *                        (comedia, drama, romance...)
	 */
	public void altaEspectaculo(String nombre, String tipoEspectaculo) {
		listaEspectaculos.add(new Espectaculo(nombre, tipoEspectaculo));
	}

	/**
	 * Metodo que muestra por pantalla los espectaculos que se encuentren dentro del
	 * ArrayList de espectaculos
	 */
	public void listarEspectaculos() {
		for (Espectaculo e : listaEspectaculos) {
			System.out.println(e);
		}
	}
	/**
	 * Metodo que busca un escenario en un ArrayList de escenarios mediante metodo devuelveEspectaculo
	 * @param nombreEspectaculo Nombre del esp
	 */
	public void buscarEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			System.out.println(devuelveEspectaculo(nombreEspectaculo));
		} else {
			System.out.println("No se ha encontrado un Espectaculo");
		}
	}

	/**
	 * Metodo que nos dice si existe o no un espectaculo en funcion de un nombre
	 * introducido
	 * 
	 * @param nombreEspectaculo nombre del espectaculo que queremos saber si existe
	 * @return si existe devuelve true, sino false
	 */
	public boolean existeEspectaculo(String nombreEspectaculo) {
		for (Espectaculo e : listaEspectaculos) {
			if (e.getNombre().equalsIgnoreCase(nombreEspectaculo)) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Metodo que devuelve un Espectaculo si existe y se encuentra al buscarse
	 * dentro del ArryListe de espectaculos
	 * 
	 * @param nombreEspectaculo nombre del espectaculo a devolver
	 * @return si encuentra el Espectaculo lo devuelve, sino devuelve null
	 */
	public Espectaculo devuelveEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			for (Espectaculo e : listaEspectaculos) {
				if (e.getNombre().equalsIgnoreCase(nombreEspectaculo)) {
					return e;
				}
			}
		} else {
			System.out.println("No se ha encontrado un Espectaculo");
		}
		return null;
	}

	/**
	 * Metodo que elimina un espectaculo del ArrayList de espectaculos, si es que
	 * existe, empleando la clase Iterator
	 * 
	 * @param nombreEspectaculo nombre del espectaculo a eliminar
	 */
	public void eliminarEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			Iterator<Espectaculo> it = listaEspectaculos.iterator();
			while (it.hasNext()) {
				Espectaculo e = it.next();
				if (e.getNombre().equalsIgnoreCase(nombreEspectaculo)) {
					it.remove();
				}
			}
		} else {
			System.out.println("No existe un escenario con ese nombre");
		}
	}

	/**
	 * Metodo que introduce los tecnicos dados de alta en la clase
	 * GestorEspectaculos dentro de la clase Espectaculo
	 * 
	 * @param nombreEspectaculo nombre del espectaculo donde se van a introducir los
	 *                          Tecnicos
	 */
	public void asignarEquipoTecnicoEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			for (Tecnico t : listaTecnicos) {
				devuelveEspectaculo(nombreEspectaculo).getListaTecnicos().add(t);
			}
		} else {
			System.out.println("No se ha encontrado un espectaculo");
		}
	}

	/**
	 * Metodo que muestra por pantalla la lista de los Tecnicos que trabajarán en el
	 * espectaculo
	 * 
	 * @param nombreEspectaculo nombre del Espectaculo del cual queremos mostrar los
	 */
	public void mostrarEquipoTecnicoEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			for (Tecnico t : devuelveEspectaculo(nombreEspectaculo).getListaTecnicos()) {
				System.out.println(t);
			}
		} else {
			System.out.println("No se ha encontrado un espectaculo");
		}
	}

	/**
	 * Metodo que introduce los Actores dados de alta en la clase GestorEspectaculos
	 * dentro de la clase Espectaculo
	 * 
	 * @param nombreEspectaculo nombre del Espectaculo del cual se quiere acceder a
	 *                          su ArrayList de actores
	 */
	public void asignarActoresEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			for (Actor a : listaActores) {
				devuelveEspectaculo(nombreEspectaculo).getListaActores().add(a);
			}
		} else {
			System.out.println("No se ha encontrado un espectaculo");
		}
	}

	/**
	 * Metodo que muestra por pantalla el Rparto de actores de un Espectaculo
	 * 
	 * @param nombreEspectaculo nombre del Espectaculo del cual se quiere imprimir
	 *                          su reparto de actores
	 */
	public void mostrarRepartoActoresEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			for (Actor a : devuelveEspectaculo(nombreEspectaculo).getListaActores()) {
				System.out.println(a);
			}
		} else {
			System.out.println("No se ha encontrado un espectaculo");
		}
	}

	/**
	 * Metodo que permite a los actores y a los tecnicos prepararse para el
	 * espectaculo
	 * 
	 * @param nombreEspectaculo nombre del espectaculo que se va a llevar a cabo
	 */
	public void prepararEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			System.out.println("El espectaculo se está preparando");
			System.out.println();
			for (Tecnico t : devuelveEspectaculo(nombreEspectaculo).getListaTecnicos()) {
				t.prepararEquipo();
			}
			System.out.println();
			for (Actor a : devuelveEspectaculo(nombreEspectaculo).getListaActores()) {
				a.ensayar();
			}
		} else {
			System.out.println("No se ha encontrado ningun espectaculo");
		}
	}

	/**
	 * Metodo que da comienzo al espectaculo, el cual recorre los ArrayList de la
	 * clase Espectaculo y muestra acciones que realizan los actores o los Tecnicos
	 * 
	 * @param nombreEspectaculo nombre del espectaculo que se va a llevar a cabo
	 */
	public void realizarEspectaculo(String nombreEspectaculo) {
		if (existeEspectaculo(nombreEspectaculo)) {
			System.out.println("El espectaculo comienza");
			System.out.println();
			for (Tecnico t : devuelveEspectaculo(nombreEspectaculo).getListaTecnicos()) {
				t.mantenerEspectaculo();
			}
			System.out.println();
			for (Actor a : devuelveEspectaculo(nombreEspectaculo).getListaActores()) {
				a.actuar();
			}
		} else {
			System.out.println("No se ha encontrado ningun espectaculo");
		}
	}

}













