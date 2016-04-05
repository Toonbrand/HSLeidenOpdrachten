package H04_kaars1;

import java.awt.*;

public class Kaars2Kaars {
	
	private int x, y, lengte;
	int breedte = 50;
	int breedteVlam = 20;
	int hoogteScherm = 500;
	boolean aan;

	public Kaars2Kaars(int x, int y, int lengte, boolean aan )
	{
		this.x = x;
		this.y = y;
		this.lengte = lengte;
		this.aan = aan;
	}
	
	
	public void brand( int aantalPixels)
	{
		if(aan)
		{lengte = lengte - aantalPixels;}
	}
	
	public void toggleAan()
	{
		aan = !aan;
	}
	
	public void teken(Graphics g)
	{
		g.setColor(Color.GREEN);
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
