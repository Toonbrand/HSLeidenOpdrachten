package H04_05_6_7;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AutoBal extends JPanel implements ActionListener
{
	private int horizontalePlaats = 250; // beginpos
	private int verticalePlaats = 150; // beginpos
	private int richtingEnSnelheid = +4; // beginrichting/snelheid
	private final int beweegAfstand = 10; //hoeveel hij omhoog en omlaag beweegt
	private final int WACHTTIJD = 1; 
	final int BALDIAMETER = 100;

	public AutoBal()
	{
		Timer autoKlik = new javax.swing.Timer(WACHTTIJD,this);
		autoKlik.start();
	}
	
	public int getBeweegAfstand()
	{
		return beweegAfstand;
	}
	
	public int getHorPlaats()
	{
		return horizontalePlaats;
	}
	
	public int getVerPlaats()
	{
		return verticalePlaats;
	}
	
	public int getRichtingEnSnelheid()
	{
		return richtingEnSnelheid;
	}
	
	public void setHorPlaats(int nieuweHorPlaats)
	{
		horizontalePlaats = nieuweHorPlaats;
	}
	
	public void setVerPlaats(int nieuweVerPlaats)
	{
		verticalePlaats = nieuweVerPlaats;
	}
	
	public void setRichtingEnSnelheid(int nieuweRichtingEnSnelheid)
	{
		richtingEnSnelheid = nieuweRichtingEnSnelheid;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int breedte = getWidth();
		if(horizontalePlaats < 1) //links uit het scherm
		{
			setHorPlaats(1);  //links binnen het scherm
			setRichtingEnSnelheid(-getRichtingEnSnelheid()); //ga andere kant op
		}
		else if(horizontalePlaats > breedte-BALDIAMETER) //rechts uit het scherm
		{
			setHorPlaats(breedte-BALDIAMETER-3); //rechts binnen het scherm
			setRichtingEnSnelheid(-getRichtingEnSnelheid()); //ga andere kant op
		}
		else
		{
		setHorPlaats(getHorPlaats() + richtingEnSnelheid ); //beweeg
		}
		
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.setColor(Color.ORANGE);
		g.fillOval(horizontalePlaats, verticalePlaats, BALDIAMETER, BALDIAMETER);
		g.setColor(Color.BLACK);
		g.drawOval(horizontalePlaats, verticalePlaats, BALDIAMETER, BALDIAMETER);
		g.drawOval(horizontalePlaats + BALDIAMETER / 4, verticalePlaats, BALDIAMETER/2, BALDIAMETER);
	}
}
