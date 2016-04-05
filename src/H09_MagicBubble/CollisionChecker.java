package H09_MagicBubble;

import java.awt.Point;
import java.util.ArrayList;

/**
 * De CollisionChecker
 * @author Toon
 * @version 1.0
 */
public class CollisionChecker extends Thread
{
	private ArrayList<MagicBubble> bubbels;
	private Thread thread;
	
	/**
	 * De ColisionChecker
	 * @param bubbels
	 */
	public CollisionChecker(ArrayList<MagicBubble> bubbels)
	{
		this.bubbels = bubbels;
	}
	
	/**
	 * De berekening die controleerd of de ene bubbel de andere raakt
	 * @param boom
	 * @param bubble
	 * @return
	 */
	private boolean collision( MagicBubble boom, MagicBubble bubble )
	{
		Point m1 = boom.getMiddelpunt();
		int r1 = boom.getStraal();
		Point m2 = bubble.getMiddelpunt();
		int r2 = bubble.getStraal();
	
		return (( Math.pow(m1.x - m2.x, 2) + Math.pow(m1.y - m2.y, 2)) < Math.pow(r1 + r2, 2));      
	}
	
	/**
	 * Zorgt dat de volgende bubbel ontploft als de boolen collision true is
	 */
	public void run()
	{
		while(true)
		{
		for(int i = 0; i < bubbels.size(); i++)
		{
			MagicBubble boom = bubbels.get(i);

			if(boom.getStatus() == 2)
			{
				for(int x = 0; x < bubbels.size(); x++)
				{
					MagicBubble bubble = bubbels.get(x);
					if(collision(boom, bubble) == true && bubble.getStatus() == 1)
					{
						bubble.setStatus(2);	
					}
							
				}
			}			
		}
		}
	}
	
	/**
	 * Zorgt dat de CollisionChecker begint met controleren
	 */
	public void Start()
	{
		thread = new Thread(this);
		thread.start();
	}
	
	/**
	 * Geeft de CollisionChecker een kleine pause
	 */
	public void Wacht()
	{
		try 
		{
			Thread.sleep(50);
		} 
		catch (InterruptedException e) 
		{
			System.err.println("Er is iets foutgegaan in de Collision Checker");
		}
	}
}
