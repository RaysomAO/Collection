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

}
