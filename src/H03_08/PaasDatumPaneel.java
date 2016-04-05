package H03_08;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class PaasDatumPaneel extends JPanel implements ActionListener
{
	private JTextField jaarVeld;
	private JButton uitvoerKnop;
	private JTextArea uitvoerVeld;
	private int jaar;
	private int paasmaand;
	private int paasdag;
	
	public PaasDatumPaneel()
	{
		jaarVeld = new JTextField("2009",4);
		jaarVeld.addActionListener(this);
		uitvoerVeld = new JTextArea(6,23);
		uitvoerKnop = new JButton("Bepaal paasdatum");
		uitvoerKnop.addActionListener(this);
		add (new JLabel("Jaar"));
		add(jaarVeld);
		add(uitvoerKnop);
		add(uitvoerVeld);
	}
	
	public void bepaaljaar()
	{
	jaar = Integer.parseInt(jaarVeld.getText());
	}
	
	public void bepaalDatum()
	{
		uitvoerVeld.setText("");
		for (int aantal=0; aantal<=5 && jaar >= 1900 && jaar <= 2099; aantal++)
		{
			int A = jaar % 19;
			int B = jaar % 4;
			int C = jaar % 7;
			int D = (19*A+24)%30;
			int E = (5+2*B+4*C+6*D)%7;
			int F = D+E-9;
			if (F>0)
			{
				paasmaand = 4;
				if (F != 26)
				{
					if (F != 25 && D != 28)
					{paasdag = F;}
					else
					{paasdag = 18;}
				}
				else 
				{paasdag = 19;}
			}
			else
			{paasmaand = 3;
			paasdag = F+31;}
			uitvoerVeld.append("in "+jaar+" valt Pasen op de "+paasdag+"e van maand "+paasmaand+"\n");
			jaar++;
		}
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaaljaar();
		if(jaar >= 1990 && jaar <= 2099)
		{
			bepaalDatum();
		}
		else
		{
			JOptionPane.showMessageDialog(
					null, 
					"Vul een jaar in tussen de 1900 en 2099",
					"Onjuist getal", 
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
