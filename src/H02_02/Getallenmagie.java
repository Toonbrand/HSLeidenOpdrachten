package H02_02;

import javax.swing.*;

public class Getallenmagie extends JFrame 
{
	public Getallenmagie()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Getallenmagie");
		venster.setLocation(100,100);
		venster.add(new GetallenmagiePaneel());
		venster.setVisible(true);
	}
	
	public static void main (String[ ] args)
	{
		new Getallenmagie();
	}
}
