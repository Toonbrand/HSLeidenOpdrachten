package H02_05;

import javax.swing.*;

public class Bal extends JFrame
{
	public Bal()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,600);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Een gekleurde paraplu");
		venster.setLocation(100,100);
		venster.add(new BalPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Bal();
	}

}
