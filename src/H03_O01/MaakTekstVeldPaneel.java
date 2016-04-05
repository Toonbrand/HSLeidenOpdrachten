package H03_O01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MaakTekstVeldPaneel extends JPanel implements ActionListener
{
	
	
	public MaakTekstVeldPaneel()
	{
		maakTekstVeld( "Label1", "Veld1", 12 );
		maakTekstVeld( "Label2", "Veld2", 11 );
		maakTekstVeld( "Label3", "Veld3", 10 );
		maakTekstVeld( "Label4", "Veld4", 9 );
	}
	
	public JTextField maakTekstVeld(String labeltekst, String starttekst, int grootte )
	{
	  JLabel label = new JLabel( labeltekst );
	  JTextField tekstVeld = new JTextField (starttekst, grootte);
	  add( label );
	  add( tekstVeld );
	  return tekstVeld;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
			
	}
}
