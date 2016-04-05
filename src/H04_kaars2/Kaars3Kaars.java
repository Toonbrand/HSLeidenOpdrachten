package H04_kaars2;

import java.awt.*;

public class Kaars3Kaars {
	
	private int x, y, lengte, breedte;
	private Color kleur;
	int breedteVlam = 20;
	int hoogteScherm = 500;
	boolean aan;

	public Kaars3Kaars(int x, int y, int lengte, int breedte, boolean aan, Color kleur )
	{
		this.x = x;
		this.y = y;
		this.lengte = lengte;
		this.aan = aan;
		this.kleur = kleur;
		this.breedte = breedte;
	}
	
	
	public void brand( int aantalPixels)
	{
		if(aan && lengte - aantalPixels > 5)
		{lengte = lengte - aantalPixels;}
		else if(lengte - aantalPixels <= 5)
		{lengte = 5; aan = false;}
	}
	
	public void toggleAan()
	{
		aan = !aan;
	}
	
	public void teken(Graphics g)
	{
		g.setColor(kleur);
		g.fillRect(x, hoogteScherm - y - lengte, breedte, lengte);
		if (aan)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(x + ((breedte/2)-breedteVlam/2), hoogteScherm - y - lengte - 30, breedteVlam, 30);
		}
		g.setColor(Color.BLACK);
		g.drawLine(x + (breedte/2), hoogteScherm - y - lengte - 20, x + (breedte/2), hoogteScherm - y - lengte);
	}
	
}
