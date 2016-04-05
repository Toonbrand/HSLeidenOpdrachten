package H05_pacman;

import javax.swing.*;
import java.awt.*;

public class PacmanApp extends JFrame
{
	public PacmanApp()
	{
		JFrame venster = new JFrame();
		venster.setSize(1100,900);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Pacman");
		venster.setLocation(100,50);
		
		PacmanPaneel pacmanPaneel;
		pacmanPaneel = new PacmanPaneel();
		venster.add(pacmanPaneel, BorderLayout.CENTER);
		
		PacmanBediening1 bedieningspaneel1;
		bedieningspaneel1 = new PacmanBediening1(pacmanPaneel);
		venster.add(bedieningspaneel1, BorderLayout.SOUTH);
		
		PacmanBediening2 bedieningspaneel2;
		bedieningspaneel2 = new PacmanBediening2(pacmanPaneel);
		venster.add(bedieningspaneel2, BorderLayout.NORTH);
		
		venster.setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new PacmanApp();
	}
}
