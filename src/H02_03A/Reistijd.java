package H02_03A;

import javax.swing.*;

public class Reistijd extends JFrame
{
	public Reistijd()
	{
		JFrame venster = new JFrame();
		venster.setSize(280,250);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Eind tijd berekening");
		venster.setLocation(100,100);
		JPanel hoofdpaneel = new ReistijdPaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	}
	
	public static void main( String [] args)
	{
		new Reistijd();
	}

}
