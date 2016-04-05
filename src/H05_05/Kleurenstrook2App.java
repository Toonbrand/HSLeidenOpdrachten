package H05_05;

import javax.swing.*;
import java.awt.*;

public class Kleurenstrook2App  extends JFrame
{
	public Kleurenstrook2App()
	{
		JFrame venster = new JFrame();
		venster.setSize(700,300);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Afwisseldende kleuren");
		venster.setLocation(100,100);
		
		Kleurenstrook2Teken tekenPaneel = new Kleurenstrook2Teken();
		venster.add(tekenPaneel, BorderLayout.CENTER);
		
		Kleurenstrook2Bediening kleurenstrookBediening = new Kleurenstrook2Bediening(tekenPaneel);
		venster.add(kleurenstrookBediening, BorderLayout.SOUTH);
		
		venster.setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new Kleurenstrook2App();
	}

}
