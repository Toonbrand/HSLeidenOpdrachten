package H02_04;

import javax.swing.*;

public class Rechthoeken extends JFrame
{
	public Rechthoeken()
	{
		JFrame venster = new JFrame();
		venster.setSize(385,180);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Ta-dah");
		venster.setLocation(100, 100);
		JPanel hoofdpaneel = new RechthoekenPaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	}
	
	public static void main( String [] args)
	{
		new Rechthoeken();
	}

}
