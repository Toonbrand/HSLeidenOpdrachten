package H05_pacman;

import java.awt.*;
import javax.swing.*;

public class Raster extends JPanel
{
	
	int score; 
	int[][]hokjes = new int [20][40];
	
	
	public Raster()
	{
		
		for (int rij = 0; rij < hokjes.length; rij++)
		{
			for (int kolom = 0; kolom < hokjes[0].length; kolom++)
			{
				hokjes[rij][kolom] = 1;
			}
		}
		
	}
	
	public void eetBonus(int x, int y, int grootte)
	{
		for (int aantal6 = 0; aantal6 < hokjes[0].length; aantal6++)
		{
			for (int aantal5 = 0; aantal5 < hokjes.length; aantal5++)
			{
				if(x > aantal5*50 && x < aantal5*50+grootte)
				{
					if(y > aantal5*50 && y < aantal5*50+grootte)
					{
						//hokjes[aantal6][aantal5]=0;
					}
				}
			}
		}
	}
	
	public void teken(Graphics g)
	{
		super.paintComponent(g);
		for (int aantal = 0; aantal < hokjes.length; aantal++)
		{
			g.setColor(Color.BLACK);
			g.drawLine(0, aantal*50, 2000, aantal*50);
		}
		
		for (int aantal2 = 0; aantal2 < hokjes[0].length; aantal2++)
		{
			g.setColor(Color.BLACK);
			g.drawLine(aantal2*50, 0, aantal2*50, 2000);
		}
		
		for (int aantal3 = 0; aantal3 < hokjes[0].length; aantal3++)
		{
			g.setColor(Color.BLACK);
			for (int aantal4 = 0; aantal4 < hokjes.length; aantal4++)
			{
				if(hokjes[aantal4][aantal3] == 1)
				{
					g.fillOval(aantal3*50+10, aantal4*50+10, 25, 25);
				}
				/*else if(hokjes[aantal4][aantal3] == 0)
				{
					g.setColor(Color.RED);
					g.fillOval(aantal3*50+10, aantal4*50+10, 25, 25);
				}*/
			}
			
		}
	}

}
