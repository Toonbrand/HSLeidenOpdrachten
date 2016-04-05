package tentamen_01;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class WaterzichtPaneel extends JPanel implements ActionListener
{
	private int waterhoogte = 150;
	private String status;
	private Zeilboot[] boot;
	private Wolk[] wolk;
	private int zinkAfstand = 1;
	private final int WACHTTIJD = 1;
	
	public WaterzichtPaneel()
	{
		int horPlaatsBoot;
		int horPlaatsWolk;
		int verPlaatsWolk;
		Color kleurBoot;
		Color kleurWolk;
	    Random generator = new Random();
		
	    wolk = new Wolk[5];
	    for(int i = 0; i < wolk.length; i++)
	    {
	    	horPlaatsWolk = (i * 300);
	    	verPlaatsWolk = generator.nextInt(300);
	    	kleurWolk = Color.white;
	    	wolk[i] = new Wolk(horPlaatsWolk, verPlaatsWolk, kleurWolk);    	
	    }
	    
		boot = new Zeilboot[3];
		for(int i = 0; i < boot.length; i++)
		{
			horPlaatsBoot = (i*400)+100;
			 kleurBoot = new Color( generator.nextInt( 256 ), generator.nextInt( 256 ), generator.nextInt( 256 ) ); 
			boot[i] = new Zeilboot(horPlaatsBoot, waterhoogte, kleurBoot);
		}
		Timer autoKlik = new Timer( WACHTTIJD, this );
	    autoKlik.start();
	}
	
	public String getStatus()
	{
		return status;
	}
	
	public void veranderZeil()
	{
		for ( Zeilboot zeilboot : boot )
			zeilboot.wisselStatus();
		
		for ( Wolk wolk1 : wolk )
			wolk1.toggleBeweeg();
	}
	
	public void pompUit()
	{
		status = "uit";
		for ( Zeilboot zeilboot : boot )
			zeilboot.setPompStatus("uit");
	}
	
	public void pompZacht()
	{
		status = "zacht";
		for ( Zeilboot zeilboot : boot )
			zeilboot.setPompStatus("zacht");
	}
	
	public void pompHard()
	{
		status = "hard";
		for ( Zeilboot zeilboot : boot )
			zeilboot.setPompStatus("hard");
	}
	
	public void setWaterhoogte(int nieuweWaterHoogte)
	{
		waterhoogte = nieuweWaterHoogte;
	}
	
	public int getWaterhoogte()
	{
		return waterhoogte;
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.CYAN);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLUE);
		g.fillRect(0, getHeight() - waterhoogte, getWidth(), waterhoogte);
	
		for ( Zeilboot zeilboot : boot )
			zeilboot.setScherm(getWidth(),getHeight());
		
		for ( Wolk wolk1 : wolk)
			wolk1.setScherm(getWidth(),getHeight());
		
		for ( Wolk wolk1 : wolk)
			wolk1.Teken(g);
		
		for ( Zeilboot zeilboot : boot )
			zeilboot.Teken(g);
		
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		for ( Zeilboot zeilboot : boot )
			zeilboot.zink(zinkAfstand);
		
		for ( Wolk wolk1 : wolk)
			wolk1.beweeg();
		
		repaint();
	}
	
}
