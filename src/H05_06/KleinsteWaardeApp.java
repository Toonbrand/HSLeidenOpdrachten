package H05_06;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class KleinsteWaardeApp extends JFrame
{
 
  KleinsteWaardePaneel kleinsteWaardePaneel;

  // maak een venster met een paneel en knoppen als inhoud
  public KleinsteWaardeApp()
  {
    setSize( 400, 250 );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    setTitle( "Dobbelstenen" );
    setLocation( 100, 100 );

    kleinsteWaardePaneel = new KleinsteWaardePaneel();
    add( kleinsteWaardePaneel, BorderLayout.CENTER );


    setVisible( true );
  }


  public static void main( String[] args )
  {
    new KleinsteWaardeApp();
  }
}