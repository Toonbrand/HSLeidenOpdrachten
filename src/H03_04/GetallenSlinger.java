package H03_04;

import javax.swing.*;

public class GetallenSlinger extends JFrame
{
	public GetallenSlinger()
	{
		JFrame venster = new JFrame();
		venster.setSize(520,200);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("GetallenSlinger");
		venster.setLocation(100,100);
		venster.add(new GetallenSlingerPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new GetallenSlinger();
	}

}
