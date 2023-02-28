package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {

		
		
		Color lightblue = new Color(13, 210, 255);
		StdDraw.setPenColor(lightblue);
		StdDraw.setPenRadius(.03);
		StdDraw.filledCircle(.75, .75, .1);
		StdDraw.setPenColor(Color.black);
		StdDraw.point(.81, .8);
		StdDraw.point(.73, .8);
		StdDraw.setPenRadius(.001);
		StdDraw.arc(.75, .75, .05, 180, 0);
		
	}
}