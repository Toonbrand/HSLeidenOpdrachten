package H05_01;

import java.awt.event.*;
import java.util.Random;

import javax.swing.*;

public class DobbelSteenBediening extends JPanel implements ActionListener
{
	private JButton gooi;
	private int randomGetal;
	Random getallengenerator = new Random();
	DobbelSteen dobbelsteen;
	
	public DobbelSteenBediening(DobbelSteen dobbelsteen)
		{
		this.dobbelsteen = dobbelsteen;
		
		gooi = new JButton("Gooi!");
		gooi.addActionListener(this);
		add(gooi);
		
		}
		
		public void actionPerformed(ActionEvent e)
		{
			randomGetal = getallengenerator.nextInt(6)+1;
			dobbelsteen.setAantalOgen(randomGetal);
			repaint();
			System.out.print(" " + randomGetal);
		}
	}