package H05_06a;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class GrootsteWaardePaneel extends JPanel implements ActionListener
{
	 private JButton berekenKnop;
	 private JTextArea uitkomstVeld;
	 private JTextArea uitkomstVeld2;
	 private int kleinste, nummerKleinste, grootste, nummerGrootste, totaal, gemiddelde;
	 private int[] getallen;

  public GrootsteWaardePaneel()
  {
	    Random generator = new Random();
	  
	    berekenKnop = new JButton( "Bepaal kleinste" );
	    berekenKnop.addActionListener( this );
	    add( berekenKnop, BorderLayout.SOUTH );
	  
	    uitkomstVeld = new JTextArea(5,30);
	    uitkomstVeld.setLineWrap(true);
		uitkomstVeld.setWrapStyleWord(true);
	    add(uitkomstVeld);
	    
	    uitkomstVeld2 = new JTextArea(4,30);
	    uitkomstVeld.setLineWrap(true);
		uitkomstVeld.setWrapStyleWord(true);
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
	  nummerGrootste = 0;
	  grootste = getallen[0];
	  for (int index=1; index<getallen.length; index++)
	  {
		  if (getallen[index]>grootste)
		  {
			  grootste = getallen[index];
			  nummerGrootste = index+1;
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
  
  public void totaalVanGetallen()
  {
	  for (int index=1; index<getallen.length;index++)
	  {
		  totaal = totaal + getallen[index];
	  }
  }
  
  public void gemiddeldeVanGetallen()
  {
	  gemiddelde = totaal/20;
  }
  
  public void actionPerformed( ActionEvent e )
  {
	  zoekDeKleinste();
	  zoekDeGrootste();
	  totaalVanGetallen();
	  gemiddeldeVanGetallen();
	  uitkomstVeld2.setText("Getal "+nummerKleinste+" heeft de kleinste waarde, namelijk: "+kleinste);
	  uitkomstVeld2.append("\n" + "Getal "+nummerGrootste+" heeft de grootste waarde, namelijk: "+grootste);
	  uitkomstVeld2.append("\n"+"De totale som van de getallen is: "+totaal);
	  uitkomstVeld2.append("\n"+"Het gemiddelde van deze getallen is: "+gemiddelde);
  }
  

}