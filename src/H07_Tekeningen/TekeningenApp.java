package H07_Tekeningen;

import java.awt.*;
import javax.swing.*;

/**
 * De opstartklasse
 * @author Toon
 * @version 1.0
 */
public class TekeningenApp extends JFrame
{
	TekeningenPaneel tekeningenPaneel;
	
	/**
	 * De opstartklasse
	 */
	public TekeningenApp()
	{
		setSize(500,500);
		setTitle("Vingerverven deluxe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tekeningenPaneel = new TekeningenPaneel();
		
		add(tekeningenPaneel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	/**
	 * De main
	 * @param args
	 */
	public static void main(String[] args)
	{
		new TekeningenApp();
	}
}
