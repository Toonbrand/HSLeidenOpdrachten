package H04_05_6_7;

import javax.swing.*;
import java.awt.*;

public class AutoBalOpstart extends JFrame
{
	public AutoBalOpstart()
	{
		JFrame venster = new JFrame();
		venster.setSize(700,400);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Automatische bal");
		venster.setLocation(100,100);

		AutoBal bal;
		bal = new AutoBal();
		venster.add(bal, BorderLayout.CENTER);

		AutoBalBediening bedieningspaneel;
		bedieningspaneel = new AutoBalBediening(bal);
		venster.add(bedieningspaneel, BorderLayout.SOUTH);
//asdfasdf
		venster.setVisible(true);
	}

	public static void main(String args[])
	{
		System.out.println(args.length);
		new AutoBalOpstart();
	}
}
