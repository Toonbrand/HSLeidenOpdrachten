package H08_05;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class GetallenInlezenApp extends JFrame
{
	GetallenInlezenPaneel getallenInlezenPaneel;
	
	public GetallenInlezenApp()
	{
		setSize(425,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Schrijf getallen weg");
		setLocation(100,50);
		
		getallenInlezenPaneel = new GetallenInlezenPaneel();
		add(getallenInlezenPaneel, BorderLayout.CENTER);
		
		setVisible(true);
	}

	public static void main(String[] args)
	{
		new GetallenInlezenApp();
	}
}
