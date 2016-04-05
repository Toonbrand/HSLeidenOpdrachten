package H08_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KlikPlaatjePaneel extends JPanel implements ActionListener
{
	private String[ ] pictogramNaam;
	private JButton[  ] knop;
	private JTextArea tekstVeld;
	private String tekst;
	private ImageIcon afbeelding;
	
	public KlikPlaatjePaneel()
	{
		pictogramNaam = new String[5];
		pictogramNaam[0] = "Demoman";
		pictogramNaam[1] = "Heavy";
		pictogramNaam[2] = "KlotePyro";
		pictogramNaam[3] = "Scout";
		pictogramNaam[4] = "Soldier";
		
		knop = new JButton[5];
		
		setLayout( null );
		
		tekstVeld = new JTextArea();
		tekstVeld.setBounds(10,100,375,50);
		
		int MARGE = 10;
		int KNOP_BREEDTE = 75;
		int KNOP_HOOGTE = 75;
		int KNOP_AFSTAND = KNOP_BREEDTE + 4;
		int Y_LOCATIE = 10;
		add(tekstVeld);
		
		for(int x=0; x<pictogramNaam.length; x++)
		{
			tekst = pictogramNaam[x];
			afbeelding = new ImageIcon(KlikPlaatjePaneel.class.getResource("/TF/" + tekst + ".jpg"));
			knop[x] = new JButton(afbeelding);
			knop[x].addActionListener(this);
			knop[x].setBounds(x * KNOP_AFSTAND + MARGE, Y_LOCATIE, KNOP_BREEDTE, KNOP_HOOGTE);
			add(knop[x]);
		}
	}

	public void actionPerformed(ActionEvent e) 
	{
	for(int x=0; x<pictogramNaam.length; x++)
		{
			if(e.getSource() == knop[x])
			{
				tekstVeld.setText(pictogramNaam[x]);
			}
		}
	}
}