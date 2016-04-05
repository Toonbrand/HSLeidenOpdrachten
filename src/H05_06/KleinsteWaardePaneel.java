package H05_06;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class KleinsteWaardePaneel extends JPanel implements ActionListener
{
	 private JButton berekenKnop;
	 private JTextArea uitkomstVeld;
	 private JTextArea uitkomstVeld2;
	 private int kleinste, nummerKleinste;
	 private int[] getallen;

  public KleinsteWaardePaneel()
  {
	    Random generator = new Random();
	  
	    berekenKnop = new JButton( "Bepaal kleinste" );
	    berekenKnop.addActionListener( this );
	    add( berekenKnop, BorderLayout.SOUTH );
	  
	    uitkomstVeld = new JTextArea(5,30);
	    uitkomstVeld.setLineWrap(true);
		uitkomstVeld.setWrapStyleWord(true);
	    add(uitkomstVeld);
	    
	    uitkomstVeld2 = new JTextArea(1,30);
	    add(uitkomstVeld2);
	    
	    getallen = new int[20];
	    {
	    	for(int i = 0; i < getallen.length; i++)
	    	{
	    		getallen[i] = (generator.nextInt(201)-100);
	    	}
	    }
	    
	    String getallenReeks = (getallen[0]+" "+getallen[1]+" "+getallen[2]+" "+getallen[3]+" "+getallen[4]+" "+getallen[5]+" "+getallen[6]+" "+getallen[7]+" "+getallen[8]+" "+getallen[9]+" "+getallen[10]+" "+getallen[11]+" "+getallen[12]+" "+getallen[13]+" "+getallen[14]+" "+getallen[15]+" "+getallen[16]+" "+getallen[17]+" "+getallen[18]+" "+getallen[19]);
	    uitkomstVeld.setText(getallenReeks);
  }
  
  public void zoekDeGrootste()
  {
	  int grootste = getallen[0];
	  for (int index=1; index<getallen.length; index++)
	  {
		  if (getallen[index]>grootste)
		  {
			  grootste = getallen[index];
		  }
	  }
  }
  
  public void zoekDeKleinste()
  {
	  nummerKleinste = 0;
	  kleinste = getallen[0];
	  for (int index=1; index<getallen.length;index++)
	  {
		  if (getallen[index]<kleinste)
		  {
			  kleinste = getallen[index];
			  nummerKleinste = index+1;
		  }
	  }
  }
  
  public void actionPerformed( ActionEvent e )
  {
	  zoekDeKleinste();
	  uitkomstVeld2.setText("Getal "+nummerKleinste+" heeft de kleinste waarde, namelijk: "+kleinste);
  }
  

}