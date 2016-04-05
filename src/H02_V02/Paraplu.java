package H02_V02;

import javax.swing.*;

public class Paraplu extends JFrame
{
	public Paraplu()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Een gekleurde paraplu");
		venster.setLocation(100,100);
		venster.add(new ParapluPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Paraplu();
	}

}
