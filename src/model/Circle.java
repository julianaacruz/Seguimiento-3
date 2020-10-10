package model;

import processing.core.PApplet;

public class Circle extends Shape{

	private PApplet app;

	public Circle (float posX, float posY, PApplet app) {
		super(posX,posY);
		this.app = app;
	}
	
	public void drawCircle(float d) {	// d ES EL DIAMETRO INCIAL DEL CIRCULO MÁS GRANDE
		app.stroke(255);
		app.fill(0);
		app.ellipse(posX,posY,d,d);
		if (d>1) {
		drawCircle(d-25); //drawCircle() SE LLAMA A SI MISMA PARA HACER LA RECURSIVIDAD
		}
	}
}
