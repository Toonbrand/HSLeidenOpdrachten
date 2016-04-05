package H07_Museum;

import java.awt.event.*;
import javax.swing.*;

/**
 * Paneel waarop de knoppen en velden komen
 * @author Toon
 * @version 1.0
 */
public class MuseumPaneel extends JPanel implements ActionListener
{
	private JButton KomtBinnenKnop, VertrektKnop, AantalAanwezigKnop, SluitingKnop;
	private JTextField KaartNummerVeld, UrenVeld, MinutenVeld;
	private MuseumRegistratie museumRegistratie;
	
	/**
	 * Maakt het paneel aan
	 */
	public MuseumPaneel()
	{
		museumRegistratie = new MuseumRegistratie();
		KaartNummerVeld = new JTextField("", 30);
		UrenVeld = new JTextField("", 2);
		MinutenVeld = new JTextField("",2);
		KomtBinnenKnop = new JButton("Komt Binnen");
		KomtBinnenKnop.addActionListener(this);
		VertrektKnop = new JButton("Vertrekt");
		VertrektKnop.addActionListener(this);
		AantalAanwezigKnop = new JButton("Aantal aanwezig");
		AantalAanwezigKnop.addActionListener(this);
		SluitingKnop = new JButton("Sluiting");
		SluitingKnop.addActionListener(this);
		
		add(new JLabel("Kaartnummer"));
		add(KaartNummerVeld);
		add(new JLabel("Tijdstip van aankomst of vertrek"));
		add(UrenVeld);
		add(new JLabel("uur en"));
		add(MinutenVeld);
		add(new JLabel("minuten"));
		add(KomtBinnenKnop);
		add(VertrektKnop);
		add(AantalAanwezigKnop);
		add(SluitingKnop);		
	}

	/**
	 * Zorgt ervoor dat de knoppen wat doen
	 */
	public void actionPerformed(ActionEvent e) 
	{
		int uur = Integer.parseInt(UrenVeld.getText());
		int minuut = Integer.parseInt(MinutenVeld.getText());
		String kaartNummer = KaartNummerVeld.getText();
		
		if (e.getSource() == KomtBinnenKnop)
		{
			museumRegistratie.checkIn(kaartNummer, uur, minuut);
		}
		
		if (e.getSource() == VertrektKnop)
		{
			museumRegistratie.checkOut(kaartNummer, uur, minuut);
		}
		
		if (e.getSource() == AantalAanwezigKnop)
		{
			System.out.println("Er zijn op dit moment " + museumRegistratie.getAantalAanwezigen() + " bezoekers aanwezig.");
		}
		
		if (e.getSource() == SluitingKnop)
		{
			museumRegistratie.sluitRegistratie();
		}
	}
}
