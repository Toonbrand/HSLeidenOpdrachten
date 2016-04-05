package H08_Achtbaan_Toon;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Achtbaan extends JPanel
{
	private final static int MAX_KARREN = 5;
	
	private ArrayList<Kar> karren;
	private ImageIcon achtergrond;
	
	public Achtbaan()
	{
		setLayout(null);
		karren = new ArrayList<Kar>();
		
		achtergrond = new ImageIcon(Achtbaan.class.getResource("/H08_Afbeeldingen/Grasveld.jpg"));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		g.drawImage(achtergrond.getImage(), 0, 0, getWidth(), getHeight(), this);
		g.fillRect(0, getHeight() - 20, getWidth(), 10);
	}
	
	public void voegKarToe(Kar kar) throws AchtbaanException
	{
		if(karren.size() == MAX_KARREN)
		{
			throw new AchtbaanException("Er kan geen kar meer bij!");
		}
		
		kar.setLocation(karren.size() * (kar.getWidth() + 10) + 10, getHeight() - 20 - kar.getHeight());
		
		karren.add(kar);
		
		add(kar);
		kar.starten();
		System.out.println("Weer een kar er bij.");
	}
	
	public void verwijderKar(Kar kar)
	{
		karren.remove(kar);
		remove(kar);
		System.out.println("Weer een kar minder.");
	}
	
	public void verwijderKar(int positie)
	{
		karren.remove(positie);
		System.out.println("Weer een kar minder.");
	}
	
	public void setSnelheid(int wachtTijd)
	{
		
		if(wachtTijd <= 0)
		{
			System.err.println("De snelheid moet groter zijn dan 0");
			return;
		}
		for(Kar kar : karren)
		{
			kar.setWachtTijd(wachtTijd);
		}
	}
	
	public void snelheidVerhogen()
	{
		for(Kar kar : karren)
		{
			int wachtTijd = kar.getWachtTijd();
			if(wachtTijd >= 20)
			{
				kar.setWachtTijd(wachtTijd - 10);
			}
		}
	}
	
	public void snelheidVerlagen()
	{
		for(Kar kar : karren)
		{
			int wachtTijd = kar.getWachtTijd();
			kar.setWachtTijd(wachtTijd + 10);
		}
	}
	
	public String toString()
	{
		String inhoud = "--------------------------------------------------------------\n";
		inhoud += "Er rijden " + karren.size() + " karren op de baan.\n";
		
		for(Kar kar : karren)
		{
			inhoud += kar.toString() + "\n";
		}
		
		return inhoud;
	}
}
