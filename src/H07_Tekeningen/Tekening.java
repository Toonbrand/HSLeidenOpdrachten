package H07_Tekeningen;

import java.awt.*;
import java.util.*;

/**
 * De tekening
 * @author Toon
 * @version
 */
public class Tekening 
{
	private int x, y;
	private Color kleur;
	/**
	 * De lijst met de punten van de tekening
	 */
	private ArrayList <Point> punten;
	
	/**
	 * De tekening
	 * @param kleur
	 */
	public Tekening(Color kleur)
	{
		this.kleur = kleur;
		punten = new ArrayList<Point>();
	}
	
	/**
	 * Voegt een punt aan de tekening toe
	 * @param punt
	 */
	public void voegPuntToe(Point punt)
	{
		punten.add(punt);
	}
	
	/**
	 * Beweegt de tekening
	 * @param xRichting
	 * @param yRichting
	 */
	public void beweeg(int xRichting, int yRichting)
	{
		for(int i=0;i<punten.size();i++)
		{
			punten.get(i).x = punten.get(i).x + xRichting;
			punten.get(i).y = punten.get(i).y + yRichting;
		}
	}
	
	/**
	 * Tekend de tekening
	 **/
	public void teken(Graphics g)
	{
		g.setColor(kleur);
		for(Point p : punten)
		{
			g.fillRect(p.x, p.y, 1, 1);
		}
		
		for(int i=1; i < punten.size(); i++)
		{
			g.drawLine(punten.get(i).x,punten.get(i).y,punten.get(i-1).x,punten.get(i-1).y);
		}
	}
}
