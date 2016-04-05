package H08_Adventure;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.*;

/**
 * Paneel waarop de spelelementen komen
 * @author Toon
 * @version 1.0
 */
public class LevelPaneel extends JPanel implements MouseListener, MouseMotionListener
{
	/**
	 * De lijst met spelelementen
	 */
	private ArrayList <SpelElement> spelElementen;
	private int xPos, yPos;
	private ImageIcon achtergrond, heldAfbeelding, monsterAfbeelding, muurAfbeelding, boomAfbeelding;
	private JFrame venster;

	/**
	 * Maakt het levelpaneel
	 */
	public LevelPaneel()
	{
		setLayout(null);
		addMouseListener(this);
		setFocusable(false);
		spelElementen = new ArrayList <SpelElement>();
		
		//Kan ook in een lijst en met een for loop worden gemaakt
		achtergrond = new ImageIcon(LevelPaneel.class.getResource("/H08_Afbeeldingen/Grasveld.jpg"));
		heldAfbeelding = new ImageIcon(LevelPaneel.class.getResource("/H08_Afbeeldingen/Held.png"));
		monsterAfbeelding = new ImageIcon(LevelPaneel.class.getResource("/H08_Afbeeldingen/Monster.png"));
		muurAfbeelding = new ImageIcon(LevelPaneel.class.getResource("/H08_Afbeeldingen/Muur.png"));
		boomAfbeelding = new ImageIcon(LevelPaneel.class.getResource("/H08_Afbeeldingen/Boom.png"));
	}
	
	public void opslaan()
	{
		adventureOpslaan();
	}
	
	public void laden()
	{
		spelElementen = adventureLaden();
		repaint();
	}
	
	private String getBestandsLaadLocatie()
	{
		FileDialog fileDialog = new FileDialog(venster, "Opslaan die zooi", FileDialog.LOAD);
		fileDialog.setVisible(true);
		
		String filename = fileDialog.getFile();
		String directory = fileDialog.getDirectory();
		
		if(filename == null)
		{
			System.err.println("Waarom druk je op annuleren dan?");
			return null;
		}
		
		return directory + filename;
	}
	
	private String getBestandsBewaarLocatie()
	{
		FileDialog fileDialog = new FileDialog(venster, "Opslaan die zooi", FileDialog.SAVE);
		fileDialog.setVisible(true);
		
		String filename = fileDialog.getFile();
		String directory = fileDialog.getDirectory();
		
		if(filename == null)
		{
			System.err.println("Waarom druk je op annuleren dan?");
			return null;
		}
		
		return directory + filename;
	}
	
	public void adventureOpslaan()
	{
		try
		{
			String locatie = getBestandsBewaarLocatie();
			
			if(locatie == null)
			{
				return;
			}
			
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(locatie));
			writer.writeObject(spelElementen);
		}
		catch(IOException e)
		{
			System.err.println("Schrijffout: " + e.getMessage());
		}
	}
	
	public ArrayList<SpelElement> adventureLaden()
	{
		try
		{
			String locatie = getBestandsLaadLocatie();
			
			if(locatie == null)
			{
				return (ArrayList<SpelElement>) spelElementen;
			}
			
			ObjectInputStream reader = new ObjectInputStream(new FileInputStream(locatie));
			ArrayList<SpelElement> spelElementen = (ArrayList<SpelElement>) reader.readObject();
			reader.close();
			
			return (ArrayList<SpelElement>) spelElementen; 
		}
		
		catch(ClassNotFoundException e)
		{
			System.err.println("Klasse niet gevonden.");
		}
		
		catch(IOException e)
		{
			System.err.println("Fout tijdens laden: " + e.getMessage());
		}
		
		return (ArrayList<SpelElement>) spelElementen;
	}
	
	/**
	 * Reageert als er op een muisknop geklikt word
	 */
	public void mouseClicked(MouseEvent e) 
	{
		if(e.getButton() == e.BUTTON1)
		{
			SpelElement boom;
			boom = new SpelElement(e.getX(),e.getY(),100,100, Color.GREEN, boomAfbeelding);
			spelElementen.add(boom);
			boom.setBounds(boom.getxPos(),boom.getyPos(),boom.getBreedte(),boom.getHoogte());
			add(boom);
			
			repaint();
		}
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	/**
	 * Reageert als de muisknop losgelaten word
	 */
	public void mouseReleased(MouseEvent e) 
	{
		int breedte = e.getX() - xPos;
		int hoogte = e.getY() - yPos;
		
			if(e.getButton() == e.BUTTON1 && breedte != 0)
			{
				SpelElement muur;
				muur = new SpelElement(xPos,yPos,breedte,hoogte, Color.GRAY, muurAfbeelding);
				spelElementen.add(muur);
				muur.setBounds(muur.getxPos(),muur.getyPos(),muur.getBreedte(),muur.getHoogte());
				add(muur);
			}
			
		repaint();
	}
	
	/**
	 * Reageert als een muisknop ingedrukt word
	 */
	public void mousePressed(MouseEvent e) 
	{
		xPos = e.getX();
		yPos = e.getY();
		
		if(e.getButton() == e.BUTTON2)
		{
			Monster monster;
			monster = new Monster(e.getX(), e.getY(), 50, 100, Color.RED, monsterAfbeelding);
			spelElementen.add(monster);
			monster.setBounds(monster.getxPos(),monster.getyPos(),monster.getBreedte(),monster.getHoogte());
			add(monster);
			
			repaint();
		}
		
		else if(e.getButton() == e.BUTTON3)
		{
			Held held;
			held = new Held(e.getX(), e.getY(), 50, 100, Color.BLUE, heldAfbeelding);
			spelElementen.add(held);
			held.setBounds(held.getxPos(),held.getyPos(),held.getBreedte(),held.getHoogte());
			add(held);
			repaint();
			held.requestFocus();
		}
	}
	
	/**
	 * De tekenmethode die telkens het scherm weer leegmaakt voordat er opnieuw word getekend
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);	
		g.drawImage(achtergrond.getImage(), 0, 0, getWidth(), getHeight(), this);
	}

	public void mouseDragged(MouseEvent e) {}
	public void mouseMoved(MouseEvent e) {}
}
