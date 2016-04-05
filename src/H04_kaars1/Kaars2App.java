package H04_kaars1;

import javax.swing.*;

import java.awt.*; 
import java.awt.event.*; 

public class Kaars2App extends JFrame implements ActionListener
{
	private JButton brandKnop, aanUit1, aanUit2, aanUit3, aanUit4, aanUit5;
	private JTextField invoerVeld;
	Kaars2Paneel kaars2Paneel;
	public Kaars2App()
	{
		setSize(425,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Kaars");
		setLocation(100,50);
		
		kaars2Paneel = new Kaars2Paneel();
		add (kaars2Paneel, BorderLayout.CENTER);


		invoerVeld = new JTextField("10",5);
		kaars2Paneel.add(invoerVeld);

		brandKnop = new JButton( "Brand" );
		brandKnop.addActionListener( this );
		kaars2Paneel.add( brandKnop);

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
		if(e.getSource()== brandKnop)
		{kaars2Paneel.brandDeKaars(Integer.parseInt(invoerVeld.getText()));}
		else if(e.getSource()==aanUit1)
		{kaars2Paneel.regelKaarsVlam(1); }
		else if(e.getSource()==aanUit2)
		{kaars2Paneel.regelKaarsVlam(2); }
		else if(e.getSource()==aanUit3)
		{kaars2Paneel.regelKaarsVlam(3); }
		else if(e.getSource()==aanUit4)
		{kaars2Paneel.regelKaarsVlam(4); }
		else if(e.getSource()==aanUit5)
		{kaars2Paneel.regelKaarsVlam(5); }
		kaars2Paneel.repaint();
	  }
	
	public static void main(String[] args)
	{
		new Kaars2App();
	}

}
