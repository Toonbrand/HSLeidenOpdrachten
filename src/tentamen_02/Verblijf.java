package tentamen_02;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JPanel;

public class Verblijf extends JPanel implements MouseListener
{
	protected Point positie;
	protected int breedte;
	protected int hoogte;
	protected String diersoort;
	protected ArrayList<Dier> dieren;
	protected Random generator = new Random();
	
	public Verblijf(Point positie, int breedte, int hoogte)
	{
		this.positie = positie;
		this.breedte = breedte;
		this.hoogte = hoogte;
		
		setLayout(null);
		addMouseListener(this);
		dieren = new ArrayList<Dier>();
		willekeurigDier();
	}
	
	public void willekeurigDier()
	{
		
		int willekeurig = generator.nextInt(12)+1;
		switch (willekeurig)
		{
		case 1: diersoort = "aap";break;
		case 2: diersoort = "kangeroo";break;
		case 3: diersoort = "kikker";break;
		case 4: diersoort = "koala";break;
		case 5: diersoort = "koe";break;
		case 6: diersoort = "krokodil";break;
		case 7: diersoort = "rat";break;
		case 8: diersoort = "schaap";break;
		case 9: diersoort = "struisvogel";break;
		case 10: diersoort = "varken";break;
		case 11: diersoort = "vogel";break;
		case 12: diersoort = "vogelbekdier";break;
		}
	}

	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) 
	{
		int xPos = e.getX();
		int yPos = e.getY();
		boolean geslacht = generator.nextBoolean();
		
		Dier dier;
		dier = new Dier(diersoort, 50, geslacht);
		dieren.add(dier);
		dier.setBounds(xPos, yPos, dier.getGrootte(), dier.getGrootte());
		add(dier);
		
		repaint();
	}
	public void mouseReleased(MouseEvent e) {}
}
