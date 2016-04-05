package H04_05_6_7;

import java.awt.event.*;
import javax.swing.*;

public class AutoBalBediening extends JPanel implements ActionListener
{
	private JButton wisselRichting;
	private JButton omhoogKnop;
	private JButton omlaagKnop;
	private JButton snellerKnop;
	private JButton langzamerKnop;
	AutoBal bal;
	
	public AutoBalBediening(AutoBal bal)
		{
		this.bal = bal;
		
		wisselRichting = new JButton("Wissel van richting");
		wisselRichting.addActionListener(this);
		add(wisselRichting);
		
		omhoogKnop = new JButton("omhoog");
		omhoogKnop.addActionListener(this);
		add(omhoogKnop);
		
		omlaagKnop = new JButton("omlaag");
		omlaagKnop.addActionListener(this);
		add(omlaagKnop);
		
		snellerKnop = new JButton("sneller");
		snellerKnop.addActionListener(this);
		add(snellerKnop);
		
		langzamerKnop = new JButton("langzamer");
		langzamerKnop.addActionListener(this);
		add(langzamerKnop);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			
			if (e.getSource() == wisselRichting)
			{
				bal.setRichtingEnSnelheid(-bal.getRichtingEnSnelheid()); //tegenovergestelde richting
			}
			else if (e.getSource() == omhoogKnop)
			{
				bal.setVerPlaats(bal.getVerPlaats() - bal.getBeweegAfstand()); //beweegafstand omhoog
			}
			else if (e.getSource() == omlaagKnop)
			{
				bal.setVerPlaats(bal.getVerPlaats() + bal.getBeweegAfstand()); //beweegafstand omlaag
			}
			else if (e.getSource() == snellerKnop)
			{
				bal.setRichtingEnSnelheid(bal.getRichtingEnSnelheid() * 2); //de helft sneller
			}
			else if (e.getSource() == langzamerKnop)
			{
				if (bal.getRichtingEnSnelheid() / 2 != 0) //bal mag niet stilstaan
				{
					bal.setRichtingEnSnelheid(bal.getRichtingEnSnelheid() / 2); //de helf langzmaer
				}
			}
		}
	}