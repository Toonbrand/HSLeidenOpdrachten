package H03_03A;

import javax.swing.*;

public class KleurenCirkels extends JFrame
{
	public KleurenCirkels()
	{
		JFrame venster = new JFrame();
		venster.setSize(1000,800);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("KleurenCirkels");
		venster.setLocation(100,100);
		venster.add(new KleurenCirkelsPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new KleurenCirkels();
	}

}
