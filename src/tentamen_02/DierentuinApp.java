package tentamen_02;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class DierentuinApp extends JFrame
{
	Dierentuin dierentuin;
	KnoppenBalk knoppenBalk;

	public DierentuinApp()
	{
		setLocation(100,20);
		setSize(1200,700);
		setTitle("De dierentuin");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		dierentuin = new Dierentuin();
		add(dierentuin, BorderLayout.CENTER);
		
		knoppenBalk = new KnoppenBalk();
		add(knoppenBalk, BorderLayout.SOUTH);
		
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new DierentuinApp();
	}
}
