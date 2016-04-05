package H03_01;

import javax.swing.*;

public class Lijnen extends JFrame
{
	public Lijnen()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("LijnenPaneel");
		venster.setLocation(100,100);
		venster.add(new LijnenPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Lijnen();
	}

}
