package H03_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VerplaatsBalPaneel extends JPanel implements ActionListener
{
	private JButton linksKnop;
	private JButton rechtsKnop;
	private int huidigeGrootte = 100;
	private int verplaatsing = 10;
	private int xPos;
	private int yPos;
	
	public VerplaatsBalPaneel()
	{
		linksKnop = new JButton("Links");
		linksKnop.addActionListener(this);
		rechtsKnop = new JButton("Rechts");
		rechtsKnop.addActionListener(this);
		add (linksKnop);
		add (rechtsKnop);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		tekenBal(g,xPos,yPos,huidigeGrootte, Color.ORANGE);
	}
	public void tekenBal( Graphics g, int x, int y, int grootte, Color kleur)
	{
		int middenX = getWidth()/2;
		int middenY = getHeight()/2;
		g.setColor(kleur);
		g.fillOval((middenX - huidigeGrootte/2)+x, (middenY - huidigeGrootte/2)+y, grootte, grootte);
		g.setColor(Color.BLACK);
		g.drawOval((middenX - huidigeGrootte/2)+x, (middenY - huidigeGrootte/2)+y, grootte, grootte);
		g.drawOval((middenX - huidigeGrootte/4)+x, (middenY - huidigeGrootte/2)+y, grootte/2, grootte);
	}
	
	
	public void actionPerformed(ActionEvent e)
	{
		if ( e.getSource() == linksKnop)
		{
			xPos = xPos - verplaatsing;
		}
		else
		{
			xPos = xPos + verplaatsing;
		}
		repaint();
	}
}
