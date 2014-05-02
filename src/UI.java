import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/*A Runnable is basically a type of class (Runnable is an Interface) 
that can be put into a thread, describing what the thread is supposed to do*/
	
public class UI extends JFrame implements Runnable, ActionListener
{

	@Override
	public void run()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 200);
		setLocationRelativeTo(null);
		
		add(new DrawingSurface());
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}

}
