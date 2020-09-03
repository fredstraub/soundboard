//The whole team wrote and modified this class
//Soundboard by Andy, Fred, and Shane

import java.awt.Color;
import java.io.FileNotFoundException;

public class Main {

	//State of play
	public static boolean ON = true;
	
	
	public static void main(String[] args) throws InterruptedException, FileNotFoundException{

		//create and fill single array named soundFiles, with file names
		String[] soundFiles = { "null2.wav", "snare.wav", "tom.wav", "lowkick.wav", "bass.wav", "HighBass.wav", "techno.wav", "HIGHTOM.wav"}; // Where to add names of sound files

		//create a single array named sounds and fills with a for loop from the single array soundFiles above
		EZSound[] sounds = new EZSound[8]; // Array of sounds, 9 includes the null and 8 actual sounds
		for (int i = 0; i < 8; i++) {
			sounds[i] = EZ.addSound(soundFiles[i]); // Just add the names of the sound files to the soundFiles[]
													// Again, to help visualize, this adds the sounds occupying the rows
		}

		//create a single array named beats from the Class Beats
		Beats[] beats = new Beats[16]; // The 16 columns, fills the rows with their respective sound files from the
										// sounds[]
		for (int k = 0; k < 16; k++) {
			beats[k] = new Beats();
			for (int n = 0; n < 8; n++) {
				beats[k].addSound(sounds[n]);
			}
		}

		//creates a Grid object from the class Grid
		Grid panel = new Grid(); // Calls addBeats function from Grid class, adds beats to the grid
		panel.addBeats(beats);
	
		
		// set up program screen
		EZ.initialize(1600, 800);
		EZ.setBackgroundColor(new Color(0, 0, 0));
		
		Color color = new Color(255, 255, 255);
		EZ.addText(800, 100, "EZJAVA Beats Machine", color, 100);
		EZ.addText(800, 200, "Shane, Fred, and Andy", color, 30);


		// set up 2Darrays to store x and y coordinates of the buttons
		int xCounter = 190;
		int yCounter = 340;

		//create a 2D array named xCoord for the button spacing
		int[][] xCoord = new int[16][8];
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 8; j++) {
				xCoord[i][j] = xCounter;
			}
			xCounter = xCounter + 80;
		}

		//create a 2D array named xCoord for the button spacing
		int[][] yCoord = new int[16][8];
		for (int j = 0; j < 8; j++) {
			for (int i = 0; i < 16; i++) {
				yCoord[i][j] = yCounter;
			}
			yCounter = yCounter + 50;
		}

		//create a 2D array named controlPanel or Button type from the class Button
		Button[][] controlPannel = new Button[16][8];
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 8; j++) {
				controlPannel[i][j] = new Button(45, 45, xCoord[i][j], yCoord[i][j]);
			}
		}
		
		
		//calls the Font class to construct all of the fonts elements on the screen
		new Font();

		// variables for tracking click interaction
		int clickX = 0;
		int clickY = 0;
		boolean clicked = false;

		while (ON == true) {

			// this code is being used from BugSplat.java
			// If the left mouse button was clicked and released then store the coordinates
			// of the click and set clicked to true
			if (EZInteraction.wasMouseLeftButtonReleased()) {

				clickX = EZInteraction.getXMouse();
				clickY = EZInteraction.getYMouse();
				clicked = true;
			}
			
			
		//Plays the beatmaker
		panel.playSounds();

			// this for loop checks if a button is being clicked and calls the Click1 method
			// if it is being clicked
			for (int i = 0; i < 16; i++) {
				for (int j = 0; j < 8; j++) {

					if (clicked && controlPannel[i][j].isInside(clickX, clickY)) {
						controlPannel[i][j].Click1();
						if (panel.getCell(i, j) == false) {
						panel.setCell(i, j, true);
						System.out.println("Current cell " + i + ", " + j + ": " + panel.getCell(i, j));
						}
						else {
							panel.setCell(i, j, false);
							System.out.println("Current cell " + i + ", " + j + ": " + panel.getCell(i, j));
						}
						clicked = false;
					}
					
				}
			}
			//refresh screen to update changes
			EZ.refreshScreen();
		}

	}

}
