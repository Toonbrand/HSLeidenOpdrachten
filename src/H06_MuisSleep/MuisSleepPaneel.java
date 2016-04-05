package H06_MuisSleep;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MuisSleepPaneel extends JPanel implements MouseListener, MouseMotionListener
{
	private int startX, startY, eindX, eindY;
	private int startX1, startY1, eindX1, eindY1;
	private Color kleur = Color.BLACK;
	public MuisSleepPaneel()
	{
		addMouseListener( this );
		addMouseMotionListener( this );
	}
	
	public void paintComponent( Graphics g )
	{
		super.paintComponent( g );
		g.setColor(kleur);
		g.drawLine( startX, startY, eindX, eindY );
	}
	
	public void mousePressed( MouseEvent e )
	{
		startX = e.getX();
		startY = e.getY();
	}
	
	public void mouseDragged( MouseEvent e )
	{
		if (e.isShiftDown())
		{
			kleur = Color.red;
		}
		else
		{
			kleur = Color.black;
		}
		eindX = e.getX();
		eindY = e.getY();
		repaint();
		startX1 = startX;
		startY1 = startY;
		eindX1 = eindX;
		startY1 = startY;
	}
	public void mouseClicked( MouseEvent e ) {}
	public void mouseEntered( MouseEvent e ) {}
	public void mouseExited( MouseEvent e ) {}
	public void mouseReleased( MouseEvent e ) {}
	public void mouseMoved( MouseEvent e ) 
	{
		startX = e.getX() + (startX1 - eindX1);
		startY = e.getY() + (startY1 - eindX1);
		repaint();
	}
}