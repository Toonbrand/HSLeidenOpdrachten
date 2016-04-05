package H03_0C;

import javax.swing.*;

public class Kaars2 extends JFrame
{
	public Kaars2()
	{
		JFrame venster = new JFrame();
		venster.setSize(200,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Kaars");
		venster.setLocation(100,50);
		venster.add(new Kaars2Paneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Kaars2();
	}

}
