package H07_Adventure;

import java.awt.*;
import java.util.*;
import javax.swing.*;

/**
 * Het spelelement paneel
 * @author Toon
 * @version 1.0
 */
public class SpelElement extends JPanel
{
	public int xPos, yPos, breedte, hoogte;
	public Color kleur;
	public String naam;
	
	/**
	 * het spelelement
	 * @param xPos
	 * @param yPos
	 * @param breedte
	 * @param hoogte
	 * @param kleur
	 * @param naam
	 */
	public SpelElement(int xPos, int yPos, int breedte, int hoogte, Color kleur, String naam)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.breedte = breedte;
		this.hoogte = hoogte;
		this.kleur = kleur;
		this.naam = naam;
		setFocusable(false);
	}
	
	/**
	 * Tekend het element
	 */
	public void paintComponent(Graphics g)
	{
		g.setColor(kleur);
		g.fillRect(0,0,breedte, hoogte);
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, breedte-1, hoogte-1);
		g.drawString(naam, breedte/3, hoogte/2);
	}
	
	/**
	 * Returnd de xPos
	 * @return
	 */
	public int getxPos() 
	{
		return xPos;
	}

	/**
	 * Returnd de yPos
	 * @return
	 */
	public int getyPos() 
	{
		return yPos;
	}
	
	/**
	 * Returnd de breedte
	 * @return
	 */
	public int getBreedte()
	{
		return breedte;
	}
	
	/**
	 * Returnd de hoogte
	 * @return
	 */
	public int getHoogte()
	{
		return hoogte;
	}
}
