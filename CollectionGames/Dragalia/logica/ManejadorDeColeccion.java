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
	
	public void NewTrainable(Trainable Nuevo) {////CHEQUEAR ESTE CODIGO NO SE SIENTE BIEEEEN!!!!!!
		int NoExiste= 1;
		for (Trainable Alpha : Personajes) {
			NoExiste = ExisteTrainable(Nuevo, Alpha);
		if(NoExiste == 1)
			System.out.println("Personaje "+ Nuevo.getName() +" ya existe");
		else {
			this.Personajes.add((Adventurer) Nuevo);
			System.out.println("Nuevo personaje agregado");
			}
		}
	}
	
	private int ExisteTrainable(Trainable Nuevo, Trainable Alpha) {//Check for existences of a trainable class
		if(ChequearInstanciaTrain(Nuevo) == 1 && ((Adventurer) Nuevo).getName().equalsIgnoreCase(((Adventurer) Alpha).getName())
				&&((Adventurer) Nuevo).getWeapon().equalsIgnoreCase(((Adventurer) Alpha).getWeapon()) 
				&&((Adventurer) Nuevo).getElement().equalsIgnoreCase(((Adventurer) Alpha).getElement()))
			return 1;//returna que existe un Personaje.
		else if(ChequearInstanciaTrain(Nuevo) == 2 && ((Dragon) Nuevo).getName().equalsIgnoreCase(((Dragon) Alpha).getName()) 
				&&((Dragon) Nuevo).getElement().equalsIgnoreCase(((Dragon) Alpha).getElement()))
			return 2;//returna que existe un Arma.
		else if(ChequearInstanciaTrain(Nuevo) == 3 && ((Weapon) Nuevo).getName().equalsIgnoreCase(((Weapon) Alpha).getName())
				&&((Weapon) Nuevo).getWeaponType().equalsIgnoreCase(((Weapon) Alpha).getWeaponType()) 
				&&((Weapon) Nuevo).getElement().equalsIgnoreCase(((Weapon) Alpha).getElement()))
			return 3;//returna que existe un Dragon.
		else if(ChequearInstanciaTrain(Nuevo) == 4 && ((Wyrmprint) Nuevo).getName().equalsIgnoreCase(((Wyrmprint) Alpha).getName()))
			return 4;//returna que existe una Wyrmprint.
		else
			return 0;
	}
	
	private int ChequearInstanciaTrain(Trainable Nuevo) {//Dice si tenemos un Adven, Drag, Weapon o una Print
			if(Nuevo instanceof Adventurer)
				return 1;
			if(Nuevo instanceof Dragon)
				return 2;
			if(Nuevo instanceof Weapon)
				return 3;
			if(Nuevo instanceof Wyrmprint)
				return 4;
		return 0;
	}
	
}
