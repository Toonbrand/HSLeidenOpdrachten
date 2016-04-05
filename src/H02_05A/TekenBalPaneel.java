package H02_05A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TekenBalPaneel extends JPanel implements ActionListener
{
	private JTextField grootteVeld;
	private JTextField xPosVeld;
	private JTextField yPosVeld;
	private JButton tekenknop;
	private int huidigeGrootte;
	private int xPos;
	private int yPos;
	
	public TekenBalPaneel()
	{
		grootteVeld = new JTextField("50", 4);
		xPosVeld = new JTextField("0", 4);
		yPosVeld = new JTextField("0", 4);
		tekenknop = new JButton("Teken");
		tekenknop.addActionListener(this);
		bepaalIngesteldeGrootte();
		add(new JLabel("Grootte"));
		add(grootteVeld);
		add(new JLabel("xPos"));
		add(xPosVeld);
		add(new JLabel("yPos"));
		add(yPosVeld);
		add(tekenknop);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		tekenBal(g,xPos,yPos,huidigeGrootte, Color.ORANGE);
		tekenBal(g,xPos + 150 + huidigeGrootte,yPos,huidigeGrootte, Color.GREEN);
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
	
	public void bepaalIngesteldeGrootte()
	{
		yPos = Integer.parseInt(yPosVeld.getText());
		xPos = Integer.parseInt(xPosVeld.getText());
		huidigeGrootte = Integer.parseInt(grootteVeld.getText());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalIngesteldeGrootte();
		repaint();
	}
}
