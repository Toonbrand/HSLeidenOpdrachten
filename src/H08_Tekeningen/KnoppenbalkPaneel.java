package H08_Tekeningen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KnoppenbalkPaneel extends JPanel implements ActionListener
{
	private JButton ladenKnop, opslaanKnop;
	TekeningenPaneel tekeningenPaneel;
	
	public KnoppenbalkPaneel(TekeningenPaneel tekeningenPaneel)
	{
		this.tekeningenPaneel = tekeningenPaneel;
		
		ladenKnop = new JButton("Laden");
		ladenKnop.addActionListener(this);
		opslaanKnop = new JButton ("Opslaan");
		opslaanKnop.addActionListener(this);
		
		add(ladenKnop);
		add(opslaanKnop);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == ladenKnop)
		{
			tekeningenPaneel.Laden();
		}
		
		else if(e.getSource() == opslaanKnop)
		{
			tekeningenPaneel.Opslaan();
		}
	}
	
}
