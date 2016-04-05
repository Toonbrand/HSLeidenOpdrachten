package H06_DubbelKlik;

import javax.swing.JFrame;

public class DubbelKlikOpstart extends JFrame 
{
	public DubbelKlikOpstart()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("MuisKlik teken");
		venster.setLocation(100,100);
		venster.add(new DubbelKlikPaneel()); /*Voeg de classe KopieerPaneel toe aan het venster*/
		venster.setVisible(true);
	}
	
	public static void main(String[ ] args) /*De classe waar "main" in staat is de hoofdclasse*/
	{
		new DubbelKlikOpstart();
	}
}
