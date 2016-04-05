package H06_SterrenHemel;

import java.awt.Color;

/**
 * De rode ster
 * @author Toon
 * @version 1.0
 */
public class RodeSter extends Ster
{
	private int rood = 255, groen = 255, blauw = 0;

	public RodeSter(int x, int y, int grootte, Color kleur) 
	{
		super(x, y, grootte, kleur);
	}

	/**
	 * Zorgt ervoor dat de ster van kleur veranderd
	 */
	public void evolueer()
	{
		this.kleur = new Color(rood, groen, blauw);
		if (groen - 25 > 1)
		{
			groen = groen - 15;
		}
		
	}
}
