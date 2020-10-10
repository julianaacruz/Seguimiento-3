package view;

import processing.core.PApplet;
import processing.core.PConstants;

//CLASE PARA CREAR LOS BOTONES DE LA INTERFAZ

public class Button {
	private PApplet app;
	private int posX;
	private int posY;
	private int height;
	private int width;
	String Text;
	boolean Pressed = false;
	boolean Clicked = false;

	public Button (int x, int y, int w, int h, String t, PApplet app) {
		posX=x;
		posY=y;
		width=w;
		height=h;
		Text=t;
		this.app = app;
	}
	
	public void update () { //VALIDAR SI ESTA SIENDO CLICKEADO
		if (app.mousePressed == true && Pressed == false) {
			Pressed = true;
			if (app.mouseX>=posX && app.mouseX <= posX+width && app.mouseY >= posY && app.mouseY <= posY+height) {
				Clicked = true; 
				
			}
			else {
				Clicked = false;
				
			}
			if(app.mousePressed!=true) {
				Pressed = false;
			}
			
		}
	}
	
	public void render() { //PINTA EL BOTÓN
		app.fill (50);
		app.rect(posX,posY,width,height,5);
		app.fill (255);
		app.textAlign(PConstants.CENTER,PConstants.CENTER);
		app.text(Text,posX+(width/2),posY+(height/2));
	}
	
	public boolean isClicked() { //SI EL BOTÓN HA SIDO CLICKEADO RETORNA TRUE
		return Clicked;
	}
	public boolean isPressed() { //SI EL MOUSE SE ESTA PRESIONANDO RETORNA TRUE
		return Pressed;
	}
}
