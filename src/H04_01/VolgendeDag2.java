package H04_01;

import javax.swing.*;

public class VolgendeDag2 extends JFrame
{
	public VolgendeDag2()
	{
		JFrame venster = new JFrame();
		venster.setSize(350,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Bepaal volgende dag");
		venster.setLocation(100,100);
		venster.add(new VolgendeDag2Paneel());
		venster.setVisible(true);
	}
	
	public static void main (String[] args)
	{
		new VolgendeDag2();
	}

}
