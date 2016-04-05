package H09_MagicBubble;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * Paneel waarop de bubbels komen
 * @author Toon
 * @version 1.0
 */
public class BubblePaneel extends JPanel implements ActionListener, MouseListener
{
	/**
	 * De lijst met bubbels
	 */
	private ArrayList<MagicBubble> bubbels;
	private Timer timer;
	Random generator = new Random();
	
	/**
	 * Het bubblepaneel
	 */
	public BubblePaneel()
	{
		
		setLayout(null);
		addMouseListener(this);
		timer = new Timer(20, this);
		timer.start();
		
		bubbels = new ArrayList<MagicBubble>();
		
		for(int i = 0; i < 50; i++)
		{
			int straal = 20;
			Color kleur = new Color(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255));
			Point middelpunt = new Point();
			int xPos = generator.nextInt(950-straal)+straal;
			int yPos = generator.nextInt(740-straal)+straal;
			int dx = generator.nextInt(3)-1;
			int dy = generator.nextInt(3)-1;
			int status = 1;
			if(dx == 0 && dy ==0) //als de bubble stilstaat
			{
				dx++; //moet ik nog wat beters op verzinnen eigenlijk
			}
			middelpunt.setLocation(xPos,yPos);
			MagicBubble bubbel = new MagicBubble(kleur, middelpunt, straal, dx, dy, status);
			bubbels.add(bubbel);			
			add(bubbel);
		}
		repaint();
	}
	
	/**
	 * Zorgt ervoor dat het scherm leeggemaakt word voordat er iets nieuws getekend wordt
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		repaint();
	}

	/**
	 * Roept de bubbels aan elke 20 miliseconden te bewegen
	 */
	public void actionPerformed(ActionEvent e) 
	{
		for (int i = 0; i < bubbels.size(); i++)
		{
			bubbels.get(i).animeer();
			bubbels.get(i).setBounds(bubbels.get(i).getMiddelpunt().x - bubbels.get(i).getStraal(), bubbels.get(i).getMiddelpunt().y - bubbels.get(i).getStraal(),bubbels.get(i).getStraal()*2,bubbels.get(i).getStraal()*2);
			if(bubbels.get(i).getStatus() == 4)
			{
				bubbels.get(i).setStraal(0);
				bubbels.remove(i);
			}
		}
	}

	
	public void mouseClicked(MouseEvent arg0) {}
	public void mouseEntered(MouseEvent arg0) {}
	public void mouseExited(MouseEvent arg0) {}
	/**
	 * Tekend een exploderende bubbel als er geklikt word
	 */
	public void mousePressed(MouseEvent e) 
	{
		CollisionChecker checker = new CollisionChecker(bubbels);
		int straal = 20;
		Color kleur = Color.BLACK;
		Point middelpunt = new Point();
		int xPos = e.getX();
		int yPos = e.getY();
		middelpunt.setLocation(xPos,yPos);
		checker.start();
		MagicBubble bubbel = new MagicBubble(kleur, middelpunt, straal, 0, 0, 2);
		bubbel.setBounds(bubbel.getMiddelpunt().x, bubbel.getMiddelpunt().y, bubbel.getStraal()*2, bubbel.getStraal()*2);
		bubbels.add(bubbel);
		add(bubbel);
	}
	public void mouseReleased(MouseEvent arg0) {}
}
