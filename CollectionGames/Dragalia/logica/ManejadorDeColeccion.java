package logica;

import java.io.Serializable;
import java.util.ArrayList;

public class ManejadorDeColeccion implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Equipo> Equipos = new ArrayList<Equipo>();
	private ArrayList<Adventurer> Personajes = new ArrayList<Adventurer>();
	private ArrayList<Dragon> Dragones = new ArrayList<Dragon>();
	private ArrayList<Wyrmprint> Coleccion = new ArrayList<Wyrmprint>();
	private static ManejadorDeColeccion Instance = null;
	
	private ManejadorDeColeccion() {
		this.Equipos = new ArrayList<>();
		this.Personajes = new ArrayList<>();
		this.Dragones = new ArrayList<>();
		this.Coleccion = new ArrayList<>();
	}
	
	public static ManejadorDeColeccion GetManejadorDeColecion () {
		if (Instance == null)  
			Instance = new ManejadorDeColeccion();
        return Instance;		
	}

	//--------------------------------------------Sets y gets---------------------------------------------------//
	
	public ArrayList<Equipo> getEquipos() {
		return Equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		Equipos = equipos;
	}

	public ArrayList<Adventurer> getPersonajes() {
		return Personajes;
	}

	public void setPersonajes(ArrayList<Adventurer> personajes) {
		Personajes = personajes;
	}

	public ArrayList<Dragon> getDragones() {
		return Dragones;
	}

	public void setDragones(ArrayList<Dragon> dragones) {
		Dragones = dragones;
	}

	public ArrayList<Wyrmprint> getColeccion() {
		return Coleccion;
	}

	public void setColeccion(ArrayList<Wyrmprint> coleccion) {
		Coleccion = coleccion;
	}
//------------------------------------------Funciones principales--------------------------------------------
	
	public void NewTrainable(Trainable Nuevo) {
		for (Trainable Alpha : Personajes) {
		if(Nuevo instanceof Adventurer && !((Adventurer) Nuevo).getName().equalsIgnoreCase(((Adventurer) Alpha).getName())
				&&((Adventurer) Nuevo).getWeapon().equalsIgnoreCase(((Adventurer) Alpha).getWeapon()) 
				&&((Adventurer) Nuevo).getElement().equalsIgnoreCase(((Adventurer) Alpha).getElement()))
				this.Personajes.add(Nuevo);
				System.out.println("Nuevo personaje agregado");
			
		else if(this.Personajes.contains(Nuevo)) 
			System.out.println("Personaje ya existe");
		else 
			System.out.println("Error inesperado :,( ");
		}
	}
	
	private boolean ExisteTrainable(Trainable Nuevo) {
		return false;
	}
	
}
