package tentamen_01;

import javax.swing.*;
import java.awt.*;

public class WatersportApp extends JFrame
{
	public WatersportApp()
	{
		JFrame venster = new JFrame();
		venster.setSize(1200,700);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Zeilboot");
		venster.setLocation(100,50);
		
		WaterzichtPaneel tekenPaneel = new WaterzichtPaneel();
		venster.add(tekenPaneel, BorderLayout.CENTER);
		
		KnoppenbalkPaneel knoppenbalkPaneel = new KnoppenbalkPaneel(tekenPaneel);
		venster.add(knoppenbalkPaneel, BorderLayout.SOUTH);
		
		venster.setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new WatersportApp();
	}
}
