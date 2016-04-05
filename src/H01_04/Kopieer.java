package H01_04;

import javax.swing.*;

/**
 * @author Toon
 *
 */
public class Kopieer extends JFrame 
{
	public Kopieer()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Voorbeeld 1 van hoofdstuk 1");
		venster.setLocation(100,100);
		venster.add(new KopieerPaneel()); /*Voeg de classe KopieerPaneel toe aan het venster*/
		venster.setVisible(true);
	}
	
	public static void main(String[ ] args) /*De classe waar "main" in staat is de hoofdclasse*/
	{
		new Kopieer();
	}
}
