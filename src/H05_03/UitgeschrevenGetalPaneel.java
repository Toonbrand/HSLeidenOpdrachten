package H05_03;

import javax.swing.*;
import java.awt.event.*;

public class UitgeschrevenGetalPaneel extends JPanel implements ActionListener
{
	private JTextField invoerVeld;
	private JButton berekenKnop;
	private JTextField uitkomstVeld;
	UitgeschrevenGetalBereken uitgeschrevenGetalBereken = new UitgeschrevenGetalBereken();
	
	public UitgeschrevenGetalPaneel()
	{
		invoerVeld = new JTextField("987654321", 20);
		uitkomstVeld = new JTextField("", 50);
		berekenKnop = new JButton("In woorden");
		berekenKnop.addActionListener(this);
		
		add (new JLabel("Geef een geheel getal:"));
		add (invoerVeld);
		add (berekenKnop);
		add (uitkomstVeld);
	}
	
	public void setInvoer()
	{
		uitgeschrevenGetalBereken.setInvoer(Integer.parseInt(invoerVeld.getText()));
	}
	
	public void actionPerformed(ActionEvent e)
	{
		setInvoer();
		uitkomstVeld.setText(uitgeschrevenGetalBereken.getUitvoer());
	}
}
