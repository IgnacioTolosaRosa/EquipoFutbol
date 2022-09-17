package Futbol;

public class Futbolista extends Persona {
	
	private int dorsal;
	private String posicion;
	
public Futbolista(String nombre,String apellido,int edad,int dorsal,String posicion) {
	super(nombre,apellido,edad);
	this.dorsal=dorsal;
	this.posicion=posicion;
}

public int getDorsal() {
	return dorsal;
}

public String getPosicion() {
	return posicion;
}

@Override
public void partidoFutbol() {
	System.out.print("Estoy jugando el partido");
}

@Override
public void entrenamiento() {
	System.out.print("Estoy entrenando");
}

public void entrevista() {
	System.out.print("Estoy dando una entrevista");
}
}
	

	



