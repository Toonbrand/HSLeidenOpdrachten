package H05_05;

import java.awt.event.*;
import javax.swing.*;

public class Kleurenstrook2Bediening extends JPanel implements ActionListener
{
	private JButton tekenKnop;
	private JTextField breedteVeld;
	private int breedte = 30;
	Kleurenstrook2Teken kleurenstrook2Teken;
	
	public Kleurenstrook2Bediening(Kleurenstrook2Teken kleurenstrook2Teken)
	{
		this.kleurenstrook2Teken = kleurenstrook2Teken;

		breedteVeld = new JTextField("30",3);
		add(breedteVeld);
		
		tekenKnop = new JButton("teken vlakken");
		tekenKnop.addActionListener(this);
		add(tekenKnop);
	}
	
	public int getBreedte()
	{
		return (breedte);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		breedte = Integer.parseInt(breedteVeld.getText());
		kleurenstrook2Teken.repaint();
		System.out.print(breedte);
	}

}
