package H05_01;

import javax.swing.*;
import java.awt.*;

public class DobbelSteenOpstart extends JFrame
{
	public DobbelSteenOpstart()
	{
		JFrame venster = new JFrame();
		venster.setSize(440,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Dobbelsteen");
		venster.setLocation(100,100);
		
		DobbelSteen bal;
		bal = new DobbelSteen();
		venster.add(bal, BorderLayout.CENTER);
		
		DobbelSteenBediening bedieningspaneel;
		bedieningspaneel = new DobbelSteenBediening(bal);
		venster.add(bedieningspaneel, BorderLayout.SOUTH);
		
		venster.setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new DobbelSteenOpstart();
	}
}
