package H02_06;

import javax.swing.*;

public class BTW extends JFrame
{
	public BTW()
	{
		JFrame venster = new JFrame();
		venster.setSize(280,250);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("BTW Bereken paneel");
		venster.setLocation(100,100);
		JPanel hoofdpaneel = new BTWPaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	}
	
	public static void main( String [] args)
	{
		new BTW();
	}

}
