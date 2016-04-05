package H05_05;

import java.awt.*;
import javax.swing.*;

import H05_04.KleurenstrookBediening;

import java.util.Random;

public class Kleurenstrook2Teken  extends JPanel
{
	Kleurenstrook2Bediening kleurenstrook2Bediening;
	public int breedte = kleurenstrook2Bediening.getBreedte();
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int rechts = getWidth(); // breedte van scherm
		int beneden = getHeight(); // hoogte van scherm
		
		Color[ ] kleuren = new Color[8];
		kleuren[0] = new Color(221,0,0);
		kleuren[1] = new Color(254,98,48);
		kleuren[2] = new Color(254,246,0);
		kleuren[3] = new Color(0,188,0);
		kleuren[4] = new Color(0,155,254);
		kleuren[5] = new Color(0,0,131);
		kleuren[6] = new Color(48,155,0);
		
		
		int kleurnummer = 0; // beginnen met nul
		for (int xLoc=0; xLoc <= rechts; xLoc+=breedte) // hele scherm
		{
			g.setColor(kleuren[kleurnummer]);
			g.fillRect(xLoc, 0, breedte, beneden);
			kleurnummer = (kleurnummer + 1) % 7; // volgende kleur
		}
	}
}
