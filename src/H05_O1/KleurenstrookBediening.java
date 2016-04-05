package H05_O1;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class KleurenstrookBediening extends JPanel implements ActionListener
{
	private JButton tekenKnop;
	KleurenstrookTeken kleurenstrookTeken;
	Random generator = new Random();
	
	public KleurenstrookBediening(KleurenstrookTeken kleurenstrookTeken)
	{
		this.kleurenstrookTeken = kleurenstrookTeken;
		tekenKnop = new JButton("teken vlakken");
		tekenKnop.addActionListener(this);
		add(tekenKnop);
	}
	
	public void maakKleuren()
	{
		final int KLEURGRENS = 85; // een derde van 255
		Color[ ] kleuren = new Color[3];
		kleuren[0] = new Color(generator.nextInt(KLEURGRENS),
				generator.nextInt(KLEURGRENS),
				generator.nextInt(KLEURGRENS));
		kleuren[1] = new Color(generator.nextInt(KLEURGRENS) + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + KLEURGRENS);
		kleuren[2] = new Color(generator.nextInt(KLEURGRENS) + 2 * KLEURGRENS,
				generator.nextInt(KLEURGRENS) + 2 * KLEURGRENS,
				generator.nextInt(KLEURGRENS) + 2 *KLEURGRENS);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		maakKleuren();
		kleurenstrookTeken.repaint();
	}

}
