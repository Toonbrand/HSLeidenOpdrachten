package H07_Museum;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;

/**
 * De opstartklasse
 * @author Toon
 * @version 1.0
 */
public class MuseumApp extends JFrame
{
	MuseumPaneel museumPaneel;
	
	/**
	 * De opstartklasse
	 */
	public MuseumApp()
	{
		setSize(450,150);
		setTitle("Voorbeeld met events");
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		museumPaneel = new MuseumPaneel();
	
		add(museumPaneel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	/**
	 * De main
	 * @param args
	 */
	public static void main(String[] args)
	{
		new MuseumApp();
	}
}
