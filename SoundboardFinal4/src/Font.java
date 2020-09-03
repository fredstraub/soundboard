//Fred Straub was the author of this class
// This class has a file reader and prints the text content on the screen

import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Font {

	//member variables for the class
	private Color c = new Color(255, 255, 255);
	private int fs = 20;
	private int posX;
	private int posY;

	//class constructor that uses a file reader for the variable values
	public Font() throws FileNotFoundException {
		FileReader fr = new FileReader("text.txt");
		Scanner sc = new Scanner(fr);

		while (sc.hasNextLine()) {
			int x;
			int y;
			String name;

			x = sc.nextInt();
			y = sc.nextInt();
			name = sc.next();
			posX = x;
			posY = y;
			EZ.addText(posX, posY, name, c, fs);
		}
		sc.close();
	}
}