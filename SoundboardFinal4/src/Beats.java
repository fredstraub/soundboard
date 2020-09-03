//Andy Yu was the author of this class
// This class creates an array list that holds sound objects

import java.util.*;

public class Beats {
	
	EZSound blank = EZ.addSound("null.wav"); //One of the possible sound files, if we decide to go with null beats

	public Beats() {
	}
	
	ArrayList<Sound> beat = new ArrayList<Sound>(8); //An arraylist called beat composed of Sound objects, 
													//the method here is an arraylist in an arraylist to make the grid
													//This arraylist would be the columns. Each column can have any number of the 8 sounds
	
	void addSound(EZSound input) { //Add sound to the beat function. A beat is a single square on the grid, 
									//I have a 16x8 grid, so 128 beats total
		beat.add(new Sound(input)); //I think when key interactions are done, it will go like "If click this square then add sound to this beat"
	}
	
	ArrayList<Sound> getBeat(){  //Return which of the 8 sounds is occupying the column of beats
		return beat;
	}
	

}
