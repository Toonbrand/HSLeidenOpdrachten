package H03_05A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GrootteBalPaneel extends JPanel implements ActionListener
{
	private JButton linksKnop;
	private JButton rechtsKnop;
	private JButton groterKnop;
	private JButton kleinerKnop;
	private int huidigeGrootte = 100;
	private int verplaatsing = 10;
	private int xPos;
	private int yPos;
	
	public GrootteBalPaneel()
	{
		linksKnop = new JButton("links");
		linksKnop.addActionListener(this);
		rechtsKnop = new JButton("rechts");
		rechtsKnop.addActionListener(this);
		groterKnop = new JButton("groter");
		groterKnop.addActionListener(this);
		kleinerKnop = new JButton("kleiner");
		kleinerKnop.addActionListener(this);
		add (linksKnop);
		add (rechtsKnop);
		add (groterKnop);
		add (kleinerKnop);
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
			else if ( e.getSource() == rechtsKnop)
			{
				xPos = xPos + verplaatsing;
			}
			else if ( e.getSource() == groterKnop)
			{
				if (xPos > -(getWidth()/2)+(huidigeGrootte/2) && xPos < (getWidth()/2)-(huidigeGrootte/2) && yPos < (getHeight()/2)-(huidigeGrootte/2))
				{
					huidigeGrootte = huidigeGrootte + 10;
				}
			}
			else if (e.getSource() == kleinerKnop && huidigeGrootte >= 11)
			{
					huidigeGrootte = huidigeGrootte - 10;
			}
		
		repaint();
	}
}
