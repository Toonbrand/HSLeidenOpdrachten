package H09_MagicBubble;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * De bubbel
 * @author Toon
 * @version 1.0
 */
public class MagicBubble extends JPanel implements MouseListener
{
	private Color kleur;
	private int straal, dx, dy, status;
	private int maximumStraal = 50;
	private Point middelpunt;
	
	/**
	 * De bubbel
	 * @param kleur
	 * @param middelpunt
	 * @param straal
	 * @param dx
	 * @param dy
	 * @param status
	 */
	public MagicBubble(Color kleur, Point middelpunt, int straal, int dx, int dy, int status)
	{
		this.kleur = kleur;
		this.middelpunt = middelpunt;
		this.straal = straal;
		this.dx = dx;
		this.dy = dy;
		this.status = status;
		this.setOpaque(false);
		addMouseListener(this);
		setFocusable(true);
	}
	
	/**
	 * Tekend de bubbel
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		int grootte = straal*2;
		g.setColor(kleur);
		g.fillOval(0, 0, grootte, grootte);
		repaint();
	}
	
	/**
	 * Kijkt of de bubbles niet de rand van het scherm raken en laat ze bewegen
	 */
	public void beweeg() //beweeg en check de kanten
	{
		if (middelpunt.x + straal + dx >= 985) 
		{
			dx = -1;
		}
		else if (middelpunt.x - straal - dx <= 0)
		{
			dx = +1;
		}
			
		else if (middelpunt.y + straal + dy >= 765) 
		{
			dy = -1;
		}
		
		else if (middelpunt.y - straal - dy <= 0)
		{
			dy = +1;
		}
		
		middelpunt.x = middelpunt.x + dx;
		middelpunt.y = middelpunt.y + dy;
	}

	/**
	 * Laat de bubbels exploderen
	 */
	public void explodeer()
	{
		if(straal < maximumStraal)
		{
			straal = straal + 1;
		}
		else
		{
			status = 3;
		}
	}
	
	/**
	 * Laat de bubbels krimpen
	 */
	public void krimp()
	{
		if(straal - 5 > 0)
		{
			straal = straal - 1;
		}
		else
		{
			status = 4;
		}
	}
	
	/**
	 * Laat de bubbels animeren op basis van de status
	 */
	public void animeer()
	{
		if (status == 1) //bewegen
		{
			beweeg();
		}
		else if (status == 2) //exploderen
		{
			explodeer();
		}
		else if (status == 3) //krimpen
		{
			krimp();
		}
		else if (status == 4) //klaar :)
		{
			straal = 0;
			middelpunt.x = middelpunt.x - 1000; 
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	public void mouseClicked(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	public void mousePressed(MouseEvent arg0) 
	{
		//status = 2;
	}
	public void mouseReleased(MouseEvent arg0) {}
	
	
	
	
	
	public int getDx() {
		return dx;
	}

	public void setDx(int dx) {
		this.dx = dx;
	}

	public int getDy() {
		return dy;
	}

	public void setDy(int dy) {
		this.dy = dy;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getMaximumStraal() {
		return maximumStraal;
	}

	public void setMaximumStraal(int maximumStraal) {
		this.maximumStraal = maximumStraal;
	}

	public Color getKleur() {
		return kleur;
	}

	public void setKleur(Color kleur) {
		this.kleur = kleur;
	}

	public int getStraal() {
		return straal;
	}

	public void setStraal(int straal) {
		this.straal = straal;
	}

	public Point getMiddelpunt() {
		return middelpunt;
	}

	public void setMiddelpunt(Point middelpunt) {
		this.middelpunt = middelpunt;
	}
	
	
}
