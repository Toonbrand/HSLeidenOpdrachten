package H02_01;

import javax.swing.*;

/**
 * @author Toon
 *
 */
public class Wissel extends JFrame 
{
	public Wissel()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Wissel...ding");
		venster.setLocation(100,100);
		venster.add(new WisselPaneel()); /*Voeg de classe KopieerPaneel toe aan het venster*/
		venster.setVisible(true);
	}
	
	public static void main(String[ ] args) /*De classe waar "main" in staat is de hoofdclasse*/
	{
		new Wissel();
	}
}
