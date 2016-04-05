package H05_03;

import javax.swing.*;
import java.awt.*;

public class UitgeschregenGetalApp extends JFrame
{
	public UitgeschregenGetalApp()
	{
		JFrame venster = new JFrame();
		venster.setSize(800,250);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Dobbelsteen");
		venster.setLocation(100,100);
		
		UitgeschrevenGetalPaneel uitgeschrevenGetalPaneel;
		uitgeschrevenGetalPaneel = new UitgeschrevenGetalPaneel();
		venster.add(uitgeschrevenGetalPaneel, BorderLayout.CENTER);
		
		venster.setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new UitgeschregenGetalApp();
	}
}
