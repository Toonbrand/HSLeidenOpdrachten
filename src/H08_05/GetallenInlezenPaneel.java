package H08_05;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GetallenInlezenPaneel extends JPanel
{
	private int getallenTotaal, aantalGetallen, getallenGemiddelde;
	private JTextArea uitkomstVeld;
	private JFrame venster;
	private FileDialog dialoogvenster;
	
	public GetallenInlezenPaneel()
	{
		uitkomstVeld = new JTextArea(3,20);
		add(uitkomstVeld);
		
		GetallenOphalen();
		BerekenGemiddelde();
	}
	
	public void GetallenOphalen()
	{
		dialoogvenster = new FileDialog(venster, "Open een bestand", FileDialog.LOAD);
		dialoogvenster.setVisible(true);
		String bestandsnaam = dialoogvenster.getFile();
		if (bestandsnaam != null)
		{
			String padEnBestand = dialoogvenster.getDirectory() + bestandsnaam;
			String regel;
			try
			{
				BufferedReader invoer = new BufferedReader( new FileReader(padEnBestand));
				regel = invoer.readLine();
				while (regel != null)
				{
					getallenTotaal = getallenTotaal + Integer.parseInt(regel);
					aantalGetallen++;
					regel = invoer.readLine();
				}
				invoer.close();
			}
			catch (IOException ex)
			{
				JOptionPane.showMessageDialog(null, "Er is een fout opgetreden bij het schrijven.", "Bewaren van bestand is mislukt", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	public void BerekenGemiddelde()
	{
		getallenGemiddelde = getallenTotaal/aantalGetallen;
		uitkomstVeld.setText("Het gemiddelde van de getallen is " + getallenGemiddelde);
	}
}
