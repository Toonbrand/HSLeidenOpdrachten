package H06_SterrenHemel;

import java.awt.*;
import javax.swing.*;

/**
 * De ster
 * @author Toon
 * @version 1.0
 */
public class Ster extends JPanel
{
	private int horPos, verPos, diameter;
	public Color kleur;
	
	/**
	 * De ster
	 * @param x
	 * @param y
	 * @param grootte
	 * @param kleur
	 */
	public Ster(int x, int y, int grootte, Color kleur)
	{
		this.horPos = x;
		this.verPos = y;
		this.diameter = grootte;
		this.kleur = kleur;
	}
	
	/**
	 * Zorgt dat de ster groeit
	 */
	public void evolueer()
	{
		if (diameter < 80)
		{
			diameter = diameter + 2;
			horPos=horPos-1;
			verPos=verPos-1;
		}
	}
	
	/**
	 * Tekent de ster
	 * @param g
	 */
	public void teken(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(kleur);
		g.fillOval(horPos+diameter/3, verPos, diameter/3, diameter);
		g.fillOval(horPos, verPos+diameter/3, diameter, diameter/3);
	}
	
}
