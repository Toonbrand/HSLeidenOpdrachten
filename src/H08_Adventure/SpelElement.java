package H08_Adventure;

import java.awt.*;
import java.io.Serializable;
import java.util.*;
import javax.swing.*;

/**
 * Het spelelement paneel
 * @author Toon
 * @version 1.0
 */
public class SpelElement extends JPanel implements Serializable
{
	public int xPos, yPos, breedte, hoogte;
	public Color kleur;
	public ImageIcon afbeelding;
	
	/**
	 * het spelelement
	 * @param xPos
	 * @param yPos
	 * @param breedte
	 * @param hoogte
	 * @param kleur
	 * @param naam
	 */
	public SpelElement(int xPos, int yPos, int breedte, int hoogte, Color kleur, ImageIcon afbeelding)
	{
		this.xPos = xPos;
		this.yPos = yPos;
		this.breedte = breedte;
		this.hoogte = hoogte;
		this.kleur = kleur;
		this.afbeelding = afbeelding;
		setFocusable(false);
	}
	
	/**
	 * Tekend het element
	 */
	public void paintComponent(Graphics g)
	{
		g.drawImage(afbeelding.getImage(), 0, 0, breedte, hoogte, this);
		
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
