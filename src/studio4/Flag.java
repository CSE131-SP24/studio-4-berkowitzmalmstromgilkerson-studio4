package studio4;

import java.io.File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdDraw;
import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color black = new Color(0, 0, 0);
		Color red = new Color(162, 17, 17);
		Color white = new Color(255,255,255);
		
		
		StdDraw.setPenColor(red);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.5);
		
		StdDraw.setPenColor(black);
		StdDraw.filledEllipse(.5, 0.5, 0.25, 0.25);
		
		StdDraw.setPenColor(white);
		StdDraw.filledEllipse(0.5,0.5,0.2,0.2);
		
		StdDraw.setPenColor(black);
		StdDraw.filledRectangle(0.5, 0.5, 0.025, 0.15);
		StdDraw.filledRectangle(0.5, 0.5, 0.15, 0.025);
		StdDraw.filledCircle(0.5, 0.5, 0.1);

		StdDraw.filledEllipse(0, 0, 0.5, 0.125);
		StdDraw.filledEllipse(0, 0, 0.125, 0.75);
		StdDraw.filledCircle(0, 0, 0.3);

		StdDraw.filledEllipse(1, 0, 0.5, 0.125);
		StdDraw.filledEllipse(1, 0, 0.125, 0.75);
		StdDraw.filledCircle(1, 0, 0.3);
		
		StdDraw.filledCircle(0.3, 0.9, 0.025);
		StdDraw.filledRectangle(0.275, 0.9, 0.01, 0.05);
		StdDraw.filledRectangle(0.325, 0.9, 0.01, 0.05);
		
		StdDraw.filledCircle(0.7, 0.9, 0.025);
		StdDraw.filledRectangle(0.675, 0.9, 0.01, 0.05);
		StdDraw.filledRectangle(0.725, 0.9, 0.01, 0.05);

	}
}