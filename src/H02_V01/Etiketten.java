package H02_V01;

import javax.swing.*;

public class Etiketten extends JFrame
{
	public Etiketten()
	{
		JFrame venster = new JFrame();
		venster.setSize(350,250);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Etikettencalculator");
		venster.setLocation(100,100);
		JPanel hoofdpaneel = new EtikettenPaneel();
		venster.add(hoofdpaneel);
		venster.setVisible(true);
	}
	
	public static void main( String [] args)
	{
		new Etiketten();
	}

}
