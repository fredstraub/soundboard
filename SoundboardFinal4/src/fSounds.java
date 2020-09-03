//Fred Straub was the author of this class
//this class was eventually abandoned in the final project, but certain elements were transfered into other classes

public class fSounds {

	public fSounds() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// timing variables - borrowed from the FluidMachanics program
		long DELAY = 214;
		long lastTime = System.currentTimeMillis();
		
		// sound files
		EZSound clashSound = EZ.addSound("clash.wav");
		EZSound cough = EZ.addSound("ahem_x.wav");
		EZSound alarm = EZ.addSound("alarm_beep.wav");
		
		
		// Create array of sound files
		EZSound[] name2 = new EZSound[4];
		
		// Assign sounds to the array
		name2[0]=clashSound;
		name2[1]=cough;
		name2[2]=alarm;
		

		// Loop because of the "while true" that causes a delay using the timing variables
		// adjusting the timing variables causes the rhythm (timing) to change
		while (true) {
	if (System.currentTimeMillis() - lastTime > DELAY) {
		name2[2].play();
		name2[2].play();
		name2[2].play();
		name2[1].play();
		name2[2].play();
		name2[0].play();
		lastTime = System.currentTimeMillis();
	}}
}}
