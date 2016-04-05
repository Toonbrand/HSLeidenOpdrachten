package H04_pacman;

import java.awt.event.*;
import javax.swing.*;

public class PacmanBediening2 extends JPanel implements ActionListener
{
	private JButton naarRechts, naarLinks, naarBoven, naarBeneden;
	PacmanPaneel pacmanPaneel;
	
	public PacmanBediening2(PacmanPaneel pacmanPaneel)
		{
		this.pacmanPaneel = pacmanPaneel;
		
		naarLinks = new JButton( "<" );
		naarLinks.addActionListener( this );
		add( naarLinks);
		
		naarRechts = new JButton( ">" );
		naarRechts.addActionListener( this );
		add( naarRechts);
		
		naarBoven = new JButton( "^" );
		naarBoven.addActionListener( this );
		add( naarBoven);
		
		naarBeneden = new JButton( "v" );
		naarBeneden.addActionListener( this );
		add( naarBeneden);
		}
		
		public void actionPerformed(ActionEvent e)
		{
			pacmanPaneel.setHorRichting(0);
			pacmanPaneel.setVerRichting(0);
			
			if(e.getSource() == naarRechts)
			{
				pacmanPaneel.setHorRichting(5);
			}
			else if(e.getSource() == naarLinks)
			{
				pacmanPaneel.setHorRichting(-5);
			}
			else if(e.getSource() == naarBoven)
			{
				pacmanPaneel.setVerRichting(-5);
			}
			else if(e.getSource() == naarBeneden)
			{
				pacmanPaneel.setVerRichting(5);
			}
		}
	}