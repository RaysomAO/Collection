package logica;

import java.awt.Image;
import java.io.Serializable;

public abstract class Skills implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String Name;
	Image Icon;
	int BaseMight;
	String Descripction;
	Image SklGenerator;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Image getIcon() {
		return Icon;
	}
	public void setIcon(Image icon) {
		Icon = icon;
	}
	public int getBaseMight() {
		return BaseMight;
	}
	public void setBaseMight(int baseMight) {
		BaseMight = baseMight;
	}
	public String getDescripction() {
		return Descripction;
	}
	public void setDescripction(String descripction) {
		Descripction = descripction;
	}
	public Image getSklGenerator() {
		return SklGenerator;
	}
	public void setSklGenerator(Image sklGenerator) {
		SklGenerator = sklGenerator;
	}
	
	
	
}
