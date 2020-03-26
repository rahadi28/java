package com.enigmacamp;

/*dan ini class Tombol*/
public class Button {
	private Clickable action;
	
	void setClickAction(Clickable action) {
		this.action = action;
	}
	
	void doClick(){
        action.onClick();
    }
}