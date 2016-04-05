package H03_01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LijnenPaneel extends JPanel implements ActionListener
{
	private JTextField afstandVeld;
	private JButton tekenknop;
	private int afstand;
	
	public LijnenPaneel()
	{
		afstandVeld = new JTextField("5", 4);
		afstandVeld.addActionListener(this);
		tekenknop = new JButton("Teken");
		tekenknop.addActionListener(this);
		bepaalIngesteldeAfstand();
		add(new JLabel("Afstand tussen de lijnen"));
		add(afstandVeld);
		add(tekenknop);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int yPos = 50;
		int teller = 0;
			while(teller<=500)
			{
				g.drawLine(0,yPos,getWidth(),yPos);
				yPos = yPos + afstand;
				teller++;
			}
	}
	public void bepaalIngesteldeAfstand()
	{
	afstand = Integer.parseInt(afstandVeld.getText());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalIngesteldeAfstand();
		if (afstand >= 1)
		{
			repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(
			null,
			"Vul een getal groter dan 0 in!",
			"Onjuist getal",
			JOptionPane.WARNING_MESSAGE);
		}
	}
}
