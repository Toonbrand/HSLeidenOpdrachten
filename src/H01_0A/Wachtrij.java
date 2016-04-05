package H01_0A;

import javax.swing.*;

/**
 * @author Toon
 *
 */
public class Wachtrij extends JFrame 
{
	public Wachtrij()
	{
		JFrame venster = new JFrame();
		venster.setSize(200,270);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Voorbeeld 1 van hoofdstuk 1");
		venster.setLocation(100,100);
		venster.add(new WachtrijPaneel()); /*Voeg de classe KopieerPaneel toe aan het venster*/
		venster.setVisible(true);
	}
	
	public static void main(String[ ] args) /*De classe waar "main" in staat is de hoofdclasse*/
	{
		new Wachtrij();
	}
}
