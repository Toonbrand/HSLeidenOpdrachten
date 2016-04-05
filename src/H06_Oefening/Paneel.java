package H06_Oefening;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JPanel;

/**
 * Paneel met random achtergrond kleur.
 * @author Toon
 * @version 1.0
 */

public class Paneel extends JPanel implements KeyListener
{
	/**
	 * De random generator.
	 */
	private Random random;
	
	/**
	 * Maakt een nieuw paneel
	 */
	public Paneel()
	{
		Muis muis = new Muis(this);
		addMouseWheelListener(muis);
		addMouseListener(muis);
		addKeyListener(this);
		setFocusable(true);
		requestFocus();
		
		random = new Random();
		randomAchtergrond();
	}
	
	/**
	 * Maakt een random waarde
	 * @return De random waarde
	 */
	private int randomWaarde()
	{
		return random.nextInt(256);
	}
	
	/**
	 * Maakt een willekeurige kleur
	 * @return willekeurige kleur
	 */
	private Color maakKleur()
	{
		return new Color(randomWaarde(), randomWaarde(), randomWaarde());
	}
	
	/**
	 * Stelt de achtergrond kleur in
	 */
	public void randomAchtergrond()
	{
		setBackground(maakKleur());
	}

	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}
	
	/**
	 * Voert randomAchtergrond uit als iemand op A drukt
	 */
	public void keyTyped(KeyEvent e) 
	{
		if (e.getKeyChar() == 'a')
		{
			randomAchtergrond();
		}
	}

}
