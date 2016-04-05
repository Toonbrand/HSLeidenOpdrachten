package H08_04;

import java.awt.FileDialog;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.imageio.IIOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GetallenWegschrijvenPaneel extends JPanel
{
	private int[ ] getallenLijst;
	private int getallenTotaal, getallenGemiddelde;
	private String uitvoer;
	private JTextArea uitkomstVeld;
	private JFrame venster;
	Random generator = new Random();
	
	public GetallenWegschrijvenPaneel()
	{
		getallenLijst = new int[100];
		for(int x = 0; x < getallenLijst.length; x++)
		{
			getallenLijst[x] = generator.nextInt(101);
		}
		
		uitkomstVeld = new JTextArea(3,20);
		add(uitkomstVeld);
		
		berekenGemiddelde();
		getallenOpslaan();
	}
	
	public void berekenGemiddelde()
	{
		for(int x = 0; x < getallenLijst.length; x++)
		{
			getallenTotaal = getallenTotaal + getallenLijst[x];
		}
		getallenGemiddelde = getallenTotaal/getallenLijst.length;
		uitkomstVeld.setText("Het gemiddelde van de getallen is: " + getallenGemiddelde);
	}
	
	public void getallenOpslaan()
	{
		FileDialog dialoogvenster;
		dialoogvenster = new FileDialog(venster,"Sla het bestand op", FileDialog.SAVE);
		dialoogvenster.setVisible(true);
		String bestandsNaam = dialoogvenster.getFile();
		if (bestandsNaam != null)
		{
			String padEnBestand = dialoogvenster.getDirectory() + bestandsNaam;
			try
			{
				PrintWriter uitvoer = new PrintWriter(new FileWriter(padEnBestand));
				for(int x = 0; x < getallenLijst.length; x++)
				{
					uitvoer.println(getallenLijst[x]);
				}
				uitvoer.close();
			}
			catch (IOException ex)
			{
				JOptionPane.showMessageDialog(null,"Er is een fout opgetreden bij het schrijven.", "Bewaren van bestand is mislukt", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
}