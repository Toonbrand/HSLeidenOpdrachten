package H08_02;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class KlikPlaatjeApp extends JFrame
{
	KlikPlaatjePaneel klikPlaatjePaneel;
	
	public KlikPlaatjeApp()
	{
		setSize(425,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Klik op plaatjes");
		setLocation(100,50);
		
		klikPlaatjePaneel = new KlikPlaatjePaneel();
		add(klikPlaatjePaneel, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new KlikPlaatjeApp();
	}
}
