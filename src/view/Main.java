package view;

import model.Circle;
import model.Square;
import processing.core.PApplet;

public class Main extends PApplet {

	private Circle circle;
	private Square square;
	private Button squareButton;
	private Button circleButton;
	private Button zoomInButton;
	private Button zoomOutButton;
	
	private int w1,w2,v;

	
	public Main () {
		circle = new Circle (350, 250,this); // DEFINIR CENTRO 
		square = new Square (350,250,this);
		squareButton = new Button (25,40,100,40,"CUADRADOS",this);
		circleButton = new Button (25,100,100,40,"CÍRCULOS",this);
		zoomInButton = new Button (630,100,40,40,"+",this);
		zoomOutButton = new Button (630,150,40,40,"-",this);


	}
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}
	
	public void settings() {
		size (700,500);
	}	
	
	public void setup() {
		w1=250;
		w2=250;
		v=5;

	}
	
	public void draw() {
		background (0);
		noStroke();
		rectMode(CORNER);
		//PINTAR BOTONES
		squareButton.update();
		circleButton.update();
		zoomInButton.update();
		zoomOutButton.update();
		
		//INTERACCIÓN BOTONES
		
		if (circleButton.isClicked()) {	
			w2=250;
		squareButton.Pressed=false;
		zoomInButton.Pressed=false;
		zoomOutButton.Pressed=false;

			if(zoomInButton.isClicked() ) { //ZOOM IN CIRCULO
				System.out.println("zoom in");
				w1=w1+v;
		}
			if(zoomOutButton.isClicked()&& w1>1) {
				System.out.println("zoom out"); // ZOOM OUT CIRCULO
				w1=w1-v;
		}
		circle.drawCircle(w1);
		rectMode(CORNER);
		zoomInButton.render();
		zoomOutButton.render();
		}
		
		if (squareButton.isClicked()) {
			w1=250;
			circleButton.Pressed=false;
			zoomInButton.Pressed=false;
			zoomOutButton.Pressed=false;

				if(zoomInButton.isClicked()) { //ZOOM IN CUADRADO
					System.out.println("zoom in");
					w2=w2+v;
			}
				if(zoomOutButton.isClicked() && w2>1) {
					System.out.println("zoom out"); //ZOOM OUT CUADRADO
					w2=w2-v;
			}
		circleButton.Pressed=false;
		rectMode(CENTER);
		square.drawSquare(w2);
		rectMode(CORNER);
		zoomInButton.render();
		zoomOutButton.render();
		}
		rectMode(CORNER);
		squareButton.render();
		circleButton.render();
		text("Presiona en cualquier lugar para detener el zoom",350,480);
	}
	

}
