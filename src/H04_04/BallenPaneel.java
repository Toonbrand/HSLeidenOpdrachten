package H04_04;

import javax.swing.*;
import java.awt.*;

public class BallenPaneel extends JPanel
{ 
	private Bal bal1, bal2;
	
  public BallenPaneel()
  { 
	  bal1 = new Bal( 200, 150, 100, Color.ORANGE );
	  bal2 = new Bal( 350, 150, 50, Color.YELLOW );
  }
  
  public void verplaatsBallenHor( int aantalPixels )
  { 
	  bal1.setMaxX(getWidth());
	  bal2.setMaxX(getWidth());
	  bal1.verplaatsHor( aantalPixels );
	  bal2.verplaatsHor( aantalPixels );
  }
  
  public void verplaatsBallenVer( int aantalPixels )
  { 
	  bal1.setMaxY(getHeight());
	  bal2.setMaxY(getHeight());
	  bal1.verplaatsVer( aantalPixels );
	  bal2.verplaatsVer( aantalPixels );
  }
  
  public void paintComponent( Graphics g )
  { 
	  super.paintComponent( g );
	  bal1.teken( g );
	  bal2.teken( g );
  }
}
