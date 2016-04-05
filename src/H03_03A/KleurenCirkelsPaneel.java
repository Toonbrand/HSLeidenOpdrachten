package H03_03A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KleurenCirkelsPaneel extends JPanel implements ActionListener
{
	private JTextField afstandVeld;
	private JButton tekenknop;
	private int afstand;
	
	public KleurenCirkelsPaneel()
	{
		afstandVeld = new JTextField("5", 4);
		afstandVeld.addActionListener(this);
		tekenknop = new JButton("Teken");
		tekenknop.addActionListener(this);
		bepaalIngesteldeAfstand();
		add(new JLabel("Afstand tussen de lijnen"));
		add(afstandVeld);
		add(tekenknop);
		setBackground(Color.BLACK);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int hoogte = getHeight();
		int middenH = hoogte/2;
		int breedte = getWidth();
		int middenB = breedte/2;
		int kleurPlus = 5;
		//for(int blauw = 10; blauw <= 255; blauw = blauw + kleurPlus )
		//{
			
		//}
		for(int yPos = 0,rood = 100, groen = 200, blauw = 300; yPos <= hoogte; yPos = yPos + afstand, rood = rood +kleurPlus, groen = groen +kleurPlus, blauw = blauw +kleurPlus)
		{
			g.setColor(new Color((rood%256),(groen%256),(blauw%256)));
			g.drawOval(middenB - (yPos/2), middenH - (yPos/2), yPos, yPos);
		}
	}
	public void bepaalIngesteldeAfstand()
	{
	afstand = Integer.parseInt(afstandVeld.getText())*2;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalIngesteldeAfstand();
		if(afstand >= 1)
		{
			repaint();
		}
		else
		{
			JOptionPane.showMessageDialog(
					null, 
					"Vul een getal in hoger dan 0",
					"Onjuist getal", 
					JOptionPane.WARNING_MESSAGE);
		}
	}
}
