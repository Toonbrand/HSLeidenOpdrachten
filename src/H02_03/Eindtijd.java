package H02_03;

import javax.swing.*;

public class Eindtijd extends JFrame
{
	public Eindtijd()
	{
		JFrame venster = new JFrame();
		venster.setSize(280,250);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Eind tijd berekening");
		venster.setLocation(100,100);
		JPanel hoofdpaneel = new EindtijdPaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	}
	
	public static void main( String [] args)
	{
		new Eindtijd();
	}

}
