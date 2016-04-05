package H02_V01;

import javax.swing.*;
import java.awt.event.*;

public class EtikettenPaneel extends JPanel implements ActionListener
{
	private JTextField aantalEtikettenVeld;
	private JTextField etikettenPerBladVeld;
	private JButton berekenKnop;
	private JTextArea resultaatveld;

	public EtikettenPaneel()
	{
		berekenKnop = new JButton("Bereken resultaat");
		berekenKnop.addActionListener(this);
		aantalEtikettenVeld = new JTextField("100", 5);
		etikettenPerBladVeld = new JTextField("24", 5);
		resultaatveld = new JTextArea(6,25);
		
		add(new JLabel("aantal etiketten dat u wilt afdrukken"));
		add(aantalEtikettenVeld);
		add(new JLabel("Aantal etiketten op een blad"));
		add(etikettenPerBladVeld);
		add(berekenKnop);
		add(resultaatveld);
	}
	public void toonResultaat(int aantalEtiketten, int etikettenPerBlad)
	{
		int vellenNodig = ((aantalEtiketten - 1) / etikettenPerBlad) +1;
		int over = vellenNodig * etikettenPerBlad - aantalEtiketten;
		String resultaat = "Aantal vellen nodig:  " + vellenNodig + "\n" + "Aantal etiketten onbedrukt: " + over;
		resultaatveld.setText(resultaat);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int aantalEtiketten = Integer.parseInt(aantalEtikettenVeld.getText());
		int etikettenPerBlad = Integer.parseInt(etikettenPerBladVeld.getText());
		toonResultaat(aantalEtiketten, etikettenPerBlad);
	}
}
