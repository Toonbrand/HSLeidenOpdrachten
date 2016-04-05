package H07_Oefening;

import java.awt.Color;

import javax.swing.*;

public class Opstart extends JFrame
{
	public Opstart()
	{
		setSize(600,500);
		setTitle("Achtbaan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		Achtbaan achtbaan = new Achtbaan();
		add(achtbaan);
		
		setVisible(true);
		
		Persoon toon1 = new Persoon("Toon1", 155, 20, 85);
		Persoon toon2 = new Persoon("Toon2", 170, 20, 85);
		Persoon toon3 = new Persoon("Toon3", 167, 20, 85);
		Persoon toon4 = new Persoon("Toon4", 160, 20, 85);
		Persoon toon5 = new Persoon("Toon5", 189, 20, 85);
		Persoon toon6 = new Persoon("Toon6", 175, 20, 85);
		Persoon toon7 = new Persoon("Toon7", 185, 20, 85);
		Persoon toon8 = new Persoon("Toon8", 167, 20, 85);
		Persoon toon9 = new Persoon("Toon9", 158, 20, 85);
		
		try
		{
			Kar kar1 = new Kar();
			kar1.voegPersoonToe(toon1);
			kar1.voegPersoonToe(toon2);
			kar1.voegPersoonToe(toon3);
			kar1.voegPersoonToe(toon4);
			kar1.voegPersoonToe(toon5);
			kar1.voegPersoonToe(toon6);
			
			Kar kar2 = new Kar();
			kar2.voegPersoonToe(toon7);
			kar2.voegPersoonToe(toon8);
			kar2.voegPersoonToe(toon9);
			
			Kar kar3 = new Kar();
			Kar kar4 = new Kar();
			Kar kar5 = new Kar();
			
			achtbaan.voegKarToe(kar1);
			achtbaan.voegKarToe(kar2);
			achtbaan.voegKarToe(kar3);
			achtbaan.voegKarToe(kar4);
			achtbaan.voegKarToe(kar5);
		}
		catch(KarException ke)
		{
			System.err.println("Oh shit, kar fout");
			System.err.println(ke.getMessage());
		}
		catch(AchtbaanException ae)
		{
			System.err.println("Oh shit, achtbaan fout");
			System.err.println(ae.getMessage());
		}
	}
	
	public static void main(String[] args)
	{
		new Opstart();
	}
}
