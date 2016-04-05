package H04_01;

import java.awt.event.*;

import javax.swing.*;

public class VolgendeDag2Paneel extends JPanel implements ActionListener
{
	private JTextField dagVeld;
	private JTextField maandVeld;
	private JTextField jaarVeld;
	private JButton berekenKnop;
	private JTextArea resultaatVeld;
	
	public VolgendeDag2Paneel()
	{
		add(new JLabel("Dag"));
		dagVeld = new JTextField("14",2);
		dagVeld.addActionListener(this);
		add(dagVeld);
		
		add(new JLabel("Maand"));
		maandVeld = new JTextField("9",2);
		maandVeld.addActionListener(this);
		add(maandVeld);
		
		add(new JLabel("Jaar"));
		jaarVeld = new JTextField("2009", 4);
		jaarVeld.addActionListener(this);
		add(jaarVeld);
		
		berekenKnop = new JButton("Volgende dag");
		berekenKnop.addActionListener(this);
		add(berekenKnop);
		
		resultaatVeld = new JTextArea(7,25);
		add(resultaatVeld);
	}
	
	public String maakResultaattekst(int dag, int maand, int jaar)
	{
		Kalendergegevens kalendervraagbaak = new Kalendergegevens();
		if (bestaanbareDatum(dag, maand, jaar))
		{
		String resultaat = "De dag na \n" + kalendervraagbaak.getDagVanDeWeek(dag, maand, jaar) + " " + dag + "-" + maand + "-" + jaar + "\nis \n";
		dag++;
		if(dag>kalendervraagbaak.getAantalDagenInMaand(maand,jaar))
		{
			dag = 1;
			maand++;
			if ( maand >12)
			{
				maand=1;
				jaar++;
			}
		}
		return resultaat + kalendervraagbaak.getDagVanDeWeek(dag, maand, jaar) + " " + dag + "-" + maand + "-" + jaar;
		}
		else
		{
			return "Ongeldige datum";
		}
	}
		
	public boolean bestaanbareDatum(int dag, int maand, int jaar)
	{
		Kalendergegevens kalendervraagbaak = new Kalendergegevens();
		return (
				(jaar > 1582) && //Jaar is na 1582
				(dag <= kalendervraagbaak.getAantalDagenInMaand(maand,jaar)) && //Aantal dagen is niet meer dan mag in die maand
				(dag >= 1) && //Dag is hoger dan 0
				(maand >= 1) && //Maand is hoger dan 0
				(maand <= 12)); //Maand is maximaal 12
	}
	
	public void actionPerformed(ActionEvent e)
	{
		int invoerdag = Integer.parseInt(dagVeld.getText());
		int invoerMaand = Integer.parseInt(maandVeld.getText());
		int invoerJaar = Integer.parseInt(jaarVeld.getText());
		String resultaat = maakResultaattekst(invoerdag, invoerMaand, invoerJaar);
		resultaatVeld.setText(resultaat);
	}
}
