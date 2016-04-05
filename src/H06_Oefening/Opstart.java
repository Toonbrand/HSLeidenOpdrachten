package H06_Oefening;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class Opstart extends JFrame implements ActionListener
{
	private Paneel paneel;
	
	public Opstart()
	{
		setSize(500,400);
		setTitle("Voorbeeld met events");
		setLocation(100,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		paneel = new Paneel();
		
		add(paneel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Opstart();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		paneel.randomAchtergrond();
	}
}
