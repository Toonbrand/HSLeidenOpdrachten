package tentamen_02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Random;

public class Kooi extends Verblijf
{	
	public Kooi(Point positie, int breedte, int hoogte)
	{
		super(positie, breedte, hoogte);
		setLayout(null);
	}
	
	
	public void willekeurigDier()
	{
		
		int willekeurig = generator.nextInt(8)+1;
		switch (willekeurig)
		{
		case 1: diersoort = "aap";break;
		case 2: diersoort = "kangeroo";break;
		case 3: diersoort = "koala";break;
		case 4: diersoort = "koe";break;
		case 5: diersoort = "rat";break;
		case 6: diersoort = "schaap";break;
		case 7: diersoort = "struisvogel";break;
		case 8: diersoort = "varken";break;
		}
		
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.GREEN);
		g.fillRect(0,0,breedte,hoogte);
		
		g.setColor(Color.BLACK);
		g.fillRect(0, hoogte - hoogte/3, breedte, 10);
		for(int i = 0; i < breedte; i++)
		{
			g.fillRect(30*i,hoogte - hoogte/3, 10, hoogte);
		}
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
