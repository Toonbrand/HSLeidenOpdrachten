package H04_pacman;

import java.awt.event.*;
import javax.swing.*;

public class PacmanBediening1 extends JPanel implements ActionListener
{
	private JButton groter, kleiner;
	PacmanPaneel pacmanPaneel;
	
	public PacmanBediening1(PacmanPaneel pacmanPaneel)
		{
		this.pacmanPaneel = pacmanPaneel;
		
		groter = new JButton( "Groter" );
		groter.addActionListener( this );
		add( groter);
		
		kleiner = new JButton( "Kleiner" );
		kleiner.addActionListener( this );
		add( kleiner);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == groter)
			{
				pacmanPaneel.setGrootte(+10);
			}
			else if(e.getSource() == kleiner)
			{
				pacmanPaneel.setGrootte(-10);
			}
		}
	}