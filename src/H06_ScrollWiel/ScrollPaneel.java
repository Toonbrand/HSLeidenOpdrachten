package H06_ScrollWiel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ScrollPaneel extends JPanel implements MouseWheelListener
{
	private int grootte = 50;
	private int muisX, muisY;
	private String s = " ";
	
	public ScrollPaneel()
	{
		addMouseWheelListener( this );
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		g.drawString(s, muisX, muisY);
		g.setColor( Color.YELLOW );
		g.fillOval( 10, 10, grootte, grootte );
	}
	
	public void mouseWheelMoved( MouseWheelEvent e )
	{
		muisX = e.getX();
		muisY = e.getY();
		s = ""+ grootte;
		grootte += e.getWheelRotation();
		repaint();
	}
}