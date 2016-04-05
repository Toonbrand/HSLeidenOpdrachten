package H09_MagicBubble;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 * De opstartklasse
 * @author Toon
 * @version 1.0
 */
public class BubbleApp extends JFrame
{
	BubblePaneel bubblePaneel;
	
	/**
	 * De opstartklasse
	 */
	public BubbleApp()
	{
		setLocation(100,100);
		setSize(1000,800);
		setTitle("Bubbles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		bubblePaneel = new BubblePaneel();
		add(bubblePaneel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	/**
	 * De main
	 * @param args
	 */
	public static void main(String[] args)
	{
		new BubbleApp();
	}
}
