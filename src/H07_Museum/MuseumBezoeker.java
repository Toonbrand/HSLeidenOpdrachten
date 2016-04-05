package H07_Museum;

/**
 * De museumbezoeker klasse
 * @author Toon
 * @version 1.0
 */
public class MuseumBezoeker 
{
	private String kaartNummer;
	private int aankomstUur, aankomstMinuten;
	
	/**
	 * De museumbezoeker klasse
	 * @param kaartNummer
	 * @param aankomstUur
	 * @param aankomstMinuten
	 */
	public MuseumBezoeker(String kaartNummer, int aankomstUur, int aankomstMinuten)
	{
		this.kaartNummer = kaartNummer;
		this.aankomstMinuten = aankomstMinuten;
		this.aankomstUur = aankomstUur;
	}
	
	/**
	 * Berekend de tijd dat bezoekers aanwezig waren
	 * @param vertrekUur
	 * @param vertrekMinuten
	 * @return
	 */
	public int berekenAanwezigheid(int vertrekUur, int vertrekMinuten)
	{
		int aankomst = (aankomstUur * 60) + aankomstMinuten;
		int vertrek = (vertrekUur * 60) + vertrekMinuten;
		int aanwezigheidsTijd = vertrek - aankomst;	
		return aanwezigheidsTijd;
	}
	
	/**
	 * Geeft het kaartnummer van de klant terug
	 * @return
	 */
	public String getKaartNummer()
	{
		return kaartNummer;
	}
}
