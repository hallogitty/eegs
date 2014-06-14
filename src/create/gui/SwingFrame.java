package create.gui;
import javax.swing.JFrame;


public class SwingFrame extends JFrame 
{
	private StringPanel currentPanel;
	
	public SwingFrame() 
	{
		currentPanel = new StringPanel();
		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(currentPanel);
	}
	
	public void start()
	{
		this.setSize(500,500);
		this.setVisible(true);
	}
	
}
