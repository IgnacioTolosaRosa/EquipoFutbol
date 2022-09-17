package Futbol;

public class Entrenador extends Persona {
	
	private String estrategia;
	
public Entrenador(String nombre,String apellido,int edad,String estrategia) {
	super(nombre,apellido,edad);
	this.estrategia=estrategia;
}

public String getEstrategia() {
	return estrategia;
}

public void planificarEntrenamiento() {
	System.out.print("Estoy planificando un entrenamiento");
}

@Override
public void partidoFutbol() {
	System.out.print("Estoy dirigiendo el partido desde el banco");
}

@Override
public void entrenamiento() {
	System.out.print("Estoy dirigiendo el entrenamiento");
}
}
