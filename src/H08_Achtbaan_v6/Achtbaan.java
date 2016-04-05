package H08_Achtbaan_v6;

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
		
		achtergrond = new ImageIcon(Achtbaan.class.getResource("/plaatjes/achtbaan.jpg"));
	}
	
	public void paintComponent(Graphics g)
	{
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
