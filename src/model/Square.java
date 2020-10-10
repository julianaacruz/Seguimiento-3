package model;

import processing.core.PApplet;

public class Square extends Shape implements Rotate{
	private PApplet app;

	public Square (float posX, float posY, PApplet app) {
		super(posX,posY);
		this.app = app;
	}
	public void drawSquare(float l) { // l ES EL TAMAÑO INCIAL DEL LADO DEL CUADRADO MAS GRANDE
		app.stroke(255);
		app.fill(0);
		app.rect(posX,posY,l,l);

		if (l>1) {
			
			
			/*app.pushMatrix();
			app.translate(350,250);
			rotateSquare(0.1f);*/
			
			
			drawSquare(l-25); //drawSquare() SE LLAMA A SI MISMA PARA HACER LA RECURSIVIDAD
			
			
			//app.popMatrix();

			}
	}
	@Override
	public void rotateSquare(float angle) {
		app.rotate(angle);
		
	}
}
