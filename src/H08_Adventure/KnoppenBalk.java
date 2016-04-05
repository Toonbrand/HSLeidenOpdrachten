package H08_Adventure;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class KnoppenBalk extends JPanel implements ActionListener
{
	private JButton opslaanKnop, ladenKnop;
	LevelPaneel levelPaneel;
	
	public KnoppenBalk(LevelPaneel levelPaneel)
	{
		this.levelPaneel = levelPaneel;
		opslaanKnop = new JButton("Opslaan");
		opslaanKnop.addActionListener(this);
		ladenKnop = new JButton("Laden");
		ladenKnop.addActionListener(this);
		
		add(opslaanKnop);
		add(ladenKnop);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == opslaanKnop)
		{
			levelPaneel.opslaan();
		}
		
		else if(e.getSource() == ladenKnop)
		{
			levelPaneel.laden();
		}
	}
}
