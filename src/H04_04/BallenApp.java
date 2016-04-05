package H04_04;

import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*; 

public class BallenApp extends JFrame implements ActionListener
{ 
	  private JButton naarLinks, naarRechts, naarBoven, naarBeneden;
	  private int breedte = getWidth();
	  BallenPaneel ballenPaneel;
	
	  public BallenApp()
	  { 
		  setSize( 700, 400 );
		  setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		  setTitle( "Verplaatsbare bal, versie 2" );
		  setLocation( 100, 100 );

		  ballenPaneel = new BallenPaneel();
		  add( ballenPaneel, BorderLayout.CENTER );

		  naarLinks = new JButton( "<" );
		  naarLinks.addActionListener( this );
		  add( naarLinks, BorderLayout.WEST );

		  naarRechts = new JButton( ">" );
		  naarRechts.addActionListener( this );
		  add( naarRechts, BorderLayout.EAST );

		  naarBoven = new JButton( "^" );
		  naarBoven.addActionListener( this );
		  add( naarBoven, BorderLayout.NORTH );

		  naarBeneden = new JButton( "V" );
		  naarBeneden.addActionListener( this );
		  add( naarBeneden, BorderLayout.SOUTH );

		  setVisible( true );
	  }
	
	  public void actionPerformed( ActionEvent e )
	  { 
		  final int VERPLAATSING = 13; 
		  if ( e.getSource() == naarLinks )
	      {ballenPaneel.verplaatsBallenHor( - VERPLAATSING );}
		  else if (e.getSource() == naarRechts)
	      {ballenPaneel.verplaatsBallenHor( VERPLAATSING );}
		  else if (e.getSource() == naarBoven)
		  {ballenPaneel.verplaatsBallenVer( - VERPLAATSING );}
		  else if (e.getSource() == naarBeneden)
		  {ballenPaneel.verplaatsBallenVer( VERPLAATSING );}
		  
		  ballenPaneel.repaint();
	  }
	  
	  public static void main(String[]args)
	  {
		  new BallenApp();
	  }
}
