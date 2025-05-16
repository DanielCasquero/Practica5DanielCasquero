package programa;

import java.util.Scanner;

import clases.GestorEspectaculos;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		GestorEspectaculos gestor = new GestorEspectaculos();
		int eleccion;

		// Introduzco estos datos para que sea mas facil y rapido recorrer y revisar el
		// programa, los dejo para la presentación también

		gestor.AltaRepresentante("Samuel", "Montessori", "666888333");
		gestor.AltaRepresentante("Victor", "Industrias LM", "666888333");

		gestor.altaActor("Lucas", 99);
		gestor.altaActor("Ruben", 21);

		gestor.altaProtagonista("Daniel", 20, "Comedia");
		gestor.altaProtagonista("Diego", 22, "Drama");

		gestor.altaTecnico("Julio", "Encargado de luces");
		gestor.altaTecnico("Mario", "Encargado de sonido");

		gestor.altaTecnicoEspecializado("Nicolás", "Encargado de luzes", "Especialista en iluminaciones");
		gestor.altaTecnicoEspecializado("Karma013", "Encargado de sonido", "Especialista en Ambientación");

		gestor.altaEscenario("Escenario La Roseta", "Zaragoza", 20000);
		gestor.altaEscenario("Escenario Las Fuentes", "Guatemala", 1500);

		gestor.altaEspectaculo("Hamlet", "Drama");
		gestor.altaEspectaculo("Romeo y Julieta", "Tragedia");

		System.out.println("Bienvenido al programa de gestión de espectaculos");
		do {
			System.out.println("---------------Menú principal---------------");
			System.out.println("1.- Manipular Representantes");
			System.out.println("2.- Manipular Actores");
			System.out.println("3.- Manipular Protagonistas");
			System.out.println("4.- Manipular Tecnicos");
			System.out.println("5.- Manipular Tecnicos Especializados");
			System.out.println("6.- Manipular Espectaculos");
			System.out.println("7.- Manipular Escenarios");
			System.out.println("8.- Salir");

			eleccion = input.nextInt();
			switch (eleccion) {
			case 1:
				do {
					System.out.println();
					System.out.println("---------------Menú Representantes---------------");
					System.out.println("1.-Alta Representante");
					System.out.println("2.-Listar Representantes");
					System.out.println("3.-Buscar Representantes");
					System.out.println("4.-Eliminar Representantes");
					System.out.println("5.- Salir");
					eleccion = input.nextInt();
					switch (eleccion) {
					case 1:
						input.nextLine();
						System.out.println("1.-Alta Representante");
						System.out.print("Introduce un nombre para el representante: ");
						String nombre = input.nextLine();
						System.out.print("Introduce una agencia para el representante: ");
						String agencia = input.nextLine();
						System.out.print("Introduce un telefono para el representante: ");
						String telefono = input.nextLine();

						gestor.AltaRepresentante(nombre, agencia, telefono);

						break;
					case 2:

						System.out.println();
						System.out.println("2.-Listar Representantes");
						System.out.println("Listando representantes\n");
						gestor.listarRepresentantes();
						break;
					case 3:
						input.nextLine();
						System.out.println();
						System.out.println("3.-Buscar Representantes");
						System.out.print("Introduce el nombre del Rperesentante que quieres ver: ");
						String nombreRepresentante = input.nextLine();

						gestor.BuscarRepresentante(nombreRepresentante);
						break;
					case 4:
						input.nextLine();
						System.out.println();
						System.out.println("4.-Eliminar Representantes");
						System.out.print("Introduce el nombre del Rperesentante que quieres eliminar: ");
						nombreRepresentante = input.nextLine();
						gestor.eliminarRepresentante(nombreRepresentante);
						break;
					default:
						if (eleccion != 5) {
							System.out.println("Opción no contemplada");
						}
					}
				} while (eleccion != 5);
				eleccion = 0;
				break;
			case 2:
				do {
					System.out.println();
					System.out.println("---------------Menú Actores---------------");
					System.out.println("1.-Alta Actores");
					System.out.println("2.-Listar Actores");
					System.out.println("3.-Buscar Actores");
					System.out.println("4.-Eliminar Actores");
					System.out.println("5.- Salir");
					eleccion = input.nextInt();
					switch (eleccion) {
					case 1:
						input.nextLine();
						System.out.println("1.-Alta Actores");
						System.out.print("Introduce un nombre para el Actor: ");
						String nombre = input.nextLine();
						System.out.print("Introduce una edad para el Actor: ");
						int edad = input.nextInt();
						gestor.altaActor(nombre, edad);

						break;
					case 2:

						System.out.println();
						System.out.println("2.-Listar Actores");
						System.out.println("Listando Actores\n");
						gestor.listarActores();
						break;
					case 3:
						input.nextLine();
						System.out.println();
						System.out.println("3.-Buscar Actores");
						System.out.print("Introduce el nombre del Actor que quieres ver: ");
						String nombreActor = input.nextLine();

						gestor.buscarActor(nombreActor);
						break;
					case 4:
						input.nextLine();
						System.out.println();
						System.out.println("4.-Eliminar Actores");
						System.out.print("Introduce el nombre del Actor que quieres eliminar: ");
						nombreActor = input.nextLine();
						gestor.eliminarActor(nombreActor);
						break;
					default:
						if (eleccion != 5) {
							System.out.println("Opción no contemplada");
						}
					}
				} while (eleccion != 5);
				eleccion = 0;
				break;
			case 3:
				do {
					System.out.println();
					System.out.println("---------------Menú Protagonistas---------------");
					System.out.println("1.-Alta Protagonistas");
					System.out.println("2.-Listar Protagonistas");
					System.out.println("3.-Buscar Protagonistas");
					System.out.println("4.-Eliminar Protagonistas");
					System.out.println("5.-Asignar Representante a Protagonista");
					System.out.println("6.- Salir");
					eleccion = input.nextInt();
					switch (eleccion) {
					case 1:
						input.nextLine();
						System.out.println("1.-Alta Protagonistas");
						System.out.print("Introduce un nombre para el Protagonista: ");
						String nombre = input.nextLine();
						System.out.print("Introduce una edad para el Protagonista: ");
						int edad = input.nextInt();
						System.out.println(
								"Introduce el tipo de obra en el que se especializa el protagonista (Drama, comedia...)");
						input.nextLine();
						String especialidadObra = input.nextLine();

						gestor.altaProtagonista(nombre, edad, especialidadObra);
						break;
					case 2:
						System.out.println();
						System.out.println("2.-Listar Protagonistas");
						System.out.println("Listando Protagonistas\n");

						gestor.listarProtagonistas();
						break;
					case 3:
						input.nextLine();
						System.out.println();
						System.out.println("3.-Buscar Protagonistas");
						System.out.print("Introduce el nombre del Protagonista que quieres ver: ");
						String nombreProtagonista = input.nextLine();

						gestor.buscarProtagonista(nombreProtagonista);
						break;
					case 4:
						input.nextLine();
						System.out.println();
						System.out.println("4.-Eliminar Protagonistas");
						System.out.print("Introduce el nombre del Protagonista que quieres eliminar: ");
						nombreProtagonista = input.nextLine();

						gestor.eliminarProtagonista(nombreProtagonista);
						break;
					case 5:
						input.nextLine();
						System.out.println();
						System.out.println("Introduce el nombre del protagonista");
						nombreProtagonista = input.nextLine();
						System.out.println("Introduce el nombre del Representante a insertar");
						String nombreRepresentante = input.nextLine();
						gestor.insertarRepresentanteEnProtagonista(nombreProtagonista, nombreRepresentante);
						break;
					default:
						if (eleccion != 6) {
							System.out.println("Opcion no contemplada");
						}
					}
				} while (eleccion != 6);
				eleccion = 0;
				break;
			case 4:
				do {
					System.out.println();
					System.out.println("---------------Menú Tecnicos---------------");
					System.out.println("1.-Alta Tecnicos");
					System.out.println("2.-Listar Tecnicos");
					System.out.println("3.-Buscar Tecnicos");
					System.out.println("4.-Eliminar Tecnicos");
					System.out.println("5.- Salir");
					eleccion = input.nextInt();
					switch (eleccion) {
					case 1:
						input.nextLine();
						System.out.println("1.-Alta Tecnicos");
						System.out.print("Introduce un nombre para el Tecnico: ");
						String nombre = input.nextLine();
						System.out.print("Introduce una ocupacion para el Tecnico: ");
						String ocupacion = input.nextLine();
						gestor.altaTecnico(nombre, ocupacion);

						break;
					case 2:

						System.out.println();
						System.out.println("2.-Listar Tecnicos");
						System.out.println("Listando Tecnico\n");
						gestor.listarTecnicos();
						break;
					case 3:
						input.nextLine();
						System.out.println();
						System.out.println("3.-Buscar Tecnicos");
						System.out.print("Introduce el nombre del Tecnico  que quieres ver: ");
						String nombreTecnico = input.nextLine();

						gestor.buscarTecnico(nombreTecnico);
						break;
					case 4:
						input.nextLine();
						System.out.println();
						System.out.println("4.-Eliminar Tecnicos");
						System.out.print("Introduce el nombre del Tecnico que quieres eliminar: ");
						nombreTecnico = input.nextLine();
						gestor.eliminarTecnico(nombreTecnico);
						break;
					default:
						if (eleccion != 5) {
							System.out.println("Opción no contemplada");
						}
					}
				} while (eleccion != 5);

				eleccion = 0;
				break;
			case 5:
				do {
					System.out.println();
					System.out.println("---------------Menú Tecnicos Especializados---------------");
					System.out.println("1.-Alta Tecnicos Especializados");
					System.out.println("2.-Listar Tecnicos Especializados");
					System.out.println("3.-Buscar Tecnicos Especializados");
					System.out.println("4.-Eliminar Tecnicos Especializados");
					System.out.println("5.- Salir");
					eleccion = input.nextInt();
					switch (eleccion) {
					case 1:
						input.nextLine();
						System.out.println("1.-Alta Tecnicos Especializados");
						System.out.print("Introduce un nombre para el Tecnico Especializado: ");
						String nombre = input.nextLine();
						System.out.print("Introduce una ocupacion para el Tecnico Especializado: ");
						String ocupacion = input.nextLine();
						System.out.println("Introduce la especialidad del Tecnico Especializado");
						String especialidad = input.nextLine();
						gestor.altaTecnicoEspecializado(nombre, ocupacion, especialidad);

						break;
					case 2:

						System.out.println();
						System.out.println("2.-Listar Tecnicos Especializados");
						System.out.println("Listando Tecnicos Especializados\n");
						gestor.listarTecnicosEspecializados();
						break;
					case 3:
						input.nextLine();
						System.out.println();
						System.out.println("3.-Buscar Tecnicos Especializados");
						System.out.print("Introduce el nombre del Tecnico Especializado que quieres ver: ");
						String nombreTecnico = input.nextLine();

						gestor.buscarTecnicoEspecializado(nombreTecnico);
						break;
					case 4:
						input.nextLine();
						System.out.println();
						System.out.println("4.-Eliminar Tecnicos Especializados");
						System.out.print("Introduce el nombre del Tecnico Especializado que quieres eliminar: ");
						nombreTecnico = input.nextLine();
						gestor.eliminarTecnicoEspecializado(nombreTecnico);
						break;
					default:
						if (eleccion != 5) {
							System.out.println("Opción no contemplada");
						}
					}
				} while (eleccion != 5);
				eleccion = 0;
				break;
			case 6:
				do {
					System.out.println();
					System.out.println("---------------Menú Escenario---------------");
					System.out.println("1.-Alta Escenarios");
					System.out.println("2.-Listar Escenarios");
					System.out.println("3.-Buscar Escenarios");
					System.out.println("4.-Eliminar Escenarios");
					System.out.println("5.-Introducir un Espectaculo en un Escenario");
					System.out.println("6.- Salir");
					eleccion = input.nextInt();
					switch (eleccion) {
					case 1:
						input.nextLine();
						System.out.println("1.-Alta Escenarios");
						System.out.print("Introduce un nombre para el Escenario: ");
						String nombre = input.nextLine();
						System.out.print("Introduce una loalizacion para el Escenario: ");
						String localizacion = input.nextLine();
						System.out.println("Introduce la cantidad de aforo maximo del Escenario");
						int aforoMaximo = input.nextInt();
						gestor.altaEscenario(nombre, localizacion, aforoMaximo);

						break;
					case 2:

						System.out.println();
						System.out.println("2.-Listar Escenarios");
						System.out.println("Listando Escenarios\n");
						gestor.listarEscenarios();
						break;
					case 3:
						input.nextLine();
						System.out.println();
						System.out.println("3.-Buscar Escenarios");
						System.out.print("Introduce el nombre del Escenario que quieres ver: ");
						String nombreEscenario = input.nextLine();

						gestor.buscarEscenario(nombreEscenario);
						break;
					case 4:
						input.nextLine();
						System.out.println();
						System.out.println("4.-Eliminar Escenarios");
						System.out.print("Introduce el nombre del Escenario que quieres eliminar: ");
						nombreEscenario = input.nextLine();
						gestor.eliminarEscenario(nombreEscenario);
						break;
					case 5:
						input.nextLine();
						System.out.println();
						System.out.println("5.-Introducir un Espectaculo en un Escenario");
						System.out.println("Introduce el nombre del Escenario al que deseas introducir el Espectaculo");
						nombreEscenario = input.nextLine();
						System.out.println("Introduce el nombre del Espectaculo a introducir");
						String nombreEspectaculo = input.nextLine();
						gestor.introducirEspectaculoEscenario(nombreEspectaculo, nombreEscenario);
						break;
					default:
						if (eleccion != 6) {
							System.out.println("Opción no contemplada");
						}
					}
				} while (eleccion != 6);
				eleccion = 0;
				break;
			case 7:
				do {
					System.out.println();
					System.out.println("---------------Menú Espectaculos---------------");
					System.out.println("1.-Alta Espectaculos");
					System.out.println("2.-Listar Espectaculos");
					System.out.println("3.-Buscar Espectaculos");
					System.out.println("4.-Eliminar Espectaculos");
					System.out.println("5.-Asignar equipo Tecnico a Espectaculo");
					System.out.println("6.-Mostrar equipo Tecnico de un Espectaculo");
					System.out.println("7.-Asignar plantilla de Actores a un Espectaculo");
					System.out.println("8.-Mostrar plantilla de Actores de un Espectaculo");
					System.out.println("9.-Ensayar espectaculo");
					System.out.println("10.-Realizar espectaculo");
					System.out.println("9.- Salir");
					eleccion = input.nextInt();
					switch (eleccion) {
					case 1:
						input.nextLine();
						System.out.println("1.-Alta Espectaculos");
						System.out.print("Introduce un nombre para el Espectaculo: ");
						String nombreEspectaculo = input.nextLine();
						System.out.print("Introduce un genero para el Espectaculo (Drama, comedia...): ");
						String tipoEspectaculo = input.nextLine();

						gestor.altaEspectaculo(nombreEspectaculo, tipoEspectaculo);

						break;
					case 2:

						System.out.println();
						System.out.println("2.-Listar Espectaculo");
						System.out.println("Listando Espectaculos\n");
						gestor.listarEspectaculos();
						break;
					case 3:
						input.nextLine();
						System.out.println();
						System.out.println("3.-Buscar Espectaculos");
						System.out.print("Introduce el nombre del Espectaculo que quieres ver: ");
						nombreEspectaculo = input.nextLine();

						gestor.buscarEspectaculo(nombreEspectaculo);
						break;
					case 4:
						input.nextLine();
						System.out.println();
						System.out.println("4.-Eliminar Espectaculos");
						System.out.print("Introduce el nombre del Espectaculo que quieres eliminar: ");
						nombreEspectaculo = input.nextLine();

						gestor.eliminarEspectaculo(nombreEspectaculo);
						break;
					case 5:
						input.nextLine();
						System.out.println();
						System.out.println("5.-Asignar equipo Tecnico a Espectaculo");
						System.out.println("Introduce el Espectaculo al que quieras introducir el equipo Tecnico previamente dado de alta");
						nombreEspectaculo = input.nextLine();
						
						gestor.asignarEquipoTecnicoEspectaculo(nombreEspectaculo);
						break;
					case 6:
						input.nextLine();
						System.out.println();
						System.out.println("6.-Mostrar equipo Tecnico de un Espectaculo");
						System.out.println("Introduce el nombre del Espectaculo del que quieras revisar el equipo Tecnico");
						nombreEspectaculo =input.nextLine();
						
						gestor.mostrarEquipoTecnicoEspectaculo(nombreEspectaculo);
						break;
					case 7:
						input.nextLine();
						System.out.println();
						System.out.println("7.-Asignar plantilla de Actores a un Espectaculo");
						System.out.println("Introduce el nombre del Espectaculo al que quieras asignar los Actores previamente introducidos");
						nombreEspectaculo =input.nextLine();
						
						gestor.asignarActoresEspectaculo(nombreEspectaculo);
						break;
					case 8:
						input.nextLine();
						System.out.println();
						System.out.println("8.-Mostrar plantilla de Actores de un Espectaculo");
						System.out.println("Introduce el nombre del Espectaculo del que quieras revisar la plantilla de Actores");
						nombreEspectaculo =input.nextLine();
						
						gestor.mostrarRepartoActoresEspectaculo(nombreEspectaculo);
						break;
					case 9:
						input.nextLine();
						System.out.println();
						System.out.println("9.-Ensayar espectaculo");
						System.out.println("Introduce el nombre del Espectaculo que quieras ensayar");
						nombreEspectaculo = input.nextLine();
						
						gestor.prepararEspectaculo(nombreEspectaculo);
						break;
					case 10:
						input.nextLine();
						System.out.println();
						System.out.println("10.-Realizar espectaculo");
						System.out.println("Introduce el nombre del Espectaculo que quieras realizar");
						nombreEspectaculo = input.nextLine();
						gestor.realizarEspectaculo(nombreEspectaculo);
						break;
					default:
						if (eleccion != 10) {
							System.out.println("Opción no contemplada");
						}
					}
				} while (eleccion != 10);
				eleccion = 0;
				break;
			default:
				if (eleccion != 8) {
					System.out.println("Opción no contemplada");
				}
			}

		} while (eleccion != 8);

		System.out.println("El programa ha finalizado");

		input.close();
	}

}
