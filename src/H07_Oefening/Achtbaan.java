package H07_Oefening;

import java.awt.*;
import java.util.*;
import javax.swing.*;

public class Achtbaan extends JPanel
{
	private final static int MAX_KARREN = 5;
	
	private ArrayList <Kar> karren;
	private ImageIcon achtergrond;
	
	public Achtbaan()
	{
		setLayout(null);
		karren = new ArrayList<Kar>();
		
		achtergrond = new ImageIcon(Achtbaan.class.getResource("/H07_Afbeeldingen/Grasveld.jpg"));
	}
	
	public void paintComponent(Graphics g)
	{
		g.drawImage(achtergrond.getImage(), 0, 0, getWidth(), getHeight(), this);
		g.setColor(Color.GRAY);
		g.fillRect(0, getHeight() - 20, getWidth(), 10);
	}
	
	public void voegKarToe(Kar kar) throws AchtbaanException
	{
		if(karren.size() == MAX_KARREN)
		{
			throw new AchtbaanException("Er kan geen kar meer bij!");
		}
		kar.setLocation(karren.size() * (kar.getWidth()+1) +10,getHeight()- 20 - kar.getHeight());
		
		karren.add(kar);
		
		add(kar);
		System.out.println("…Èn kar toegevoegd");
	}
	
	public void verwijderKar(Kar kar)
	{
		karren.remove(kar);
		remove(kar);
		System.out.println("…Èn kar verwijderd");
	}
	
	public void verwijderKar (int positie)
	{
		karren.remove(positie);
		System.out.println("…Èn kar verwijderd");
	}
	
	public String toString()
	{
		String inhoud = "-----------------------------------------------------------------------------\n";
		inhoud += "Er rijden " + karren.size() + " karren op de baan. \n";
		
		for(Kar kar : karren)
		{
			inhoud += kar.toString() + "\n";
		}
		
		return inhoud;
	}
}
