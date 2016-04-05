package H03_0C;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kaars2Paneel extends JPanel implements ActionListener
{
	private JTextField pixelVeld;
	private JButton brandKnop;
	private JButton aanUitKnop1;
	private JButton aanUitKnop2;
	private int aantalPixels;
	private int lengte1 = 300, lengte2 = 300;
	private boolean aan1 = true, aan2 = true;
	
	public Kaars2Paneel()
	{
		pixelVeld = new JTextField("10", 4);
		pixelVeld.addActionListener(this);
		brandKnop = new JButton("Brand");
		brandKnop.addActionListener(this);
		aanUitKnop1 = new JButton("Aan/Uit");
		aanUitKnop1.addActionListener(this);
		aanUitKnop2 = new JButton("Aan/Uit");
		aanUitKnop2.addActionListener(this);
		bepaalIngesteldePixels();
		add(pixelVeld);
		add(brandKnop);
		add(aanUitKnop1);
		add(aanUitKnop2);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		tekenKaars(g, 25, 30, lengte1, Color.ORANGE, aan1);
		tekenKaars(g, 100, 30, lengte2, Color.GREEN, aan2);
	}
	public void tekenKaars( Graphics g, int x, int y, int grootte, Color kleur, boolean aan)
	{
		int breedte = 50;
		int breedteVlam = 20;
		int hoogteScherm = getHeight();
		g.setColor(kleur);
		g.fillRect(x, hoogteScherm - y - grootte, breedte, grootte);
		if (aan)
		{
			g.setColor(Color.YELLOW);
			g.fillOval(x + ((breedte/2)-breedteVlam/2), hoogteScherm - y - grootte - 30, breedteVlam, 30);
		}
		g.setColor(Color.BLACK);
		g.drawLine(x + (breedte/2), hoogteScherm - y - grootte - 20, x + (breedte/2), hoogteScherm - y - grootte);
	}
	
	public void bepaalIngesteldePixels()
	{
	aantalPixels = Integer.parseInt(pixelVeld.getText());
	}
	
	public int brand( int lengte, boolean aan, int hoeveel )
	{
		
			if(aan)
			{
				lengte = lengte - hoeveel;
			}
			return lengte;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalIngesteldePixels();
		if(e.getSource() == brandKnop || e.getSource() == pixelVeld)
		{
			if(aantalPixels > 0)
			{
				if(lengte1 - aantalPixels > 5)
				{lengte1 = brand(lengte1,aan1,aantalPixels);}
				else 
				{aan1 = false; lengte1 = 5;}
				if(lengte2 - aantalPixels > 5)
				{lengte2 = brand(lengte2,aan2,aantalPixels);}
				else
				{aan2 = false; lengte2 = 5;}
			}
		}
		else if(e.getSource() == aanUitKnop1)
		{
			if(lengte1 != 5)
			{aan1 = !aan1;}
		}
		else if(e.getSource() == aanUitKnop2)
		{
			if(lengte2 != 5)
			{aan2 = !aan2;}
		}
		repaint();
	}
}
