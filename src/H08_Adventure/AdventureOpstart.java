package H08_Adventure;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * De opstartklasse
 * @author Toon
 * @version 1.0
 */

public class AdventureOpstart extends JFrame
{
	LevelPaneel levelPaneel;
	KnoppenBalk knoppenBalk;
	
	/**
	 * de opstartklasse
	 */
	public AdventureOpstart()
	{
		setSize(1000,750);
		setTitle("Avontuur");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		levelPaneel = new LevelPaneel();
		add(levelPaneel, BorderLayout.CENTER);
		
		knoppenBalk = new KnoppenBalk(levelPaneel);
		add(knoppenBalk, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	/**
	 * de main
	 * @param args
	 */
	public static void main(String[] args)
	{
		new AdventureOpstart();
	}
}