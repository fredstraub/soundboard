//Shane Severino was the author of this class
//This class creates the 2D array that prints the grid pattern on the screen and allows the user to select
// grid points using their mouse

import java.awt.Color;

public class Button {
	
	//member variables for the class
	private int length;
	private int width;
	private int posX;
	private int posY;
	private EZRectangle skin;
	private int clickCount;
	
	//constructor for making a Button
	public Button(int l, int w, int x, int y) {
		
		length = l;
		width = w;
		posX = x;
		posY = y;
		skin = EZ.addRectangle(posX, posY, width, length, new Color(0,150,250), true);
		
	}
	
	//method that will change the color of the button when clicked first
	public void Click1() {
		clickCount = clickCount + 1;
		if(clickCount % 2 == 1) {
			skin = EZ.addRectangle(posX, posY, width, length, new Color(0,250,150), true);
		}	
		if(clickCount % 2 == 0) {
			skin = EZ.addRectangle(posX, posY, width, length, new Color(0,150,250), true);
		}	
	}
	
	//method to check if two points are inside a button
	public boolean isInside(int a, int b) {
		
		return skin.isPointInElement(a, b);
		
	}

}
