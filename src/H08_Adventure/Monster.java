package H08_Adventure;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;

/**
 * Het monster
 * @author Toon
 * @version 1.0
 */
public class Monster extends Poppetje implements ActionListener 
{
	private final int WACHTTIJD = 50;
	private final int AFSTAND = 2; //
	private int horRichting = 5, verRichting = 0;
	Random generator = new Random();
	
	/**
	 * Het mosnter
	 * @param xPos
	 * @param yPos
	 * @param breedte
	 * @param hoogte
	 * @param kleur
	 * @param naam
	 */
	public Monster(int xPos, int yPos, int breedte, int hoogte, Color kleur, ImageIcon afbeelding)
	{ 
		super(xPos, yPos, breedte, hoogte, kleur, afbeelding);
		setFocusable(false);
		
		Timer autoKlik = new Timer( WACHTTIJD, this );
	    autoKlik.start();
	}
	
	/**
	 * De methode die een willekeurige richting bepaald
	 */
	public void veranderRichting()
	{
		if(generator.nextInt(101) < 6)
		{
			horRichting = 0;
			verRichting = 0;
			int richting = (generator.nextInt(4));
			if(richting == 0)
			{horRichting = AFSTAND;}
			else if(richting == 1)
			{horRichting = -AFSTAND;}
			else if(richting == 2)
			{verRichting = AFSTAND;}
			else if(richting == 3)
			{verRichting = -AFSTAND;}
		}
	}

	/**
	 * De actie die telkens gebeurd
	 */
	public void actionPerformed(ActionEvent e) 
	{
		veranderRichting();
		beweeg(horRichting, verRichting);
	}
	
	/**
	 * De methode die het monster tekend
	 */
	public void paintComponent(Graphics g)
	{
		g.drawImage(afbeelding.getImage(), 0, 0, breedte, hoogte, this);
	}
}
