import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

//ono u sredini
public class DrawingSurface extends JPanel
{
	private static final long serialVersionUID = 1L;


	public void paintComponent(Graphics gContext)
	{
		
		gContext.setColor(Color.blue);
		
		for(int i=0;i<100;i++)
		{
			int x = (int)(Math.random()*getWidth());
			int y = (int)(Math.random()*getHeight());
			
			gContext.drawRect(x, y, 10, 10);
			gContext.drawOval(x, y, 10, 10);
		}
		
	}
}
