package H06_SterrenHemel;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

/**
 * Paneel die de sterren maakt
 * @author Toon
 * @version 1.0
 */
public class SterrenHemel extends JPanel implements MouseWheelListener
{
	/**
	 * De lijst met sterren
	 */
	private Ster[] ster;
	/**
	 * Maakt een nieuwe sterrenhemel
	 */
	public SterrenHemel()
	{
		Random generator = new Random();
		addMouseWheelListener(this);
		setBackground(Color.BLUE);
		
		ster = new Ster[100];
		
		for(int i = 0; i < ster.length-20; i++ )
		{
			int x = generator.nextInt(950);
			int y = generator.nextInt(550);
			int grootte = generator.nextInt(25)+10;
			Color kleur = Color.yellow;
			ster[i] = new Ster(x,y,grootte,kleur);
		}
		
		for(int i = 80; i < ster.length; i++ )
		{
			int x = generator.nextInt(950);
			int y = generator.nextInt(550);
			int grootte = generator.nextInt(25+10);
			Color kleur = Color.yellow;
			ster[i] = new RodeSter(x,y,grootte,kleur);
		}
		
	}
	/**
	 * De tekenmethode
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for ( Ster kloteSter : ster )
			kloteSter.teken(g);

	}

	/**
	 * Zorgt ervoor dat hij reageerd op het muiswieltje
	 */
	public void mouseWheelMoved(MouseWheelEvent e) 
	{
		
		for ( Ster kloteSter : ster )
			kloteSter.evolueer();
		
		repaint();
	}
}
