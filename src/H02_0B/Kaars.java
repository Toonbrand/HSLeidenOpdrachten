package H02_0B;

import javax.swing.*;

public class Kaars extends JFrame
{
	public Kaars()
	{
		JFrame venster = new JFrame();
		venster.setSize(250,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Kaars");
		venster.setLocation(100,50);
		venster.add(new KaarsPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Kaars();
	}

}
