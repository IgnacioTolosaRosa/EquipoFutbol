package Futbol;

public class Medico extends Persona {
	
	private String titulacion;
	private int añosExperiencia;
	
public Medico(String nombre,String apellido,int edad,String titulacion,int añosExperiencia) {
	super(nombre,apellido,edad);
	this.titulacion=titulacion;
	this.añosExperiencia=añosExperiencia;
}

public String getTitulacion() {
	return titulacion;
}

public int getAñosExperiencia() {
	return añosExperiencia;
}

public void curarLesion() {
	System.out.print("Estoy curando la lesion del jugador");
}

@Override
public void partidoFutbol() {
	System.out.print("Estoy atento a cualquier lesion en el partido");
}

@Override
public void entrenamiento() {
	System.out.print("Estoy atento al entrenamiento por si alguien se lesiona");
}

}
