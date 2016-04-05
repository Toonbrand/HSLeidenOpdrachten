package H06_SterrenHemel;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.*;
/**
 * De opstartklasse
 * @author Toon
 * @version 1.0
 */
public class SterrenOpstart extends JFrame
{
	private SterrenHemel sterrenHemel;
	
	/**
	 * de opstartklasse
	 */
	public SterrenOpstart()
	{
		setSize(1000,600);
		setTitle("Ik zie een ster...");
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		sterrenHemel = new SterrenHemel();
		
		add(sterrenHemel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	/**
	 * De main
	 * @param args
	 */
	public static void main(String[] args)
	{
		new SterrenOpstart();
	}
}
