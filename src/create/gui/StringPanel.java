package create.gui;

import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.SpringLayout;
import javax.swing.JButton;

public class StringPanel extends JPanel 
{
	
	private JButton testButton;
	private JTextArea testTextArea;
	private SpringLayout currentLayout;
	
	public StringPanel() 
	{	
		setBackground(new Color(176, 224, 230));
		testButton = new JButton("Click Here!");
		testTextArea = new JTextArea();
		currentLayout = new SpringLayout();

		
		setupPanel();
	}
	
	private void setupPanel()
	{
		this.setLayout(currentLayout);
		this.add(testButton);
		this.add(testTextArea);

		currentLayout.putConstraint(SpringLayout.NORTH, testButton, 137, SpringLayout.NORTH, this);
		currentLayout.putConstraint(SpringLayout.WEST, testButton, 170, SpringLayout.WEST, this);
		
	}

	
}
