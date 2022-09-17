package Futbol;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
	
	static Scanner reader = new Scanner(System.in);
	
	static ArrayList<Persona> persona = new ArrayList<Persona>();
	
	static Persona futbolista1 = new Futbolista("Lionel","Messi",34,10,"Delantero");
	static Persona futbolista2 = new Futbolista("Ignacio","Tolosa Rosa",21,9,"Mediocampista");
	
	static Persona entrenador = new Entrenador("Marcelo","Gallardo", 41,"Posesion de pelota");
	
	static Persona medico = new Medico("Pedro","Curador", 54,"Medico traumatologo",25);

	public static void main(String[] args) {
		
		persona.add(futbolista1);
		persona.add(futbolista2);
		persona.add(entrenador);
		persona.add(medico);
		
		menu();
	}

	public static void menu() {
		int opcionMenu;
		do {
			System.out.println("MENU");
			System.out.println("1-VIAJE DE EQUIPO");
			System.out.println("2-ENTRENAMIENTO");
			System.out.println("3-PARTIDO DE FUTBOL");
			System.out.println("4-PLANIFICAR ENTRENAMIENTO");
			System.out.println("5-ENTREVISTA");
			System.out.println("6-CURAR LESION");
			System.out.println("7-SALIR");
			
			System.out.println("DIGITE UNA OPCION DEL MENU:");
			opcionMenu=reader.nextInt(); 
			
			switch(opcionMenu) {
			
			case 1 : viajarEquipo();
					 break;
					 
			case 2 : entrenarEquipo();
					 break;
					 
			case 3 : partidoFutbol();
					 break;
					 
			case 4 : planificarEntrenamiento();
					 break;
					 
			case 5 : darEntrevista();
					 break;
					 
			case 6 : curarLesion();
					 break;
					
			case 7 : break;
			
			default: System.out.print("ERROR, SE EQUIVOCO DE OPCION EN EL MENU");
			
			}
			
		}while(opcionMenu != 7);
	}
	
	public static void viajarEquipo() {
		for(Persona equipo:persona) {
			System.out.print(equipo.getNombre() +" " + equipo.apellido + " " + " ");
			equipo.viajar();
		}
		}
		
	public static void entrenarEquipo() {
		for(Persona equipo:persona) {
		System.out.print(equipo.getNombre() +" " + equipo.apellido + " " + " ");
		equipo.entrenamiento();
		
		
	}
	
	}
	
	public static void partidoFutbol() {
		for(Persona equipo:persona) {
			System.out.print(equipo.getNombre() +" " + equipo.apellido + " " + " ");
			equipo.partidoFutbol();
		}
	}
	
	public static void planificarEntrenamiento() {
		System.out.println(entrenador.getNombre()+ " "+ entrenador.apellido);
		((Entrenador)entrenador).planificarEntrenamiento();
	}
	
	public static void darEntrevista() {
		System.out.println(futbolista1.nombre + " " + futbolista1.apellido);
		((Futbolista)futbolista1).entrevista();
		System.out.println(futbolista2.nombre + " " + futbolista2.apellido);
		((Futbolista)futbolista2).entrevista();
	}
	
	public static void curarLesion() {
		System.out.println(medico.nombre + " " + medico.apellido);
		((Medico)medico).curarLesion();
		
	}
}


