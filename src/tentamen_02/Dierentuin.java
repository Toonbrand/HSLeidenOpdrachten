package tentamen_02;

import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Dierentuin extends JPanel implements MouseListener
{
	private ArrayList<Kooi> kooien;
	private ArrayList<Vijver> vijvers;
	private int xPos, yPos;
	private JFrame venster;
	private ImageIcon achtergrond;
	
	public Dierentuin()
	{
		setLayout(null);
		kooien = new ArrayList<Kooi>();
		vijvers = new ArrayList<Vijver>();
		addMouseListener(this);
	}
	
	public void veranderAchtergrond()
	{
		achtergrond = new ImageIcon(getAfbeeldingLocatie());
	}
	
	public String getAfbeeldingLocatie()
	{
		FileDialog fileDialog = new FileDialog(venster, "Selecteer een afbeelding", FileDialog.LOAD);
		fileDialog.setVisible(true);
		
		String filename = fileDialog.getFile();
		String directory = fileDialog.getDirectory();
		
		if(filename == null)
		{
			System.err.println("Laden geannuleerd");
			return null;
		}
		
		return directory + filename;
	}

	public void mouseClicked(MouseEvent e) 
	{
		if ( e.getClickCount() == 2 )
		{
			veranderAchtergrond();
		}
	}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) 
	{
			xPos = e.getX();
			yPos = e.getY();
	}
	public void mouseReleased(MouseEvent e) 
	{
		int breedte = e.getX() - xPos;
		int hoogte = e.getY() - yPos;
		Point positie = new Point(xPos, yPos);
		if(breedte != 0 && hoogte != 0)
		{
			if (e.getButton() == e.BUTTON1)
			{
				Kooi kooi;
				kooi = new Kooi(positie, breedte, hoogte);
				kooi.setBounds(kooi.getPositie().x,kooi.getPositie().y,kooi.getBreedte(),kooi.getHoogte());
				kooien.add(kooi);
				add(kooi);
			}
			
			else if (e.getButton() == e.BUTTON3)
			{
				Vijver vijver;
				vijver = new Vijver(positie, breedte, hoogte);
				vijver.setBounds(vijver.getPositie().x,vijver.getPositie().y,vijver.getBreedte(),vijver.getHoogte());
				vijvers.add(vijver);
				add(vijver);
			}
		}
		
		repaint();
	}
	
	public void paintComponent(Graphics g)
	{
		if (achtergrond != null)
		{
			g.drawImage(achtergrond.getImage(),0,0,getWidth(),getHeight(),this);
		}
		else
		{
			g.setColor(Color.GRAY);
			g.fillRect(0, 0, getWidth(), getHeight());
		}
		
		repaint();
	}

}
