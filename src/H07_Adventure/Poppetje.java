package H07_Adventure;

import java.awt.Color;
import javax.swing.*;

/**
 * Het poppetje
 * @author Toon
 * @version 1.0
 */
public class Poppetje extends SpelElement
{
	/**
	 * het poppetje
	 * @param xPos
	 * @param yPos
	 * @param breedte
	 * @param hoogte
	 * @param kleur
	 * @param naam
	 */
	public Poppetje(int xPos, int yPos, int breedte, int hoogte, Color kleur, String naam)
	{
		super(xPos, yPos, breedte, hoogte, kleur, naam);
		setFocusable(false);
	}
	
	/**
	 * de methode die het poppetje laat bewegen
	 * @param dx
	 * @param dy
	 */
	public void beweeg( int dx, int dy )
	{
		xPos += dx;
		yPos += dy;
		this.setLocation(xPos, yPos);
	}
}
