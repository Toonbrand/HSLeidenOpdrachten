package H04_03;

import java.awt.*;

public class Bal
{ 
	private int horPos, verPos, grootte;
	private Color kleur; 
  
	public Bal( int x, int y, int grootte, Color kleur )
  { 
	  this.horPos = x;
	  this.verPos = y;
	  this.grootte = grootte;
	  this.kleur = kleur;
  }

  public void verplaatsHor( int aantalPixels )
  { 
	  horPos += aantalPixels;
  }
  
  public void verplaatsVer( int aantalPixels )
  {
	  verPos += aantalPixels;
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