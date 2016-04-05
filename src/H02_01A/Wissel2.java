package H02_01A;

import javax.swing.*;

/**
 * @author Toon
 *
 */
public class Wissel2 extends JFrame 
{
	public Wissel2()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Wissel...ding");
		venster.setLocation(100,100);
		venster.add(new Wissel2Paneel()); /*Voeg de classe KopieerPaneel toe aan het venster*/
		venster.setVisible(true);
	}
	
	public static void main(String[ ] args) /*De classe waar "main" in staat is de hoofdclasse*/
	{
		new Wissel2();
	}
}
