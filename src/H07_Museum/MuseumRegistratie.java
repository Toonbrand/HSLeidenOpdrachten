package H07_Museum;

import java.util.*;

/**
 * De klasse die de bezoekers registreerd
 * @author Toon
 * @version 1.0
 */
public class MuseumRegistratie 
{
	private int gesommeerdeTijd, gesommeerdeBezoekers;
	
	/**
	 * De lijst met museumbezokers
	 */
	private ArrayList <MuseumBezoeker> bezoekers;
	
	/**
	 * De museumregistratie
	 */
	public MuseumRegistratie()
	{
		bezoekers = new ArrayList<MuseumBezoeker>();
	}
	
	/**
	 * Checkt de bezoekers in
	 * @param kaartNummer
	 * @param aankomstUur
	 * @param aankomstMinuten
	 */
	public void checkIn(String kaartNummer, int aankomstUur, int aankomstMinuten)
	{
		MuseumBezoeker bezoeker = new MuseumBezoeker(kaartNummer, aankomstUur, aankomstMinuten);
		bezoekers.add(bezoeker);
		System.out.println("Bezoeker binnen");
	}
	
	/**
	 * Checkt de bezoekers uit
	 * @param kaartNummer
	 * @param vertrekUur
	 * @param vertrekMinuten
	 */
	public void checkOut(String kaartNummer, int vertrekUur, int vertrekMinuten)
	{
		for( int i = 0; i < bezoekers.size(); i++)
		{
			if(kaartNummer.equals(bezoekers.get(i).getKaartNummer()))
			{
				gesommeerdeTijd = gesommeerdeTijd + bezoekers.get(i).berekenAanwezigheid(vertrekUur, vertrekMinuten);				
				bezoekers.remove(i);
				gesommeerdeBezoekers ++;
				System.out.println("Bezoeker vertrokken");
			}
		}
	}
	
	/**
	 * Telt het aantal bezoekers en returnd dat
	 * @return
	 */
	public int getAantalAanwezigen()
	{
		return bezoekers.size();
	}
	
	/**
	 * Sluit het museum
	 */
	public void sluitRegistratie()
	{
		if (bezoekers.size() == 0)
		{
			int gemiddelde = gesommeerdeTijd/gesommeerdeBezoekers;
			System.out.println("Museum gesloten, gemiddelde bezoekerstijd: " + gemiddelde + " minuten.");
		}
		else
		{
			System.out.println("Er zijn nog " + bezoekers.size() + " bezoekers in het museum");
		}
	}
}
