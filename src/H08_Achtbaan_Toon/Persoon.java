package H08_Achtbaan_Toon;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

public class Persoon extends JPanel
{
	private String naam;
	private int lengte;
	private int leeftijd;
	private int gewicht;
	Random generator = new Random();
	
	public Persoon(String naam, int lengte, int leeftijd, int gewicht)
	{
		this.naam = naam;
		this.lengte = lengte;
		this.leeftijd = leeftijd;
		this.gewicht = gewicht;
		
		setOpaque(false);
		
		setSize(10, 10 + (lengte - 150));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval(0, 0, 10, 10);
		
		g.setColor(new Color(generator.nextInt(256),generator.nextInt(256),generator.nextInt(256)));
		g.fillRect(0, 10, 10, lengte - 150);
	}
	
	public String getNaam()
	{
		return naam;
	}

	public void setNaam(String naam)
	{
		this.naam = naam;
	}

	public int getLengte()
	{
		return lengte;
	}

	public void setLengte(int lengte)
	{
		this.lengte = lengte;
	}

	public int getLeeftijd() {
		return leeftijd;
	}

	public void setLeeftijd(int leeftijd)
	{
		this.leeftijd = leeftijd;
	}

	public int getGewicht()
	{
		return gewicht;
	}

	public void setGewicht(int gewicht)
	{
		this.gewicht = gewicht;
	}
	
	public String toString()
	{
		return "Persoon " + naam;
	}
}
