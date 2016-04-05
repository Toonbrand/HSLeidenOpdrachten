package H03_09;

import javax.swing.JFrame;

public class VolgendeDag extends JFrame {
	
	public VolgendeDag()
	{
		JFrame venster = new JFrame();
		venster.setSize(300,150);
		venster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		venster.setTitle("Bepaal volgende dag");
		venster.setLocation(100,100);
		venster.add(new VolgendeDagPaneel());
		venster.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new VolgendeDag();
	}

}
