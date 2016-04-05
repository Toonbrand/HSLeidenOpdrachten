package H06_Oefening;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class Muis extends MouseAdapter
{
	private Paneel paneel;
	
	public Muis(Paneel paneel)
	{
		this.paneel = paneel;
	}
	
	public void mouseClicked(MouseEvent e) 
	{
		if (e.getButton() == MouseEvent.BUTTON1)
			{
				paneel.randomAchtergrond();
			}
	}
	
	public void mouseWheelMoved(MouseWheelEvent e)
	{
		paneel.randomAchtergrond();
	}
}
