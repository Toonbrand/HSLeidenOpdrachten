package H03_O01;

import javax.swing.*;

public class MaakTekstVeld extends JFrame
{
	public MaakTekstVeld()
	{
		JFrame venster = new JFrame();
		venster.setSize(200,150);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("GrootteBal");
		venster.setLocation(100,50);
		venster.add(new MaakTekstVeldPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new MaakTekstVeld();
	}

}
