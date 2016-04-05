package tentamen_02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Vijver extends Verblijf
{	
	public Vijver(Point positie, int breedte, int hoogte)
	{
		super(positie, breedte, hoogte);
		setLayout(null);
		setOpaque(false);
	}
	
	
	public void willekeurigDier()
	{
		
		int willekeurig = generator.nextInt(4)+1;
		switch (willekeurig)
		{
		case 1: diersoort = "kikker";break;
		case 2: diersoort = "krokodil";break;
		case 3: diersoort = "vogel";break;
		case 4: diersoort = "vogelbekdier";break;
		}
		
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.fillOval(0,0,breedte,hoogte);
		
		
		repaint();
	}
	
	
	public String getDiersoort() {
		return diersoort;
	}

	public void setDiersoort(String diersoort) {
		this.diersoort = diersoort;
	}

	public Random getGenerator() {
		return generator;
	}

	public void setGenerator(Random generator) {
		this.generator = generator;
	}
	
	public int getBreedte() {
		return breedte;
	}

	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}

	public int getHoogte() {
		return hoogte;
	}

	public void setHoogte(int hoogte) {
		this.hoogte = hoogte;
	}

	public Point getPositie() {
		return positie;
	}

	public void setPositie(Point positie) {
		this.positie = positie;
	}
}
