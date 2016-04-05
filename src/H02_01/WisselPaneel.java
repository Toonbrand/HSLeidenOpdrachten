package H02_01;

import javax.swing.*;
import java.awt.event.*;

public class WisselPaneel extends JPanel implements ActionListener
{
	private JTextArea veld1;
	private JTextArea veld2;
	private JButton actieKnop;
	
	public WisselPaneel()
	{
		actieKnop = new JButton("Wissel");
		actieKnop.addActionListener(this);
		veld1 = new JTextArea("Tekst1", 3,40); /*Het tekstvlak krijgt de breedte van 13 keer de letter "M" */
		veld2 = new JTextArea("Tekst2", 3,40);
		add(veld1);
		add(actieKnop);
		add(veld2);
		veld1.setToolTipText("Vul hier tekst in");
		veld2.setToolTipText("Hier komt de gekopieerde tekst");
		actieKnop.setToolTipText("Klik hier om de tekst te kopieren");
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String veldInhoud1 = veld1.getText();
		String veldInhoud2 = veld2.getText();
		veld1.setText(veldInhoud2);
		veld2.setText(veldInhoud1);
	}
}
