package H01_04;

import javax.swing.*;
import java.awt.event.*;

public class KopieerPaneel extends JPanel implements ActionListener
{
	private JTextArea veld1;
	private JTextArea veld2;
	private JButton actieknop;
	
	public KopieerPaneel()
	{
		actieknop = new JButton(">Kopieer>");
		actieknop.addActionListener(this);
		veld1 = new JTextArea(3,40); /*Het tekstvlak krijgt de breedte van 13 keer de letter "M" */
		veld2 = new JTextArea(3,40);
		add(veld1);
		add(actieknop);
		add(veld2);
		veld1.setToolTipText("Vul hier tekst in");
		veld2.setToolTipText("Hier komt de gekopieerde tekst");
		actieknop.setToolTipText("Klik hier om de tekst te kopieren");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String veldinhoud1 = veld1.getText();
		veld2.setText(veldinhoud1);
	}
}
