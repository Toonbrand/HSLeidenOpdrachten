package H06_MuisKlik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TekenPaneel extends JPanel implements MouseListener
{
	private int x = -50, y = -50;
	private int muisX, muisY;
	private String s = " ";
	
	public TekenPaneel()
	{
		add( new Label( "Klik met de muis") );
		addMouseListener( this );
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		g.drawString(s, muisX, muisY);
		g.setColor( Color.red );
		g.fillOval( x - 10, y - 10, 20, 20 );
	}
	
	public void mousePressed( MouseEvent e )
	{
		x = e.getX();
		y = e.getY();
		repaint();
	}
	
	public void mouseReleased ( MouseEvent e )
	{
		x = -50;
		y = -50;
		repaint();
	}
		
	public void mouseClicked( MouseEvent e ) 
	{
		muisX = e.getX();
		muisY = e.getY();
		s = (muisX + " " + muisY);
	}
	
	public void mouseEntered( MouseEvent e ) {}
	public void mouseExited( MouseEvent e ) {}
}