package logica;

import java.awt.Image;
import java.io.Serializable;

public class Weapon extends Trainable implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	String Type;
	String Element;
	String Description;
	DmgSkl Main;
	PassSkl First;
	PassSkl Second;
	PassSkl Third;
	PassSkl Fouth;
	Image Icon;
	Image FullBody;
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public String getElement() {
		return Element;
	}
	public void setElement(String element) {
		Element = element;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public DmgSkl getMain() {
		return Main;
	}
	public void setMain(DmgSkl main) {
		Main = main;
	}
	public PassSkl getFirst() {
		return First;
	}
	public void setFirst(PassSkl first) {
		First = first;
	}
	public PassSkl getSecond() {
		return Second;
	}
	public void setSecond(PassSkl second) {
		Second = second;
	}
	public PassSkl getThird() {
		return Third;
	}
	public void setThird(PassSkl third) {
		Third = third;
	}
	public PassSkl getFouth() {
		return Fouth;
	}
	public void setFouth(PassSkl fouth) {
		Fouth = fouth;
	}
	public Image getIcon() {
		return Icon;
	}
	public void setIcon(Image icon) {
		Icon = icon;
	}
	public Image getFullBody() {
		return FullBody;
	}
	public void setFullBody(Image fullBody) {
		FullBody = fullBody;
	}
	
	
}
