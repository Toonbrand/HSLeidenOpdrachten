package H02_0B;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KaarsPaneel extends JPanel implements ActionListener
{
	private JTextField pixelVeld;
	private JButton brandKnop;
	private int aantalPixels;
	private int hoogte = 350;
	
	public KaarsPaneel()
	{
		pixelVeld = new JTextField("10", 4);
		brandKnop = new JButton("Teken");
		brandKnop.addActionListener(this);
		bepaalIngesteldePixels();
		add(pixelVeld);
		add(brandKnop);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		tekenKaars(g, 40, 30, hoogte, Color.ORANGE);
		tekenKaars(g, 140, 30, hoogte, Color.GREEN);
	}
	public void tekenKaars( Graphics g, int x, int y, int grootte, Color kleur)
	{
		int breedte = 50;
		int breedteVlam = 20;
		int hoogteScherm = getHeight();
		g.setColor(kleur);
		g.fillRect(x, hoogteScherm - y - hoogte, breedte, grootte);
		g.setColor(Color.YELLOW);
		g.fillOval(x + ((breedte/2)-breedteVlam/2), hoogteScherm - y - hoogte - 30, breedteVlam, 30);
		g.setColor(Color.BLACK);
		g.drawLine(x + (breedte/2), hoogteScherm - y - hoogte - 20, x + (breedte/2), hoogteScherm - y - hoogte);
	}
	
	public void bepaalIngesteldePixels()
	{
	aantalPixels = Integer.parseInt(pixelVeld.getText());
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalIngesteldePixels();
		hoogte = hoogte - aantalPixels;
		repaint();
	}
}
