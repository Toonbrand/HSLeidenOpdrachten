package H05_04;

import javax.swing.*;
import java.awt.*;

public class KleurenstrookApp  extends JFrame
{
	public KleurenstrookApp()
	{
		JFrame venster = new JFrame();
		venster.setSize(700,300);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Afwisseldende kleuren");
		venster.setLocation(100,100);
		
		KleurenstrookTeken tekenPaneel = new KleurenstrookTeken();
		venster.add(tekenPaneel, BorderLayout.CENTER);
		
		KleurenstrookBediening kleurenstrookBediening = new KleurenstrookBediening(tekenPaneel);
		venster.add(kleurenstrookBediening, BorderLayout.SOUTH);
		
		venster.setVisible(true);
	}
	
	public static void main(String[]args)
	{
		new KleurenstrookApp();
	}

}
