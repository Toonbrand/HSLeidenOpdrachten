package H03_04;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GetallenSlingerPaneel extends JPanel implements ActionListener
{
	private JTextField invoerVeld;
	private JTextArea uitkomstVeld;
	private JButton berekenKnop;
	private int invoer;
	
	public GetallenSlingerPaneel()
	{
		invoerVeld = new JTextField("57", 3);
		invoerVeld.addActionListener(this);
		berekenKnop = new JButton("Bereken");
		berekenKnop.addActionListener(this);
		uitkomstVeld = new JTextArea(5,40);
		JScrollPane schuifgebied = new JScrollPane(uitkomstVeld);
		uitkomstVeld.setLineWrap(true);
		uitkomstVeld.setWrapStyleWord(true);
		bepaalInvoer();
		add(new JLabel("Geheel getal:"));
		add(invoerVeld);
		add(berekenKnop);
		this.add(schuifgebied);
		add(new JLabel("Uitleg: Is het getal even, dan wordt het gehalveert. Is het getal oneven, dan gaat het x3+1"));
		add(new JLabel("Dit blijft zich dan herhalen totdat er één uitkomt."));
	}
	
	public void berekenGetallen()
	{
		uitkomstVeld.setText(invoer + ""); 
		//Zo komt het eerste getal er ook te staan, en word het veld telkens leeggemaakt
		while(invoer != 1)
		{
			if(invoer % 2 == 0) //Getal is even
			{
				invoer = invoer / 2;
			}
			else //Getal is oneven
			{
				invoer = (invoer*3)+1;
			}
			uitkomstVeld.append(", " + invoer); 
		}
	}
	
	public void bepaalInvoer()
	{
	invoer = Integer.parseInt(invoerVeld.getText());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalInvoer();
		berekenGetallen();
	}
}
