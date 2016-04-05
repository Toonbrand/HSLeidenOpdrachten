package H04_kaars2;

import javax.swing.*;
import java.awt.*;

public class Kaars3Paneel extends JPanel
{
	private Kaars3Kaars kaars1, kaars2, kaars3, kaars4, kaars5;
	
	public Kaars3Paneel()
	{
		//xPos, yPos, lengte, breedte, aan/uit, kleur
		kaars1 = new Kaars3Kaars(25,50, 300, 50, true, Color.GREEN);
		kaars2 = new Kaars3Kaars(100,50, 300, 50, true, Color.ORANGE);
		kaars3 = new Kaars3Kaars(175,50, 300, 50, true, Color.BLUE);
		kaars4 = new Kaars3Kaars(250,50, 300, 50,true, Color.PINK);
		kaars5 = new Kaars3Kaars(325,50, 300, 100,true, Color.RED);
	}

	public void brandDeKaars(int aantalPixels)
	{
		kaars1.brand(aantalPixels);
		kaars2.brand(aantalPixels);
		kaars3.brand(aantalPixels);
		kaars4.brand(aantalPixels);
		kaars5.brand(aantalPixels/2);
	}
	
	public void regelKaarsVlam(int kaarsnummer)
	{
		if (kaarsnummer == 1)
		{kaars1.toggleAan();}
		if (kaarsnummer == 2)
		kaars2.toggleAan();
		if (kaarsnummer == 3)
		kaars3.toggleAan();
		if (kaarsnummer == 4)
		kaars4.toggleAan();
		if (kaarsnummer == 5)
		kaars5.toggleAan();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		kaars1.teken(g);
		kaars2.teken(g);
		kaars3.teken(g);
		kaars4.teken(g);
		kaars5.teken(g);
	}
	
}
