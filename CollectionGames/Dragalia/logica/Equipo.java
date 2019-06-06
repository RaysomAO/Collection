package logica;

import java.io.Serializable;

public class Equipo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	Adventurer Personaje1;
	Adventurer Personaje2;
	Adventurer Personaje3;
	Adventurer Personaje4;
	int TotalMight;
	String LeaderElement;
	int TotalStrg;
	String PasivesAbilities;
	int HiddenMight;
	
	
	public int getHiddenMight() {
		return HiddenMight;
	}
	public void setHiddenMight(int hiddenMight) {
		HiddenMight = hiddenMight;
	}
	public Adventurer getPersonaje1() {
		return Personaje1;
	}
	public void setPersonaje1(Adventurer personaje1) {
		Personaje1 = personaje1;
	}
	public Adventurer getPersonaje2() {
		return Personaje2;
	}
	public void setPersonaje2(Adventurer personaje2) {
		Personaje2 = personaje2;
	}
	public Adventurer getPersonaje3() {
		return Personaje3;
	}
	public void setPersonaje3(Adventurer personaje3) {
		Personaje3 = personaje3;
	}
	public Adventurer getPersonaje4() {
		return Personaje4;
	}
	public void setPersonaje4(Adventurer personaje4) {
		Personaje4 = personaje4;
	}
	public int getTotalMight() {
		return TotalMight;
	}
	public void setTotalMight(int totalMight) {
		TotalMight = totalMight;
	}
	public String getLeaderElement() {
		return LeaderElement;
	}
	public void setLeaderElement(String leaderElement) {
		LeaderElement = leaderElement;
	}
	public int getTotalStrg() {
		return TotalStrg;
	}
	public void setTotalStrg(int totalStrg) {
		TotalStrg = totalStrg;
	}
	public String getPasivesAbilities() {
		return PasivesAbilities;
	}
	public void setPasivesAbilities(String pasivesAbilities) {
		PasivesAbilities = pasivesAbilities;
	}
	
	
	
}
