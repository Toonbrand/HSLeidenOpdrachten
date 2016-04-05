package H01_0A;

import javax.swing.*;
import java.awt.event.*;

public class WachtrijPaneel extends JPanel implements ActionListener
{
	private JTextField invoerVeld;
	private JTextField veld1;
	private JTextField veld2;
	private JTextField veld3;
	private JButton actieknop;
	private JTextArea namenVeld;
	
	public WachtrijPaneel()
	{
		actieknop = new JButton("Schuif op");
		actieknop.addActionListener(this);
		invoerVeld = new JTextField(13);
		veld1 = new JTextField("Toon", 13); /*Het tekstvlak krijgt de breedte van 13 keer de letter "M" */
		veld2 = new JTextField("Henk", 13);
		veld3 = new JTextField("Jan", 13);
		namenVeld = new JTextArea(5,13);
		JScrollPane schuifgebied = new JScrollPane(namenVeld);
		namenVeld.setLineWrap(true);
		namenVeld.setWrapStyleWord(true);
		add(invoerVeld);
		add(actieknop);
		add(veld1);
		add(veld2);
		add(veld3);
		this.add(schuifgebied);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String veldinhoud0 = invoerVeld.getText();
		String veldinhoud1 = veld1.getText();
		String veldinhoud2 = veld2.getText();
		String veldinhoud3 = veld3.getText();
		String veldinhoud4 = namenVeld.getText();
		invoerVeld.setText("");
		veld1.setText(veldinhoud0);
		veld2.setText(veldinhoud1);
		veld3.setText(veldinhoud2);
		namenVeld.setText(veldinhoud3 + "\n" + veldinhoud4);
	}
}
