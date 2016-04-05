package H05_01;

import java.awt.*;
import javax.swing.*;

public class DobbelSteen extends JPanel
{

	private int aantalOgen;
	
	public void setAantalOgen(int nieuwAantal)
	{
		aantalOgen = nieuwAantal;
		repaint();
	}
	
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.drawRect(10, 10, 400, 400);
		if (aantalOgen == 1)
		{
			g.fillOval(205 - 55, 205 - 55, 110, 110);
		}
		else if (aantalOgen == 2)
		{
			g.fillOval(307 - 55, 307 - 55, 110, 110);
			g.fillOval(102 - 55, 102 - 55, 110, 110);
		}
		else if (aantalOgen == 3)
		{
			g.fillOval(307 - 55, 307 - 55, 110, 110);
			g.fillOval(102 - 55, 102 - 55, 110, 110);
			g.fillOval(205 - 55, 205 - 55, 110, 110);
		}
		else if (aantalOgen == 4)
		{
			g.fillOval(307 - 55, 307 - 55, 110, 110);
			g.fillOval(102 - 55, 102 - 55, 110, 110);
			g.fillOval(307 - 55, 102 - 55, 110, 110);
			g.fillOval(102 - 55, 307 - 55, 110, 110);
		}
		else if (aantalOgen == 5)
		{
			g.fillOval(307 - 55, 307 - 55, 110, 110);
			g.fillOval(102 - 55, 102 - 55, 110, 110);
			g.fillOval(307 - 55, 102 - 55, 110, 110);
			g.fillOval(102 - 55, 307 - 55, 110, 110);
			g.fillOval(205 - 55, 205 - 55, 110, 110);
		}
		else if (aantalOgen == 6)
		{
			g.fillOval(307 - 55, 307 - 55, 110, 110);
			g.fillOval(102 - 55, 102 - 55, 110, 110);
			g.fillOval(307 - 55, 102 - 55, 110, 110);
			g.fillOval(102 - 55, 307 - 55, 110, 110);
			g.fillOval(102 - 55, 205 - 55, 110, 110);
			g.fillOval(307 - 55, 205 - 55, 110, 110);
		}
	}
}
