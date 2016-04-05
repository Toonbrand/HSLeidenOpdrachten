package H05_06a;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class GrootsteWaardeApp extends JFrame
{
 
  GrootsteWaardePaneel kleinsteWaardePaneel;

  // maak een venster met een paneel en knoppen als inhoud
  public GrootsteWaardeApp()
  {
    setSize( 400, 250 );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setTitle( "Grootste Waarde" );
    setLocation( 100, 100 );

    kleinsteWaardePaneel = new GrootsteWaardePaneel();
    add( kleinsteWaardePaneel, BorderLayout.CENTER );


    setVisible( true );
  }


  public static void main( String[] args )
  {
    new GrootsteWaardeApp();
  }
}