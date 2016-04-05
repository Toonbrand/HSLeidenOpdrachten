package H03_05;

import javax.swing.*;

public class VerplaatsBal extends JFrame
{
	public VerplaatsBal()
	{
		JFrame venster = new JFrame();
		venster.setSize(700,700);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("SuperrrrBal");
		venster.setLocation(100,50);
		venster.add(new VerplaatsBalPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new VerplaatsBal();
	}

}
