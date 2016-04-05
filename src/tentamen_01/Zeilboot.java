package tentamen_01;

import java.awt.*;
import java.util.Random;
import javax.swing.*;

public class Zeilboot extends JPanel
{
	private int x, y;
	private int bootHoogte = 100, bootBreedte = 200;
	private int mastHoogte = 300, mastBreedte = 20;
	private int zeilHoogte = 200, zeilBreedte = 150;
	private int horScherm, verScherm;
	private int richting;
	private String pompStatus = "uit";
	private Color kleur;
	private boolean richtingZeil = false, status = true;
	Random generator = new Random();
	
	public Zeilboot(int x, int y, Color kleur)
	{
		this.x = x;
		this.y = y;
		this.kleur = kleur;
	}
	
	public void zink(int zinkAfstand)
	{
		if (status == false)
		{
			if (pompStatus == "uit")
			{
				if(y - zinkAfstand > 0)
				{
					y = y - zinkAfstand;
				}
			}
			else if (pompStatus == "zacht")
			{
				repaint(); //niks
			}
			else if (pompStatus == "hard")
			{
				if(y + zinkAfstand < 150)
				{
					y = y + zinkAfstand;
				}
			}
			
		}
	}
	
	public void randomZeilRichting()
	{
		richting = (generator.nextInt(2));
		if (richting == 0)
		{
			richtingZeil = false;
		}
		else if (richting == 1)
		{
			richtingZeil = true;
		}
	}
	
	public void setPompStatus(String nieuweStatus)
	{
		pompStatus = nieuweStatus;
	}
	
	public String getPompStatus()
	{
		return pompStatus;
	}

	public void wisselRichting()
	{
		richtingZeil = !richtingZeil;
	}
	
	public void wisselStatus()
	{
		status = !status;
		if ( status == false)
		{
			wisselRichting();
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
		
		//boot
		g.setColor(new Color(116,42,2));
		g.fillRect(x, verScherm - y - bootHoogte, bootBreedte, bootHoogte);
		
		Polygon poly1 = new Polygon();
		poly1.addPoint(x, verScherm - y - bootHoogte);
		poly1.addPoint(x - 50, verScherm - y - bootHoogte);
		poly1.addPoint(x, verScherm - y);
		g.fillPolygon(poly1);
		
		Polygon poly2 = new Polygon();
		poly2.addPoint(x + bootBreedte, verScherm - y - bootHoogte);
		poly2.addPoint(x + bootBreedte + 50, verScherm - y - bootHoogte);
		poly2.addPoint(x + bootBreedte, verScherm - y);
		g.fillPolygon(poly2);
		//eind boot
		
		//zeil
		g.setColor(kleur);
		if (status == true)//varend
		{
			if (richtingZeil == true) //links
			{
				Polygon poly3 = new Polygon();
				poly3.addPoint(x + bootBreedte/2, verScherm - bootHoogte - y - mastHoogte);
				poly3.addPoint(x + bootBreedte/2, verScherm - bootHoogte - y - mastHoogte + zeilHoogte);
				poly3.addPoint(x + bootBreedte/2 - zeilBreedte, verScherm - bootHoogte - y - mastHoogte + zeilHoogte);
				g.fillPolygon(poly3);
			}
			else if (richtingZeil == false) //rechts
			{
				Polygon poly4 = new Polygon();
				poly4.addPoint(x + bootBreedte/2, verScherm - bootHoogte - y - mastHoogte);
				poly4.addPoint(x + bootBreedte/2, verScherm - bootHoogte - y - mastHoogte + zeilHoogte);
				poly4.addPoint(x + bootBreedte*2 - zeilBreedte, verScherm - bootHoogte - y - mastHoogte + zeilHoogte);
				g.fillPolygon(poly4);
			}
		}
		else if (status == false)//drijvend
		{
			g.fillRect((x + bootBreedte/2) - 20, verScherm - bootHoogte - y - mastHoogte, mastBreedte + 20, zeilHoogte);
		}
		//eind zeil
		
		//mast
		g.setColor(new Color(119,65,3));
		g.fillRect((x + bootBreedte/2)-mastBreedte/2, verScherm - bootHoogte - y - mastHoogte, mastBreedte, mastHoogte);
		//eind mast
		
	}
}
