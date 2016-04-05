package voorbeeld_achtbaanV3;

import javax.swing.JFrame;

public class Opstart extends JFrame
{
	public Opstart()
	{
		setSize(600, 500);
		setTitle("Achtbaan simulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		Achtbaan achtbaan = new Achtbaan();
		add(achtbaan);
		
		setVisible(true);
		
		Persoon piet = new Persoon("Piet", 160, 28, 85);
		Persoon kees = new Persoon("Kees", 200, 28, 85);
		Persoon jan = new Persoon("Jan", 195, 28, 85);
		Persoon mien = new Persoon("Mien", 180, 28, 85);
		Persoon truus = new Persoon("Truus", 150, 28, 85);
		Persoon joep = new Persoon("Joep", 178, 28, 85);
		Persoon peter = new Persoon("Peter", 180, 28, 85);
		Persoon mies = new Persoon("Mies", 180, 28, 85);
		Persoon jos = new Persoon("Jos", 180, 28, 85);
		
		Kar kar1 = new Kar();
		kar1.voegPersoonToe(piet);
		kar1.voegPersoonToe(kees);
		kar1.voegPersoonToe(jan);
		kar1.voegPersoonToe(mien);
		kar1.voegPersoonToe(truus);
		
		kar1.verwijderPersoon(2);
		
		Kar kar2 = new Kar();
		kar2.voegPersoonToe(joep);
		kar2.voegPersoonToe(peter);
		kar2.voegPersoonToe(mies);
		kar2.voegPersoonToe(jos);
		
		achtbaan.voegKarToe(kar1);
		achtbaan.voegKarToe(kar2);
	}
	
	public static void main(String[] args)
	{
		new Opstart();
	}
}
