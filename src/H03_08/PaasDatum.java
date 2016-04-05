package H03_08;

import javax.swing.*;

public class PaasDatum extends JFrame
{
	public PaasDatum()
	{
		JFrame venster = new JFrame();
		venster.setSize(310,180);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Paasdatum");
		venster.setLocation(100,50);
		venster.add(new PaasDatumPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new PaasDatum();
	}

}
