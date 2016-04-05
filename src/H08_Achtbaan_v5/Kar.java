package H08_Achtbaan_v5;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Kar extends JPanel
{
	private final static int MAX_PERSONEN = 8;
	private final static int MIN_LENGTE = 150;
	private final static int MAX_LENGTE = 203;
	private final static int MAX_GEWICHT = 800;
	
	private ArrayList<Persoon> personen;
	
	public Kar()
	{
		personen = new ArrayList<Persoon>();
		setLayout(null);
		setSize(100, 160);
	}
	
	public void paintComponent(Graphics g)
	{
		// Wielen
		g.fillOval(5, getHeight() - 20, 20, 20);
		g.fillOval(getWidth() - 25, getHeight() - 20, 20, 20);
		
		// Bak
		g.setColor(Color.RED);
		g.fillRect(0, getHeight() - 80, getWidth(), 60);
	}
	
	public void voegPersoonToe(Persoon persoon) throws KarException
	{
		if(persoon.getLengte() > MAX_LENGTE)
		{
			throw new KarException("Helaas, persoon " + persoon.getNaam() + " is te lang.");
		}
		
		if(persoon.getLengte() < MIN_LENGTE)
		{
			throw new KarException("Helaas, persoon " + persoon.getNaam() + " is te kort.");
		}
		
		if(personen.size() == MAX_PERSONEN)
		{
			throw new KarException("Helaas, het karretje is vol.");
		}
		
		if(isKarTeZwaar(persoon))
		{
			throw new KarException("Helaas, het karretje is te zwaar.");
		}
		
		persoon.setLocation(personen.size() * (persoon.getWidth() + 2), getHeight() - 80 - persoon.getHeight());
		
		personen.add(persoon);
		add(persoon);
		System.out.println("Persoon " + persoon.getNaam() + " zit nu in het karretje.");
	}
	
	public void verwijderPersoon(Persoon persoon)
	{
		personen.remove(persoon);
		System.out.println("Persoon " + persoon.getNaam() + " zit nu niet meer in het karretje.");
	}
	
	public void verwijderPersoon(int positie)
	{
		Persoon persoon = personen.get(positie);
		personen.remove(positie);
		System.out.println("Persoon " + persoon.getNaam() + " zit nu niet meer in het karretje.");
	}
	
	private boolean isKarTeZwaar(Persoon persoon)
	{
		int totaalGewicht = persoon.getGewicht();
		
		for(Persoon pers : personen)
		{
			totaalGewicht += pers.getGewicht();
		}
		
		if(totaalGewicht > MAX_GEWICHT)
		{
			return true;
		}
		
		return false;
	}
	
	public String toString()
	{
		String inhoud = "Kar met " + personen.size() + " personen.\n";
		
		for(Persoon persoon : personen)
		{
			inhoud += persoon.toString() + "\n";
		}
		
		return inhoud;
	}
}
