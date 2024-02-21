package studio4;

import java.io.File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		Color c = new Color(r, g, b);
		boolean filled = in.nextBoolean();
		
		
		if (shape.equals("rectangle")) {
			Double x = in.nextDouble();
			Double y = in.nextDouble();
			Double halfWidth = in.nextDouble();
			Double halfHeight = in.nextDouble();
			StdDraw.setPenColor(c);
			
			if(filled == false) {
			StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
			if(filled == true) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
				}
	}
		
		else if (shape.equals("triangle")) {
			
			
			
	}
		
		else if (shape.equals("ellipse")) {
			Double x = in.nextDouble();
			Double y = in.nextDouble();
			Double halfWidth = in.nextDouble();
			Double halfHeight = in.nextDouble();
			StdDraw.setPenColor(c);
			
			if(filled == false) {
			StdDraw.ellipse(x, y, halfWidth, halfHeight);
			}
			if(filled == true) {
				StdDraw.filledEllipse(x, y, halfWidth, halfHeight);
				}
			
			
	}
}
}
