package H02_V02;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ParapluPaneel extends JPanel implements ActionListener
{
	private JTextField kleurRVeld, kleurGVeld, kleurBVeld;
	private JButton tekenknop;
	private Color huidigeKleur;
	private final int Y_BEGIN = 100;
	private final int BALEINEN_BREEDTE = 300;
	private final int BALEINEN_HOOGTE = BALEINEN_BREEDTE / 2;
	private final int PARAPLU_HOOGTE = 250;
	private final int PUNTJE_BOVENOP_HOOGTE = 20;
	private final int DIAMETER_HANDGREEP = 50;
	
	public ParapluPaneel()
	{
		tekenknop = new JButton("Tekenparaplu");
		tekenknop.addActionListener(this);
		kleurRVeld = new JTextField("13", 4);
		kleurGVeld = new JTextField("39", 4);
		kleurBVeld = new JTextField("130", 4);
		bepaalIngesteldeKleur();
		add(new JLabel("Geef de waarden van R G en B (0-255)"));
		add(kleurRVeld);
		add(kleurGVeld);
		add(kleurBVeld);
		add(tekenknop);
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(huidigeKleur);
		int midden = getWidth() /2;
		g.drawLine(midden, Y_BEGIN, midden, Y_BEGIN + PARAPLU_HOOGTE);
		g.drawArc(midden, Y_BEGIN + PARAPLU_HOOGTE - DIAMETER_HANDGREEP/2, DIAMETER_HANDGREEP, DIAMETER_HANDGREEP, 0, -180);
		g.fillArc(midden - BALEINEN_BREEDTE/2, Y_BEGIN + PUNTJE_BOVENOP_HOOGTE, BALEINEN_BREEDTE, BALEINEN_HOOGTE, 0, 180);
	}
	public void bepaalIngesteldeKleur()
	{
		int kleurR = Integer.parseInt(kleurRVeld.getText());
		int kleurG = Integer.parseInt(kleurGVeld.getText());
		int kleurB = Integer.parseInt(kleurBVeld.getText());
		huidigeKleur = new Color(kleurR % 256, kleurG % 256, kleurB % 256);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		bepaalIngesteldeKleur();
		repaint();
	}
}
