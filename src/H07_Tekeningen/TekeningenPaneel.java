package H07_Tekeningen;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

/**
 * Paneel waarop de tekening komt
 * @author Toon
 * @version 1.0
 */
public class TekeningenPaneel extends JPanel implements MouseListener, MouseMotionListener, KeyListener
{
	/**
	 * De lijst met tekeningen
	 */
	private ArrayList <Tekening> tekeningen;
	private Tekening huidigeTekening;
	Random generator = new Random();
	
	/**
	 * Het tekeingenpaneel
	 */
	public TekeningenPaneel()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		
		setFocusable( true );
		requestFocus();
		
		tekeningen = new ArrayList<Tekening>();
		
		huidigeTekening = new Tekening(new Color(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255)));
		
		tekeningen.add (huidigeTekening);
	}
	
	/**
	 * Reageerd als de muis gesleept word
	 */
	public void mouseDragged(MouseEvent e) 
	{
		huidigeTekening.voegPuntToe(e.getPoint());
		repaint();
	}
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	/**
	 * Reageerd als de muis ingedrukt word
	 */
	public void mousePressed(MouseEvent e) 
	{
		if(e.isMetaDown())
		{
			huidigeTekening = new Tekening(new Color(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255)));
			tekeningen.add(huidigeTekening);
		}
		else
		{
			huidigeTekening.voegPuntToe(e.getPoint());
		}
		
		repaint();
	}
	public void mouseReleased(MouseEvent e) {}
	
	/**
	 * Reageerd als toetsen worden ingedrukt
	 */
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
		switch( keyCode )
		{
			
			case KeyEvent.VK_DOWN : huidigeTekening.beweeg(0, +1);
			break;
			case KeyEvent.VK_UP : huidigeTekening.beweeg(0, -1);
			break;
			case KeyEvent.VK_RIGHT : huidigeTekening.beweeg(+1, 0);
			break;
			case KeyEvent.VK_LEFT : huidigeTekening.beweeg(-1, 0);
		}
		repaint();
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}

	/**
	 * De tekenmethode
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(Tekening tekening : tekeningen)
		{
			tekening.teken(g);
		}
	}

}
