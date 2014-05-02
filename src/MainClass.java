import java.awt.EventQueue;

import javax.swing.Timer;



public class MainClass
{
	public static Timer t; 
	
	public static void main(String[] args)  
	{
		/*It is used to ensure that all UI updates are concurrency-safe. 
		So situations such as a component's colour changing while it is being painted do not occur.
		
*/		UI myUI = new UI();
		EventQueue.invokeLater(myUI);
		
		t = new Timer(500, myUI);
		t.start();
	}

}
