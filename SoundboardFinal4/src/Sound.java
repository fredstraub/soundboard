//Andy Yu was the author of this class
//This class has functions to control sounds.


public class Sound {
	EZSound sound;
	boolean play = false;
	
	//instantiate an EZSound
	public Sound(EZSound input) {
		sound = input;
	}
	
	//Getter for sound
	EZSound getSound() {
		return sound;
	}
	
	//Getter for play boolean value
	boolean getPlay() {
		return play;
	}
	
	//Setter to determine play or no play
	void setPlay(boolean dot) {
		play = dot;
	}
//
}
