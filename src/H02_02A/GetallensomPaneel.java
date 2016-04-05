package H02_02A;

import javax.swing.*;
import java.awt.event.*;

public class GetallensomPaneel extends JPanel implements ActionListener 
{
	private JTextField invoerVeld1;
	private JTextField invoerVeld2;
	private JTextField invoerVeld3;
	private JTextField uitkomstVeld;
	private JButton rekenKnop;
	
	public GetallensomPaneel()
	{
		invoerVeld1 = new JTextField (10);
		invoerVeld2 = new JTextField (10);
		invoerVeld3 = new JTextField (10);
		uitkomstVeld = new JTextField (30);
		rekenKnop = new JButton ("Tel op");
		rekenKnop.addActionListener(this);
		add (invoerVeld1);
		add (invoerVeld2);
		add (invoerVeld3);
		add (rekenKnop);
		add (uitkomstVeld);

	}
	
	public void actionPerformed(ActionEvent e)
	{
		int invoer1 = Integer.parseInt(invoerVeld1.getText());
		int invoer2 = Integer.parseInt(invoerVeld2.getText());
		int invoer3 = Integer.parseInt(invoerVeld3.getText());
		uitkomstVeld.setText("De som van de velden is " + (invoer1 + invoer2 + invoer3));
	}
}
