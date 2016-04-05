package H08_Achtbaan_Toon;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KnoppenBalk extends JPanel implements ActionListener
{
	private JButton snellerKnop, langzamerKnop;
	private JTextField snelheidsVeld;
	
	private Achtbaan achtbaan;
	
	public KnoppenBalk(Achtbaan achtbaan)
	{
		this.achtbaan = achtbaan;
		
		snellerKnop = new JButton("Sneller");
		snellerKnop.addActionListener(this);
		
		langzamerKnop = new JButton("Langzamer");
		langzamerKnop.addActionListener(this);
		
		snelheidsVeld = new JTextField(30);
		snelheidsVeld.addActionListener(this);
		
		add(langzamerKnop);
		add(snelheidsVeld);
		add(snellerKnop);
	}

	private void snelheidInstellen()
	{
		try
		{
			int wachtTijd = Integer.parseInt(snelheidsVeld.getText());
			achtbaan.setSnelheid(wachtTijd);
		}
		
		catch(NumberFormatException nfe)
		{
			System.err.println("U dient een getal in te voeren!");
			snelheidsVeld.setText("");
		}
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == snellerKnop)
		{
			achtbaan.snelheidVerhogen();
		}
		
		else if(e.getSource() == langzamerKnop)
		{
			achtbaan.snelheidVerlagen();
		}
		
		else if(e.getSource() == snelheidsVeld)
		{
			snelheidInstellen();
		}
	}
}
