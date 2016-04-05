package H02_04;

import javax.swing.*;
import java.awt.*;

public class RechthoekenPaneel extends JPanel
{
	public void paintComponent(Graphics g)
	{
		//beginpos hor, beginpos ver, breedte, hoogte
		super.paintComponent(g);
		g.fillRect(10, 10, 30, 120);
		g.fillRect(60, 10, 70, 100);
		g.fillRect(110, 110, 20, 20);
		g.fillRect(150, 10, 20, 120);
		g.fillRect(240, 10, 10, 20);
		g.fillRect(190, 30, 90, 30);
		g.fillRect(210, 60, 70, 20);
		g.fillRect(190, 80, 90, 50);
		g.fillRect(330, 10, 30, 20);
		g.fillRect(300, 30, 60, 100);
	}

}
