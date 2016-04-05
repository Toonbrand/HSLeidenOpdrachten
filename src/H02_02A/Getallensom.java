package H02_02A;

import javax.swing.*;

public class Getallensom extends JFrame 
{
	public Getallensom()
	{
		JFrame venster = new JFrame();
		venster.setSize(400,150);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Getallenmagie");
		venster.setLocation(100,100);
		venster.add(new GetallensomPaneel());
		venster.setVisible(true);
	}
	
	public static void main (String[ ] args)
	{
		new Getallensom();
	}
}
