package H07_Adventure;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Paneel waarop de spelelementen komen
 * @author Toon
 * @version 1.0
 */
public class LevelPaneel extends JPanel implements MouseListener, MouseMotionListener
{
	/**
	 * De lijst met spelelementen
	 */
	private ArrayList <SpelElement> spelElementen;
	private int xPos, yPos;

	/**
	 * Maakt het levelpaneel
	 */
	public LevelPaneel()
	{
		setLayout(null);
		addMouseListener(this);
		setFocusable(false);
		spelElementen = new ArrayList <SpelElement>();
	}
	
	/**
	 * Reageert als er op een muisknop geklikt word
	 */
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getButton() == e.BUTTON1)
		{
			SpelElement boom;
			boom = new SpelElement(e.getX(),e.getY(),50,100, Color.GREEN, "Boom");
			spelElementen.add(boom);
			boom.setBounds(boom.getxPos(),boom.getyPos(),boom.getBreedte(),boom.getHoogte());
			add(boom);
			
			repaint();
		}
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	/**
	 * Reageert als de muisknop losgelaten word
	 */
	public void mouseReleased(MouseEvent e) 
	{
		int breedte = e.getX() - xPos;
		int hoogte = e.getY() - yPos;
		
			if(e.getButton() == e.BUTTON1 && breedte != 0)
			{
				SpelElement muur;
				muur = new SpelElement(xPos,yPos,breedte,hoogte, Color.GRAY, "Muur");
				spelElementen.add(muur);
				muur.setBounds(muur.getxPos(),muur.getyPos(),muur.getBreedte(),muur.getHoogte());
				add(muur);
			}
		
		repaint();
	}
	
	/**
	 * Reageert als een muisknop ingedrukt word
	 */
	public void mousePressed(MouseEvent e) 
	{
		xPos = e.getX();
		yPos = e.getY();
		
		if(e.getButton() == e.BUTTON2)
		{
			Monster monster;
			monster = new Monster(e.getX(), e.getY(), 50, 100, Color.RED, "Monster");
			spelElementen.add(monster);
			monster.setBounds(monster.getxPos(),monster.getyPos(),monster.getBreedte(),monster.getHoogte());
			add(monster);
			repaint();
		}
		
		else if(e.getButton() == e.BUTTON3)
		{
			Held held;
			held = new Held(e.getX(), e.getY(), 50, 100, Color.BLUE, "Held");
			spelElementen.add(held);
			held.setBounds(held.getxPos(),held.getyPos(),held.getBreedte(),held.getHoogte());
			add(held);
			repaint();
			held.requestFocus();
		}
	}
	
	/**
	 * De tekenmethode die telkens het scherm weer leegmaakt voordat er opnieuw word getekend
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);		
	}

	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
}
