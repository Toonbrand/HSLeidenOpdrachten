package H03_03;

import javax.swing.*;

public class DiagonaleLijnen extends JFrame
{
	public DiagonaleLijnen()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("LijnenPaneel");
		venster.setLocation(100,100);
		venster.add(new DiagonaleLijnenPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new DiagonaleLijnen();
	}

}
