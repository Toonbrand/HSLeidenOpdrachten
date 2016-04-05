package H05_pacman;

import java.awt.*;
import java.util.Random;
import javax.swing.*;
import java.awt.event.*;

public class Spook extends JPanel implements ActionListener
{
	private int horPos, verPos, grootte, verRichting, horRichting, horScherm, verScherm, richting, kans;
	private final int WACHTTIJD = 50;
	private Color kleur;
	boolean open;
	Random generator = new Random();
	
	public Spook(int x, int y, int grootte, int verRichting, int horRichting, Color kleur)
	{
		this.horPos = x;
		this.verPos = y;
		this.grootte = grootte/2;
		this.kleur = kleur;
		this.verRichting = verRichting;
		this.horRichting = horRichting;
		
		Timer autoKlik = new Timer( WACHTTIJD, this );
	    autoKlik.start();
	}
	
	
	public void setScherm(int nieuweHorScherm, int nieuweVerScherm)
	{
		horScherm = nieuweHorScherm;
		verScherm = nieuweVerScherm;
	}
	
	public void toggleAnimatie()
	{
		open = !open;
	}
	
	public void verPlaats()
	{
		horPos = horPos + horRichting;
		verPos = verPos + verRichting;
		nietVanScherm();
	}
	
	public void nietVanScherm()
	{
		if (horScherm > 0)
		{
			if (horPos> horScherm)
			{
				horPos = -grootte;
			}
			else if (horPos + horRichting < -grootte)
			{
				horPos = horScherm;
			}
			else if (verPos > verScherm)
			{
				verPos = -grootte;
			}
			else if (verPos < -grootte)
			{
				verPos = verScherm;
			}
		}
	}
	
	public void veranderRichting()
	{
		horRichting = 0;
		verRichting = 0;
		richting = (generator.nextInt(4));
		if(richting == 0)
		{horRichting = 5;}
		else if(richting == 1)
		{horRichting = -5;}
		else if(richting == 2)
		{verRichting = 5;}
		else if(richting == 3)
		{verRichting = -5;}
	}
	
	public void spookVerander()
	{
		kans = (generator.nextInt(101));
		if(kans < 3)//dus 5 op honderd
		{
			veranderRichting();
		}
	}
	
	public void teken(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(kleur);
		g.fillOval(horPos, verPos, grootte, grootte);
		if (open)
		{g.fillRect(horPos, verPos+(grootte/2), grootte, grootte);}
		else
		{g.fillRect(horPos, verPos+(grootte/2), grootte, grootte+3);}
		g.setColor(Color.BLACK);
		g.fillOval(horPos+(grootte/3), verPos+(grootte/3), grootte/6, grootte/6);
		g.fillOval(horPos+(grootte-grootte/3), verPos+(grootte/3), grootte/6, grootte/6);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		spookVerander();
	}
}
