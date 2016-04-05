package H06_ScrollWiel;

import javax.swing.JFrame;

public class ScrollOpstart extends JFrame 
{
	public ScrollOpstart()
	{
		JFrame venster = new JFrame();
		venster.setSize(500,500);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("MuisKlik teken");
		venster.setLocation(100,100);
		venster.add(new ScrollPaneel()); /*Voeg de classe KopieerPaneel toe aan het venster*/
		venster.setVisible(true);
	}
	
	public static void main(String[ ] args) /*De classe waar "main" in staat is de hoofdclasse*/
	{
		new ScrollOpstart();
	}
}
