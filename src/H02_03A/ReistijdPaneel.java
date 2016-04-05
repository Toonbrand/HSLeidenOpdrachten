package H02_03A;

import javax.swing.*;
import java.awt.event.*;

public class ReistijdPaneel extends JPanel implements ActionListener
{
	private JTextField beginUrenVeld;
	private JTextField beginMinutenVeld;
	private JTextField tijdsDuurMinutenVeld;
	private JButton berekenKnop;
	private JTextArea uitkomstVeld;
	
	public ReistijdPaneel()
	{
		beginUrenVeld = new JTextField("16", 2);
		beginMinutenVeld = new JTextField("05", 2);
		tijdsDuurMinutenVeld = new JTextField("70", 8);
		berekenKnop = new JButton("Bereken eindtijd");
		berekenKnop.addActionListener(this);
		uitkomstVeld = new JTextArea(5,20);
		
		add (new JLabel("Begintijd Uren"));
		add (beginUrenVeld);
		add (beginMinutenVeld);
		add (new JLabel("Minuten"));
		add (new JLabel("Tijdsduur in minuten"));
		add (tijdsDuurMinutenVeld);
		add (berekenKnop);
		add (uitkomstVeld);
	}
	
	public void toonResultaat(int beginUren , int beginMinuten, int minuten)
	{
		int aantalMinuten = (beginMinuten + minuten);
		int urenErbij = (aantalMinuten / 60);
		int totaalUren = ((beginUren + urenErbij) % 24);
		int totaalMinuten = (aantalMinuten % 60);
		
		
		String resultaat = "De eindtijd is: " + totaalUren + " uren en " + totaalMinuten + " minuten";
		uitkomstVeld.setText(resultaat);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int beginUren = Integer.parseInt(beginUrenVeld.getText());
		int beginMinuten = Integer.parseInt(beginMinutenVeld.getText());
		int minuten = Integer.parseInt(tijdsDuurMinutenVeld.getText());
		toonResultaat(beginUren, beginMinuten, minuten);
	}
}
