package H02_01A;

import javax.swing.*;
import java.awt.event.*;

public class Wissel2Paneel extends JPanel implements ActionListener
{
	private JTextArea veld1;
	private JTextArea veld2;
	private JTextArea veld3;
	private JButton actieKnop;
	
	public Wissel2Paneel()
	{
		actieKnop = new JButton("Wissel");
		actieKnop.addActionListener(this);
		veld1 = new JTextArea("Tekst1", 3,12); /*Het tekstvlak krijgt de breedte van 13 keer de letter "M" */
		veld2 = new JTextArea("Tekst2", 3,12);
		veld3 = new JTextArea("Tekst3", 3,12);
		add(veld1);
		add(veld2);
		add(veld3);
		add(actieKnop);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String veldInhoud1 = veld1.getText();
		String veldInhoud2 = veld2.getText();
		String veldInhoud3 = veld3.getText();
		veld1.setText(veldInhoud3);
		veld2.setText(veldInhoud1);
		veld3.setText(veldInhoud2);
	}
}
