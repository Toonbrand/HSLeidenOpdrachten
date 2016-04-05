package H08_Tekeningen;

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
	KnoppenbalkPaneel knoppenbalkPaneel;
	
	/**
	 * De opstartklasse
	 */
	public TekeningenApp()
	{
		setSize(500,500);
		setTitle("Vingerverven deluxe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tekeningenPaneel = new TekeningenPaneel();
		knoppenbalkPaneel = new KnoppenbalkPaneel(tekeningenPaneel);
		
		add(tekeningenPaneel, BorderLayout.CENTER);
		add(knoppenbalkPaneel, BorderLayout.SOUTH);
		
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
