package programa;

import java.util.Scanner;

import clases.GestorEspectaculos;

public class Programa {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		
		GestorEspectaculos gestor = new GestorEspectaculos ();
		
		
		
		System.out.println("-----Alta de representantes y listamos-----");
		gestor.AltaRepresentante("Daniel", "industrias LM", "655580687");
		gestor.AltaRepresentante("Juan", "LanMar SL", "632654987");
		System.out.println();

		
		System.out.println("---ELiminar un representante----");
		gestor.listarRepresentantes();
		gestor.eliminarRepresentante("Juan");
		gestor.listarRepresentantes();
		System.out.println();
		
		System.out.println("-----Alta de Actores y listamos-----");
		gestor.altaActor("Danonene", 20);
		gestor.altaActor("Rubenoncio", 22);
		gestor.listarActores();
		System.out.println();
		
		System.out.println("-----Eliminar un Actor y listamos-----");
		gestor.eliminarActor("Rubenoncio");
		gestor.listarActores();
		System.out.println();
		
		
	}

}
