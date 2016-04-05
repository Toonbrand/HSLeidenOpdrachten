package H04_kaars2;

import javax.swing.*;

import java.awt.*; 
import java.awt.event.*; 

public class Kaars3App extends JFrame implements ActionListener
{
	private JButton aanUit1, aanUit2, aanUit3, aanUit4, aanUit5;
	private final int WACHTTIJD = 50, aantalPixels = 5;
	Kaars3Paneel kaars2Paneel;
	public Kaars3App()
	{
		setSize(450,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Kaars");
		setLocation(100,50);
		
		javax.swing.Timer autoKlik = new javax.swing.Timer(WACHTTIJD,this);
		autoKlik.start();
		
		kaars2Paneel = new Kaars3Paneel();
		add (kaars2Paneel, BorderLayout.CENTER);

		aanUit1 = new JButton ( "aan/uit1");
		aanUit1.addActionListener(this);
		kaars2Paneel.add(aanUit1);
		
		aanUit2 = new JButton ( "aan/uit2");
		aanUit2.addActionListener(this);
		kaars2Paneel.add(aanUit2);

		aanUit3 = new JButton ( "aan/uit3");
		aanUit3.addActionListener(this);
		kaars2Paneel.add(aanUit3);

		aanUit4 = new JButton ( "aan/uit4");
		aanUit4.addActionListener(this);
		kaars2Paneel.add(aanUit4);

		aanUit5 = new JButton ( "aan/uit5");
		aanUit5.addActionListener(this);
		kaars2Paneel.add(aanUit5);

		setVisible(true);
	}
	
	public void actionPerformed( ActionEvent e )
	  { 
		if(e.getSource()==aanUit1)
		{kaars2Paneel.regelKaarsVlam(1); }
		else if(e.getSource()==aanUit2)
		{kaars2Paneel.regelKaarsVlam(2); }
		else if(e.getSource()==aanUit3)
		{kaars2Paneel.regelKaarsVlam(3); }
		else if(e.getSource()==aanUit4)
		{kaars2Paneel.regelKaarsVlam(4); }
		else if(e.getSource()==aanUit5)
		{kaars2Paneel.regelKaarsVlam(5); }
		else
		{kaars2Paneel.brandDeKaars(aantalPixels);}
		kaars2Paneel.repaint();
	  }
	
	public static void main(String[] args)
	{
		new Kaars3App();
	}

}
