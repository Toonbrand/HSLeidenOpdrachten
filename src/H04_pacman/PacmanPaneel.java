package H04_pacman;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;


public class PacmanPaneel extends JPanel implements ActionListener
{
	private Pacman pacman;
	private Spook spook1, spook2, spook3, spook4;
	private final int WACHTTIJD = 50;
	Random generator = new Random();
	
	public PacmanPaneel()
	{
		pacman = new Pacman(500,500,100,0,5,Color.YELLOW);
		spook1 = new Spook(100,100,100,0,5,Color.RED);
		spook2 = new Spook(100,100,100,5,0,Color.BLUE);
		spook3 = new Spook(100,100,100,0,-5,Color.ORANGE);
		spook4 = new Spook(100,100,100,-5, 0,Color.PINK);
		Timer autoKlik = new Timer( WACHTTIJD, this );
	    autoKlik.start();
	}
	
	
	public void setHorRichting(int nieuweHorRichting)
	{
		pacman.setHorRichting(nieuweHorRichting);
	}
	
	public void setVerRichting(int nieuweVerRichting)
	{
		pacman.setVerRichting(nieuweVerRichting);
	}
	
	public void setGrootte(int nieuweGrootte)
	{
		pacman.setGrootte(pacman.getGrootte()+nieuweGrootte);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		pacman.teken(g);
		spook1.teken(g);
		spook2.teken(g);
		spook3.teken(g);
		spook4.teken(g);
	}
	
	
	
	public void actionPerformed(ActionEvent e)
	{	
		pacman.verPlaats();
		pacman.toggleMond();
		pacman.setScherm(getWidth(), getHeight());
		
		spook1.verPlaats();
		spook1.toggleAnimatie();
		spook1.setScherm(getWidth(), getHeight());
		
		spook2.verPlaats();
		spook2.toggleAnimatie();
		spook2.setScherm(getWidth(), getHeight());
		
		spook3.verPlaats();
		spook3.toggleAnimatie();
		spook3.setScherm(getWidth(), getHeight());
		
		spook4.verPlaats();
		spook4.toggleAnimatie();
		spook4.setScherm(getWidth(), getHeight());
		repaint();
	}
}
