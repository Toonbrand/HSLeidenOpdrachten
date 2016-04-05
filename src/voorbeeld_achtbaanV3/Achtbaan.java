package voorbeeld_achtbaanV3;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Achtbaan extends JPanel
{
	private final static int MAX_KARREN = 5;
	
	private ArrayList<Kar> karren;
	
	public Achtbaan()
	{
		setLayout(null);
		karren = new ArrayList<Kar>();
	}
	
	public void paintComponent(Graphics g)
	{
		g.fillRect(0, getHeight() - 20, getWidth(), 10);
	}
	
	public void voegKarToe(Kar kar)
	{
		if(karren.size() < MAX_KARREN)
		{
			kar.setLocation(karren.size() * (kar.getWidth() + 10) + 10, getHeight() - 20 - kar.getHeight());
			
			karren.add(kar);
			
			add(kar);
			System.out.println("Weer een kar er bij.");
		}
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
