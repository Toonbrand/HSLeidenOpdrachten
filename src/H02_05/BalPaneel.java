package H02_05;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BalPaneel extends JPanel implements ActionListener
{
	private JTextField pixelVeld;
	private JButton tekenknop;
	private int huidigeGrootte;
	
	public BalPaneel()
	{
		pixelVeld = new JTextField("400", 4);
		tekenknop = new JButton("Teken");
		tekenknop.addActionListener(this);
		bepaalIngesteldeGrootte();
		add(new JLabel("Grootte"));
		add(pixelVeld);
		add(tekenknop);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int middenX = getWidth()/2;
		int breedte = getWidth();
		int hoogte = getHeight();
		g.setColor(Color.ORANGE);
		g.fillOval(middenX - huidigeGrootte/2, hoogte - 30 - huidigeGrootte, huidigeGrootte, huidigeGrootte);
		g.setColor(Color.BLACK);
		g.drawOval(middenX - huidigeGrootte/2, hoogte - 30 - huidigeGrootte, huidigeGrootte, huidigeGrootte);
		g.drawOval(middenX - huidigeGrootte/4, hoogte - 30 - huidigeGrootte, huidigeGrootte/2, huidigeGrootte);
		g.setColor(Color.GREEN);
		g.drawLine(30, hoogte - 30, breedte - 30, hoogte - 30);
	}
	public void bepaalIngesteldeGrootte()
	{
	huidigeGrootte = Integer.parseInt(pixelVeld.getText());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalIngesteldeGrootte();
		repaint();
	}
}
