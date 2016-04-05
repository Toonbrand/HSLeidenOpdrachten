package H08_Adventure;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;

/**
 * De held
 * @author Toon
 * @version 1.0
 */
public class Held extends Poppetje implements KeyListener, MouseListener
{
	private int snelheid = 5;
	
	/**
	 * De held
	 * @param xPos
	 * @param yPos
	 * @param breedte
	 * @param hoogte
	 * @param kleur
	 * @param naam
	 */
	public Held(int xPos, int yPos, int breedte, int hoogte, Color kleur, ImageIcon afbeelding)
	{
		
		super(xPos, yPos, breedte, hoogte, kleur, afbeelding);
		addKeyListener(this);
		addMouseListener(this);
		setFocusable(true);
		requestFocus(true);
	}

	/**
	 * Reageert op het toetsenbord
	 */
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
		switch( keyCode )
		{
			case KeyEvent.VK_DOWN : beweeg(0,snelheid);
			break;
			case KeyEvent.VK_UP : beweeg(0,-snelheid);
			break;
			case KeyEvent.VK_RIGHT : beweeg(snelheid,0);
			break;
			case KeyEvent.VK_LEFT : beweeg(-snelheid,0);
		}
		repaint();
	}
		
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	/**
	 * Reageerd als er geklikt word
	 */
	public void mousePressed(MouseEvent e) 
	{
		this.requestFocus(true);
	}
	public void mouseReleased(MouseEvent e) {}

	/**
	 * Tekend de held
	 */
	public void paintComponent(Graphics g)
	{
		g.drawImage(afbeelding.getImage(), 0, 0, breedte, hoogte, this);
	}
}
