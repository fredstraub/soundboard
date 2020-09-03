//Andy Yu was the author of this class
//This class uses an array list to play the sounds as they are selected by the user,
//the selections are recorded as boolean values

import java.util.*;

public class Grid{
		
	ArrayList<Beats> grid = new ArrayList<Beats>(16); //This arraylist would be the row, a row will have the same sound file throughout, but not 
													//every beat of the row will be played

	public Grid() {
		
	}
	
	void addBeats(Beats[] input) {
		for (int i = 0; i < 16; i++) { //Adds the sound file the fills the row, we have 8 sounds so 8 rows
		grid.add(input[i]); 
		}
	}
	
	void setCell(int column, int row, boolean value) {       //Use to call upon each cell for key interactions, based on the position of the square on the grid,
		grid.get(column).getBeat().get(row).setPlay(value);  //return position, return sound file, set it to play or not to play
	}
	
	boolean getCell(int column, int row) {       //Use to call upon each cell for key interactions, based on the position of the square on the grid,
		System.out.println(grid.get(0));		//Helps me keep track of position
		return grid.get(column).getBeat().get(row).getPlay();  //return position, return sound file, set it to play or not to play
	}
	
	
	//function that plays and pauses the beat maker, iterates through the grid, checks if the square has been clicked
	//then plays it
	//Key to this is the Thread.sleep at a millisecond rate that popular music beats use
	//Prevents iteration at rapid speed, pauses enough to differentiate sounds
	void playSounds() throws InterruptedException{
		for (int i = 0; i < 16; i++) {
			for (int j = 0; j < 8; j++) {
				if (this.getCell(i, j) == true) {
					grid.get(i).getBeat().get(j).getSound().play();
					Thread.sleep(240);
				}
				
			}
			}
	}
	}

