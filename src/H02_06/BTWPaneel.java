package H02_06;

import javax.swing.*;
import java.awt.event.*;

public class BTWPaneel extends JPanel implements ActionListener
{
	private JTextField bedragVeld;
	private JTextField percentageVeld;
	private JButton berekenKnop;
	private JTextArea uitkomstVeld;
	
	public BTWPaneel()
	{
		bedragVeld = new JTextField("100", 4);
		percentageVeld = new JTextField("20", 4);
		berekenKnop = new JButton("Bereken BTW");
		berekenKnop.addActionListener(this);
		uitkomstVeld = new JTextArea(5,20);
		
		add (new JLabel("Bedrag inclusief btw"));
		add (bedragVeld);
		add (new JLabel("BTW-percentage"));
		add (percentageVeld);
		add (new JLabel("%"));
		add (berekenKnop);
		add (uitkomstVeld);
	}
	
	public void toonResultaat(double beginBedrag, double beginPercentage)
	{
		double exclusiefBTW =  Math.round((100 / (100 + beginPercentage) * beginBedrag)*100)/100.0;
		double bedragVanDeBTW = Math.round((beginBedrag - exclusiefBTW)*100)/100.0;
		
		String resultaat = "Bedrag exclusief btw: " + exclusiefBTW + "\n" + "Bedrag van de BTW: " + bedragVanDeBTW;
		uitkomstVeld.setText(resultaat);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		double beginBedrag = Integer.parseInt(bedragVeld.getText());
		double beginPercentage = Integer.parseInt(percentageVeld.getText());
		toonResultaat(beginBedrag, beginPercentage);
	}
}
