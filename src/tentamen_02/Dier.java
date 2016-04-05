package tentamen_02;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Dier extends JPanel implements MouseListener, KeyListener
{
	private String soort;
	private int grootte;
	private boolean geslacht;
	private boolean over;
	private ImageIcon dierPlaatje;
	
	public Dier(String soort, int grootte, boolean geslacht)
	{
		this.soort = soort;
		this.grootte = grootte;
		this.geslacht = geslacht;
		addMouseListener( this );
		addKeyListener(this);
		setOpaque(false);
		setFocusable(true);
		
		dierPlaatje = new ImageIcon(Dier.class.getResource("/dieren/" + soort + ".png"));
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) 
	{
		this.requestFocus(true);
		
		over = true;
		repaint();
	}
	public void mouseExited(MouseEvent e) 
	{
		over = false;
		repaint();
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g); 
		
		if(over)
		{
			if(geslacht == true)
			{
				g.setColor(Color.PINK);
			}
			else if(geslacht == false)
			{
				g.setColor(Color.BLUE);
			}
			
			g.fillOval(0, 0, grootte, grootte);
		}
		
		g.drawImage(dierPlaatje.getImage(),0, 0, grootte, grootte, this);
	}
	
	public void veranderGeslacht()
	{
		geslacht = !geslacht;
	}
	
	public void voer()
	{
		grootte = grootte + 2;
		this.setBounds(this.getX()-1,this.getY()-1,grootte,grootte);
	}

	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
		switch( keyCode )
		{
			case KeyEvent.VK_F1 : veranderGeslacht();
			break;
			case KeyEvent.VK_F2 : voer();
			break;
		}
	}
	public void keyReleased(KeyEvent arg0) {}
	public void keyTyped(KeyEvent arg0) {}
	
	public String getSoort() {
		return soort;
	}

	public int getGrootte() {
		return grootte;
	}

	public Boolean getGeslacht() {
		return geslacht;
	}

	public Boolean getOver() {
		return over;
	}

	public void setSoort(String soort) {
		this.soort = soort;
	}

	public void setGrootte(int grootte) {
		this.grootte = grootte;
	}

	public void setGeslacht(Boolean geslacht) {
		this.geslacht = geslacht;
	}

	public void setOver(Boolean over) {
		this.over = over;
	}
}
