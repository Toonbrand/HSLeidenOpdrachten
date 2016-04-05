package tentamen_01;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Wolk extends JPanel
{
	private int x, y;
	private int horScherm, verScherm;
	private int breedte = 200, hoogte = 100;
	private int richting = 5; //ook de snelheid
	private boolean beweeg = true;
	private Color kleur;
	
	public Wolk(int x, int y, Color kleur)
	{
		this.x = x;
		this.y = y;
		this.kleur = kleur;
	}
	
	public void beweeg()
	{
		if (beweeg == true)
		{
			x = x + richting;
			nietVanScherm();
		}
	}
	
	public void veranderRichting()
	{
		richting = -richting;
	}
	
	public void toggleBeweeg()
	{
		beweeg = !beweeg;
		if(beweeg == true)
		{
			veranderRichting();
		}
	}
	
	public void nietVanScherm()
	{
		if (horScherm > 0)
		{
			if (x> horScherm)
			{
				x = -breedte;
			}
			else if (x + richting < -breedte)
			{
				x = horScherm;
			}
		}
	}
	
	public void setScherm(int breedte, int hoogte)
	{
		horScherm = breedte;
		verScherm = hoogte;
	}
	
	public void Teken(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(kleur);
		g.fillOval(x, y, 200, 100);		
	}
}
