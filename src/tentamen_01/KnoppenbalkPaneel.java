package tentamen_01;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class KnoppenbalkPaneel extends JPanel implements ActionListener
{
	private JButton varenDrijven, uitKnop, zachtKnop, hardKnop;
	private JTextField statusVeld;
	private String status = "uit";
	WaterzichtPaneel waterzichtPaneel;
	
	public KnoppenbalkPaneel(WaterzichtPaneel waterzichtPaneel)
		{
		this.waterzichtPaneel = waterzichtPaneel;

		statusVeld = new JTextField ("De pomp staat uit!", 20);
		add (statusVeld);
		
		varenDrijven = new JButton( "Varen/Drijven" );
		varenDrijven.addActionListener( this );
		add(varenDrijven);
		
		uitKnop = new JButton( "Pomp uit" );
		uitKnop.addActionListener( this );
		add(uitKnop);
		
		zachtKnop = new JButton( "Pomp zacht" );
		zachtKnop.addActionListener( this );
		add(zachtKnop);
		
		hardKnop = new JButton( "Pomp hard" );
		hardKnop.addActionListener( this );
		add(hardKnop);
		
		}
	
		
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == varenDrijven)
			{
				waterzichtPaneel.veranderZeil();
			}
			waterzichtPaneel.repaint();
			
			if(e.getSource() == uitKnop)
			{
				waterzichtPaneel.pompUit();
			}
			
			if(e.getSource() == zachtKnop)
			{
				waterzichtPaneel.pompZacht();
			}
			
			if(e.getSource() == hardKnop)
			{
				waterzichtPaneel.pompHard();
			}
			statusVeld.setText("De pomp staat "+waterzichtPaneel.getStatus()+"!");
		}
	}