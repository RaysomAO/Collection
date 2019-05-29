package logica;

import java.awt.Image;

public class Wyrmprint extends Trainable{
		
	int Unbind;
	String Description1;
	String Description2;
	String Description3;
	String Description4;
	String Description5;
	PassSkl First;
	PassSkl Second;
	PassSkl Third;
	PassSkl Event;
	Image Icon;
	Image FullBody;
	Image UnbindIcon;
	Image UnbindFullBody;
	//Grow always get round up after level 55
	public int getUnbind() {
		return Unbind;
	}
	public void setUnbind(int unbind) {
		Unbind = unbind;
	}
	public String getDescription1() {
		return Description1;
	}
	public void setDescription1(String description1) {
		Description1 = description1;
	}
	public String getDescription2() {
		return Description2;
	}
	public void setDescription2(String description2) {
		Description2 = description2;
	}
	public String getDescription3() {
		return Description3;
	}
	public void setDescription3(String description3) {
		Description3 = description3;
	}
	public String getDescription4() {
		return Description4;
	}
	public void setDescription4(String description4) {
		Description4 = description4;
	}
	public String getDescription5() {
		return Description5;
	}
	public void setDescription5(String description5) {
		Description5 = description5;
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
	public PassSkl getEvent() {
		return Event;
	}
	public void setEvent(PassSkl event) {
		Event = event;
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
	public Image getUnbindIcon() {
		return UnbindIcon;
	}
	public void setUnbindIcon(Image unbindIcon) {
		UnbindIcon = unbindIcon;
	}
	public Image getUnbindFullBody() {
		return UnbindFullBody;
	}
	public void setUnbindFullBody(Image unbindFullBody) {
		UnbindFullBody = unbindFullBody;
	}
	
	
}