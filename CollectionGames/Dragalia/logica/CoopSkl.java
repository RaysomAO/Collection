package logica;

public class CoopSkl extends Skills {
	private static int Offense = 10;
	private static int Healing = 20;
	private static int Other = 15;
	
	private int Def;
	private int Strg;
	private int Hp;
	private int Skillhaste;
	private int DrgHaste;
	private int CrtRate;
	private int Reco;
	private int SklDmg;
	
	public int getCoop(String Weapon) {
		switch (Weapon) {
		case "Axe":
			CalcularCoop(Weapon);
			return Def;
		case "Lance":
			CalcularCoop(Weapon);
			return Hp;
		case "Blade":
			CalcularCoop(Weapon);
			return Strg;
		case "Bow":
			CalcularCoop(Weapon);
			return Skillhaste;
		case "Dagger":
			CalcularCoop(Weapon);
			return CrtRate;
		case "Sword":
			CalcularCoop(Weapon);
			return DrgHaste;
		case "Staff":
			CalcularCoop(Weapon);
			return Reco;
		case "Wand":
			CalcularCoop(Weapon);
			return SklDmg;
			
		default :
			return 0;
			
		}
		
	}
	
	
	private void CalcularCoop(String weapon) {
		// TODO Auto-generated method stub
		
	}

	public static int getOffense() {
		return Offense;
	}
	public static int getHealing() {
		return Healing;
	}
	public static int getOther() {
		return Other;
	}
	
	
	

}
