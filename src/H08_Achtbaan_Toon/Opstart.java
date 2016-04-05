package H08_Achtbaan_Toon;

import java.awt.BorderLayout;
import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

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
		
		KnoppenBalk knoppenbalk = new KnoppenBalk(achtbaan);
		add(knoppenbalk, BorderLayout.NORTH);
		//add(achtbaanObjectLaden());
		
		setVisible(true);
		
		Persoon piet = new Persoon("Piet", 160, 28, 85);
		Persoon kees = new Persoon("Kees", 200, 28, 85);
		Persoon jan = new Persoon("Jan", 195, 28, 85);
		Persoon mien = new Persoon("Mien", 180, 28, 85);
		Persoon truus = new Persoon("Truus", 150, 28, 85);
		Persoon joep = new Persoon("Joep", 178, 28, 85);
		Persoon peter = new Persoon("Peter", 180, 28, 85);
		Persoon mies = new Persoon("Mies", 180, 28, 85);
		Persoon jos = new Persoon("Jos", 200, 28, 85);
		
		try
		{
			Kar kar1 = new Kar();
			kar1.setWachtTijd(100);
			kar1.voegPersoonToe(piet);
			kar1.voegPersoonToe(kees);
			kar1.voegPersoonToe(jan);
			kar1.voegPersoonToe(mien);
			kar1.voegPersoonToe(truus);
			
			kar1.verwijderPersoon(2);
			achtbaan.voegKarToe(kar1);
			
			
			Kar kar2 = new Kar();
			kar2.setWachtTijd(50);
			kar2.voegPersoonToe(joep);
			kar2.voegPersoonToe(peter);
			kar2.voegPersoonToe(mies);
			kar2.voegPersoonToe(jos);
			
			achtbaan.voegKarToe(kar2);
			
			//achtbaanObjectOpslaan(achtbaan);
			
			//achtbaanOpslaan(achtbaan);
			//System.out.println("-----------------------------------------------------");
			//achtbaanLaden();
		}
		catch(KarException ke)
		{
			System.err.println("Oops, kar fout!");
			System.err.println(ke.getMessage());
		}
		catch(AchtbaanException ae)
		{
			System.err.println("Oops, achtbaan fout!");
			System.err.println(ae.getMessage());
		}
		
	}
	
	private String getBestandsBewaarLocatie()
	{
		FileDialog fileDialog = new FileDialog(this, "Lekker achtbaan opslaan", FileDialog.SAVE);
		fileDialog.setVisible(true);
		
		String filename = fileDialog.getFile();
		String directory = fileDialog.getDirectory();
		
		if(filename == null)
		{
			System.err.println("Helaas, annuleren slaat geen bestand op...");
			return null;
		}
		
		return directory + filename;
	}
	
	private String getBestandsLaadLocatie()
	{
		FileDialog fileDialog = new FileDialog(this, "Lekker achtbaan laden", FileDialog.LOAD);
		fileDialog.setVisible(true);
		
		String filename = fileDialog.getFile();
		String directory = fileDialog.getDirectory();
		
		if(filename == null)
		{
			System.err.println("Helaas, annuleren laad geen bestand...");
			return null;
		}
		return directory + filename;
	}
	
	private void achtbaanObjectOpslaan(Achtbaan achtbaan)
	{
		try
		{
			String locatie = getBestandsBewaarLocatie();
			
			if(locatie == null)
			{
				return;
			}
			
			ObjectOutputStream writer = new ObjectOutputStream(new FileOutputStream(locatie));
			writer.writeObject(achtbaan);
		}
		catch(IOException e)
		{
			System.err.println("Schrijffout: " + e.getMessage());
		}
	}
	
	private Achtbaan achtbaanObjectLaden()
	{
		try
		{
			String locatie = getBestandsLaadLocatie();
			
			if(locatie == null)
			{
				return new Achtbaan();
			}
			
			ObjectInputStream reader = new ObjectInputStream(new FileInputStream(locatie));
			Achtbaan achtbaan = (Achtbaan)reader.readObject();
			reader.close();
			return achtbaan;
		}
		catch(ClassNotFoundException e)
		{
			System.err.println("Klasse niet gevonden.");
		}
		
		catch(IOException e)
		{
			System.err.println("Fout tijdens laden: " + e.getMessage());
		}
		return new Achtbaan();
	}
	
	private void achtbaanTekstOpslaan(Achtbaan achtbaan)
	{
		try
		{
			FileDialog fileDialog = new FileDialog(this, "Lekker achtbaan opslaan", FileDialog.SAVE);
			fileDialog.setVisible(true);
			
			String filename = fileDialog.getFile();
			String directory = fileDialog.getDirectory();
			
			if(filename == null)
			{
				System.err.println("Helaas, annuleren slaat geen bestand op...");
				return;
			}
			
			PrintWriter writer = new PrintWriter(new FileWriter(directory + filename));
			writer.print(achtbaan.toString());
			writer.close();
		}
		catch(IOException e)
		{
			System.err.println("IO fout: " + e.getMessage());
		}
	}
	
	private void achtbaanTekstLaden()
	{
		try
		{
			FileDialog fileDialog = new FileDialog(this, "Lekker achtbaan laden", FileDialog.LOAD);
			fileDialog.setVisible(true);
			
			String filename = fileDialog.getFile();
			String directory = fileDialog.getDirectory();
			
			if(filename == null)
			{
				System.err.println("Helaas, annuleren laadt geen bestand op...");
				return;
			}
			
			BufferedReader reader = new BufferedReader(new FileReader(directory + filename));
			String line = reader.readLine();
			
			while(line != null)
			{
				System.out.println(line);
				line = reader.readLine();
			}
			
			reader.close();
		}
		catch(IOException e)
		{
			
		}
	}
	
	public static void main(String[] args)
	{
		new Opstart();
	}
}
