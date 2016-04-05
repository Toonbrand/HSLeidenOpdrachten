package H08_04;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class GetallenWegschrijvenApp extends JFrame
{
	GetallenWegschrijvenPaneel getallenWegschrijvenPaneel;
	
	public GetallenWegschrijvenApp()
	{
		setSize(425,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Schrijf getallen weg");
		setLocation(100,50);
		
		getallenWegschrijvenPaneel = new GetallenWegschrijvenPaneel();
		add(getallenWegschrijvenPaneel, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new GetallenWegschrijvenApp();
	}
}
