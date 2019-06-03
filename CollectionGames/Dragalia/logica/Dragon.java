package logica;

import java.awt.Image;
import java.io.Serializable;

public class Dragon extends Trainable implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static int DragonNumber = 10000;
	int code;
	String Element;
	String Description;
	DmgSkl Main;
	PassSkl First;
	PassSkl Second;
	PassSkl Third;
	PassSkl Fouth;
	Image Icon;
	Image FullBody;
	int StatueBuff;
	
	
	public static int getDragonNumber() {
		return DragonNumber;
	}
	public static void AddDragon() {
		DragonNumber++;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
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
	public int getStatueBuff() {
		return StatueBuff;
	}
	public void setStatueBuff(int statueBuff) {
		StatueBuff = statueBuff;
	}
	
}
