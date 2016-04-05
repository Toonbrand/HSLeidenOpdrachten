package H08_01;

import javax.swing.*;

public class TekenBal extends JFrame
{
	public TekenBal()
	{
		JFrame venster = new JFrame();
		venster.setSize(700,700);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("SuperrrrBal");
		venster.setLocation(100,50);
		venster.add(new TekenBalPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new TekenBal();
	}

}
