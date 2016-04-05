package H04_kaars1;

import javax.swing.*;
import java.awt.*;

public class Kaars2Paneel extends JPanel
{
	private Kaars2Kaars kaars1, kaars2, kaars3, kaars4, kaars5;
	
	public Kaars2Paneel()
	{
		kaars1 = new Kaars2Kaars(25,50, 300, true);
		kaars2 = new Kaars2Kaars(100,50, 300, true);
		kaars3 = new Kaars2Kaars(175,50, 300, true);
		kaars4 = new Kaars2Kaars(250,50, 300, true);
		kaars5 = new Kaars2Kaars(325,50, 300, true);
	}

	public void brandDeKaars(int aantalPixels)
	{
		kaars1.brand(aantalPixels);
		kaars2.brand(aantalPixels);
		kaars3.brand(aantalPixels);
		kaars4.brand(aantalPixels);
		kaars5.brand(aantalPixels);
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
