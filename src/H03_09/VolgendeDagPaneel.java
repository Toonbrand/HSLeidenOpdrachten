package H03_09;

import java.awt.event.*;
import javax.swing.*;

public class VolgendeDagPaneel extends JPanel implements ActionListener
{
	private JTextField dagVeld, maandVeld, jaarVeld;
	private JButton berekenKnop;
	private JTextField resultaatVeld;
	
	public VolgendeDagPaneel()
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
		
		resultaatVeld = new JTextField(23);
		add(resultaatVeld);
	}
	
	public String maakResultaattekst(int dag, int maand, int jaar)
	{
		if (bestaanbareDatum(dag, maand, jaar))
		{
		String resultaat = "De dag na " + dag + "-" + maand + "-" + jaar + " is ";
		dag++;
		if(dag>aantalDagenInMaand(maand,jaar))
		{
			dag = 1;
			maand++;
			if ( maand >12)
			{
				maand=1;
				jaar++;
			}
		}
		return resultaat + dag + "-" + maand + "-" + jaar;
		}
		else
		{
			return "Ongeldige datum";
		}
	}
	
	public int aantalDagenInMaand(int maand, int jaar)
	{
		final int APRIL=4, JUNI=6, SEPTEMBER=9, NOVEMBER=11, FEBRUARI=2;
		int aantalDagen = 31;
		if (maand == APRIL || maand == JUNI || maand == SEPTEMBER || maand == NOVEMBER)
		{
			aantalDagen=30;
		}
		else if (maand == FEBRUARI)
		{
			aantalDagen = 28;
			if (isSchrikkeljaar(jaar))
			{
				aantalDagen = 29;
			}
		}
		return aantalDagen;
	}
	
	public boolean isSchrikkeljaar(int jaartal)
	{
		return((jaartal % 4 == 0) && (jaartal % 100 != 0)) || (jaartal % 400 == 0);
	}
	
	public boolean bestaanbareDatum(int dag, int maand, int jaar)
	{
		return (
				(jaar > 1582) && //Jaar is na 1582
				(dag <= aantalDagenInMaand(maand, jaar)) && //Aantal dagen is niet meer dan mag in die maand
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
