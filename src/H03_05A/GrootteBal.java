package H03_05A;

import javax.swing.*;

public class GrootteBal extends JFrame
{
	public GrootteBal()
	{
		JFrame venster = new JFrame();
		venster.setSize(350,700);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("GrootteBal");
		venster.setLocation(100,50);
		venster.add(new GrootteBalPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GrootteBal();
	}

}
