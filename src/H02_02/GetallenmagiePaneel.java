package H02_02;

import javax.swing.*;
import java.awt.event.*;

public class GetallenmagiePaneel extends JPanel implements ActionListener 
{
	private JTextField invoerVeld;
	private JTextField uitkomstVeld;
	private JButton rekenKnop;
	
	public GetallenmagiePaneel()
	{
		invoerVeld = new JTextField (13);
		uitkomstVeld = new JTextField (13);
		rekenKnop = new JButton ("Reken");
		rekenKnop.addActionListener(this);
		add (invoerVeld);
		add (rekenKnop);
		add (uitkomstVeld);
		add (new JLabel("Wat dit programma doet, is het volgende:"));
		add (new JLabel("Eerst word het vermenigvuldigd met 1000."));
		add (new JLabel("Vervolgens telt hij hetzelfde getal erbij op."));
		add (new JLabel("Dan gaat het weer gedeeld door 7."));
		add (new JLabel("dan gaat het gedeeld door het eerste getal."));
		add (new JLabel("En tot slot gedeeld door 11."));

	}
	
	public void actionPerformed(ActionEvent e)
	{
		int DELER1 = 7;
		int DELER2 = 11;
		int brongetal = Integer.parseInt(invoerVeld.getText());
		int uitkomst1 = (brongetal * 1000) + brongetal;
		int uitkomst2 = uitkomst1 / DELER1;
		int uitkomst3 = uitkomst2 / brongetal;
		int uitkomst4 = uitkomst3 / DELER2;
		
		uitkomstVeld.setText("" + uitkomst4);
	}
}
