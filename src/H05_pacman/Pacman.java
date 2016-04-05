package H05_pacman;

import java.awt.*;
import javax.swing.*;

public class Pacman extends JPanel
{
	private int horPos, verPos, grootte, verRichting, horRichting, horScherm, verScherm;
	private Color kleur;
	boolean open;
	private Raster raster;

	public Pacman(int x, int y, int grootte, int verRichting, int horRichting, Color kleur)
	{
		raster = new Raster();
		this.horPos = x;
		this.verPos = y;
		this.grootte = grootte;
		this.kleur = kleur;
		this.verRichting = verRichting;
		this.horRichting = horRichting;
	}
	
	public int getGrootte()
	{
		return grootte;
	}
	
	public void setScherm(int nieuweHorScherm, int nieuweVerScherm)
	{
		horScherm = nieuweHorScherm;
		verScherm = nieuweVerScherm;
	}
	
	public void setGrootte(int nieuweGrootte)
	{
		grootte = nieuweGrootte;
	}
	
	public void setHorRichting(int nieuweHorRichting)
	{
		horRichting = nieuweHorRichting;
	}
	
	public void setVerRichting(int nieuweVerRichting)
	{
		verRichting = nieuweVerRichting;
	}
	
	public void toggleMond()
	{
		open = !open;
	}
	
	public void verPlaats()
	{
		horPos = horPos + horRichting;
		verPos = verPos + verRichting;
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
		raster.eetBonus(horPos, verPos, grootte);
	}
	
	
	public void teken(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(kleur);
		
		if (horRichting > 0)  //naar rechts
		{
			if (open)
			{g.fillArc(horPos, verPos, grootte, grootte, 40, 270 );}
			else
			{g.fillOval(horPos, verPos, grootte, grootte);}
			g.setColor(Color.BLACK);
			g.fillOval(horPos+(grootte/3), verPos+(grootte/4), grootte/10, grootte/10);
		}
		
		else if (horRichting < 0) // naar links
		{
			if (open)
			{g.fillArc(horPos, verPos, grootte, grootte, 40 + 180, 270);}
			else
			{g.fillOval(horPos, verPos, grootte, grootte);}
			g.setColor(Color.BLACK);
			g.fillOval(horPos+(grootte-(grootte/3)), verPos+(grootte/4), grootte/10, grootte/10);
		}
		
		else if (verRichting > 0) // naar beneden
		{
			if (open)
			{g.fillArc(horPos, verPos, grootte, grootte, 40 + 270, 270 );}
			else
			{g.fillOval(horPos, verPos, grootte, grootte);}
			g.setColor(Color.BLACK);
			g.fillOval(horPos+(grootte-(grootte/3)), verPos+(grootte/4), grootte/10, grootte/10);
		}
		
		else if (verRichting < 0) // naar boven
		{
			if (open)
			{g.fillArc(horPos, verPos, grootte, grootte, 40 + 90, 270 );}
			else
			{g.fillOval(horPos, verPos, grootte, grootte);}
			g.setColor(Color.BLACK);
			g.fillOval(horPos+(grootte/3), verPos+(grootte-(grootte/3)), grootte/10, grootte/10);
		}
	}
}
