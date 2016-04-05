package H05_04;

import java.awt.Color;
import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class KleurenstrookBediening extends JPanel implements ActionListener
{
	private JButton tekenKnop;
	KleurenstrookTeken kleurenstrookTeken;
	Random generator = new Random();
	private Color kleur1;
	private Color kleur2;
	private Color kleur3;
	private final int KLEURGRENS = 85;
	
	public KleurenstrookBediening(KleurenstrookTeken kleurenstrookTeken)
	{
		this.kleurenstrookTeken = kleurenstrookTeken;
		tekenKnop = new JButton("teken vlakken");
		tekenKnop.addActionListener(this);
		add(tekenKnop);
	}
	
	public void maakKleuren()
	{
		kleur1 = new Color(generator.nextInt(KLEURGRENS),
				generator.nextInt(KLEURGRENS),
				generator.nextInt(KLEURGRENS));
		kleur2 = new Color(generator.nextInt(KLEURGRENS) + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + KLEURGRENS,
				generator.nextInt(KLEURGRENS) + KLEURGRENS);
		kleur3 = new Color(generator.nextInt(KLEURGRENS) + 2 * KLEURGRENS,
				generator.nextInt(KLEURGRENS) + 2 * KLEURGRENS,
				generator.nextInt(KLEURGRENS) + 2 *KLEURGRENS);
	}
	
	public Color getKleurEen()
	{
		return kleur1;
	}
	
	public Color getKleurTwee()
	{
		return kleur2;
	}
	
	public Color getKleurDrie()
	{
		return kleur3;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==tekenKnop)
		{
			maakKleuren();
		}
	}

}
