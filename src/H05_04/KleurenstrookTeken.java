package H05_04;

import java.awt.*;
import javax.swing.*;
import java.util.Random;

public class KleurenstrookTeken  extends JPanel
{
	Random generator = new Random();
	KleurenstrookBediening kleurenstrookBediening;
	
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		final int BREEDTE_RECHTHOEK = 30; // smalle rechthoek
		int rechts = getWidth(); // breedte van scherm
		int beneden = getHeight(); // hoogte van scherm
		
		final int KLEURGRENS = 85; // een derde van 255
		Color[ ] kleuren = new Color[3];
		kleuren[0] = kleurenstrookBediening.getKleurEen();
		kleuren[1] = kleurenstrookBediening.getKleurTwee();
		kleuren[2] = kleurenstrookBediening.getKleurDrie();
		
		int kleurnummer = 0; // beginnen met nul
		for (int xLoc=0; xLoc <= rechts; xLoc+=BREEDTE_RECHTHOEK) // hele scherm
		{
			g.setColor(kleuren[kleurnummer]);
			g.fillRect(xLoc, 0, BREEDTE_RECHTHOEK, beneden);
			kleurnummer = (kleurnummer + 1) % 3; // volgende kleur
		}
	}
}
