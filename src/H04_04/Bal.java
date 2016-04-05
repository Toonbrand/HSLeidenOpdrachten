package H04_04;

import java.awt.*;

public class Bal
{ 
	private int horPos, verPos, grootte;
	private int maxX, maxY;
	private final int minX = 0, minY = 0;
	private Color kleur; 
  
	public Bal( int x, int y, int grootte, Color kleur )
  { 
	  this.horPos = x;
	  this.verPos = y;
	  this.grootte = grootte;
	  this.kleur = kleur;
  }
	public void setMaxX(int breedte)
	{
		maxX = breedte - grootte;
	}
	
	public void setMaxY(int breedte)
	{
		maxY = breedte - grootte;
	}
	
	
public void verplaatsHor( int aantalPixels )
  { 
	if (horPos + aantalPixels >= maxX)
	{horPos = maxX;}
	else if (horPos + aantalPixels <= minX)
	{horPos = minX;}
	else
	{horPos += aantalPixels;}
  }
  
  public void verplaatsVer( int aantalPixels )
  {
	  if (verPos + aantalPixels >= maxY)
	  {verPos = maxY;}
	  else if (verPos + aantalPixels <= minY)
	  {verPos = minY;}
	  else
	  {verPos += aantalPixels;}
  }
  
  public void teken( Graphics g )
  { 
	  g.setColor( kleur );
	  g.fillOval( horPos, verPos, grootte, grootte);
	  g.setColor( Color.BLACK );
	  g.drawOval( horPos, verPos, grootte, grootte ); 
	  g.drawOval( horPos + grootte / 4, verPos, grootte / 2, grootte );
  }
}