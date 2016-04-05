package tentamen_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class KnoppenBalk extends JPanel implements ActionListener
{
	private JTextField veld1, veld2;
	private JButton knop1, knop2, knop3, knop4, knop5;
	
	public KnoppenBalk()
	{
		veld1 = new JTextField("Veld 1", 20);
		veld2 = new JTextField("Veld 2", 20);
		
		knop1 = new JButton("Knop 1");
		knop1.addActionListener(this);
		knop2 = new JButton("Knop 2");
		knop2.addActionListener(this);
		knop3 = new JButton("Knop 3");
		knop3.addActionListener(this);
		knop4 = new JButton("Knop 4");
		knop4.addActionListener(this);
		knop5 = new JButton("Knop 5");
		knop5.addActionListener(this);
		
		add(veld1);
		add(veld2);
		add(knop1);
		add(knop2);
		add(knop3);
		add(knop4);
		add(knop5);
	}

	public void actionPerformed(ActionEvent e) 
	{
		
	}

}
