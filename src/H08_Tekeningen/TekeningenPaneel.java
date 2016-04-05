package H08_Tekeningen;

import java.awt.*;
import java.awt.event.*;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import javax.swing.*;

/**
 * Paneel waarop de tekening komt
 * @author Toon
 * @version 1.0
 */
public class TekeningenPaneel extends JPanel implements MouseListener, MouseMotionListener, KeyListener
{
	/**
	 * De lijst met tekeningen
	 */
	private ArrayList <Tekening> tekeningen;
	private Tekening huidigeTekening;
	private JFrame venster;
	Random generator = new Random();
	
	/**
	 * Het tekeingenpaneel
	 */
	public TekeningenPaneel()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
		addKeyListener(this);
		
		setFocusable( true );
		requestFocus( true );
		
		tekeningen = new ArrayList<Tekening>();
		
		huidigeTekening = new Tekening(new Color(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255)));
		
		tekeningen.add (huidigeTekening);
	}
	
	public void Laden()
	{
		tekeningen = tekeningLaden();
		repaint();
	}
	
	public void Opslaan()
	{
		tekeningOpslaan();
	}
	
	private String getBestandsLaadLocatie()
	{
		FileDialog fileDialog = new FileDialog(venster, "Laden die tekening", FileDialog.LOAD);
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
		FileDialog fileDialog = new FileDialog(venster, "Opslaan die tekening", FileDialog.SAVE);
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
	
	public ArrayList<Tekening> tekeningLaden()
	{		
		try
		{
			String locatie = getBestandsLaadLocatie();
			
			if(locatie == null)
			{
				return (ArrayList<Tekening>) tekeningen;
			}
			
			ObjectInputStream reader = new ObjectInputStream(new FileInputStream(locatie));
			ArrayList<Tekening> tekeningen = (ArrayList<Tekening>) reader.readObject();
			reader.close();
			
			return (ArrayList<Tekening>) tekeningen;
		}
			
		catch(ClassNotFoundException e)
			{
				System.err.println("Klasse niet gevonden.");
			}
			
		catch(IOException e)
			{
				System.err.println("Fout tijdens laden: " + e.getMessage());
			}
		
		return (ArrayList<Tekening>) tekeningen;
	}
	
	public void tekeningOpslaan()
	{
		try
		{
			String locatie = getBestandsBewaarLocatie();
			
			if(locatie == null)
			{
				return;
			}
			
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(locatie));
			writer.writeObject(tekeningen);
		}
		catch(IOException e)
		{
			System.err.println("Schrijffout: " + e.getMessage());
		}
	}
	
	/**
	 * Reageerd als de muis gesleept word
	 */
	public void mouseDragged(MouseEvent e) 
	{
		huidigeTekening.voegPuntToe(e.getPoint());
		repaint();
	}
	public void mouseMoved(MouseEvent e) {}
	public void mouseClicked(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	
	/**
	 * Reageerd als de muis ingedrukt word
	 */
	public void mousePressed(MouseEvent e) 
	{
		if(e.isMetaDown())
		{
			huidigeTekening = new Tekening(new Color(generator.nextInt(255),generator.nextInt(255),generator.nextInt(255)));
			tekeningen.add(huidigeTekening);
		}
		else
		{
			huidigeTekening.voegPuntToe(e.getPoint());
		}
		
		repaint();
	}
	public void mouseReleased(MouseEvent e) {}
	
	/**
	 * Reageerd als toetsen worden ingedrukt
	 */
	public void keyPressed(KeyEvent e) 
	{
		int keyCode = e.getKeyCode();
		switch( keyCode )
		{
			
			case KeyEvent.VK_DOWN : huidigeTekening.beweeg(0, +1);
			break;
			case KeyEvent.VK_UP : huidigeTekening.beweeg(0, -1);
			break;
			case KeyEvent.VK_RIGHT : huidigeTekening.beweeg(+1, 0);
			break;
			case KeyEvent.VK_LEFT : huidigeTekening.beweeg(-1, 0);
		}
		repaint();
	}
	public void keyReleased(KeyEvent e) {}
	public void keyTyped(KeyEvent e) {}

	/**
	 * De tekenmethode
	 */
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		for(Tekening tekening : tekeningen)
		{
			tekening.teken(g);
		}
	}

}
