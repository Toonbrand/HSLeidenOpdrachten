package H06_MuisSleep;

import javax.swing.JFrame;

public class MuisSleepOpstart extends JFrame 
{
	public MuisSleepOpstart()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("MuisKlik teken");
		venster.setLocation(100,100);
		venster.add(new MuisSleepPaneel()); /*Voeg de classe KopieerPaneel toe aan het venster*/
		venster.setVisible(true);
	}
	
	public static void main(String[ ] args) /*De classe waar "main" in staat is de hoofdclasse*/
	{
		new MuisSleepOpstart();
	}
}
