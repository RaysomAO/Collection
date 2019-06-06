package logica;

import java.io.Serializable;

public abstract class Trainable implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String Name;
	int Star;
	int Level;
	int BaseHP;
	int MaxHp;
	int BaseStrg;
	int MaxStrg;//After 55 Round up update getter
	int Hp;
	int Strg;
	int Exp;
	int TotalExp;
	int Maxexp;//Update all ecuations
	int Might;
	
	
	public int getHp() {
		return Hp;
	}
	public void setHp() {
		Hp = (this.MaxHp-this.BaseHP)*this.Level+ this.BaseHP;
	}
	public int getStrg() {
		return Strg;
	}
	public void setStrg() {
		Strg = (this.MaxStrg-this.BaseStrg)*this.Level+ this.BaseStrg;
	}
	public int getMight() {
		return Might;
	}
	public void setMight(int might) {
		Might = might;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getStar() {
		return Star;
	}
	public void setStar(int star) {
		Star = star;
	}
	public int getLevel() {
		return Level;
	}
	public void setLevel(int level) {
		Level = level;
	}
	public int getBaseHP() {
		return BaseHP;
	}
	public void setBaseHP(int baseHP) {
		BaseHP = baseHP;
	}
	public int getMaxHp() {
		return MaxHp;
	}
	public void setMaxHp(int maxHp) {
		MaxHp = maxHp;
	}
	public int getBaseStrg() {
		return BaseStrg;
	}
	public void setBaseStrg(int baseStrg) {
		BaseStrg = baseStrg;
	}
	public int getMaxStrg() {
		return MaxStrg;
	}
	public void setMaxStrg(int maxStrg) {
		MaxStrg = maxStrg;
	}
	public int getExp() {
		return Exp;
	}
	public void setExp(int exp) {
		Exp = exp;
	}
	public int getTotalExp() {
		return TotalExp;
	}
	public void setTotalExp(int totalExp) {
		TotalExp = totalExp;
	}
	public int getMaxexp() {
		return Maxexp;
	}
	public void setMaxexp(int maxexp) {
		Maxexp = maxexp;
	}

	
}
