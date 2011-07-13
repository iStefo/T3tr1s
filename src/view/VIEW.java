package view;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VIEW {

	private JFrame jFrame;
	private JPanel jContentPane;
	private JLabel background;
	ImageIcon backgroundPicture = new ImageIcon("pfad");
	
	
	public void displayScene(T3Scene t3Scene)
	{
	   getJFrame(t3Scene);
	   getJContent(t3Scene);
	
	  
	}
	
	private JFrame getJFrame(T3Scene t3Scene)
	{
		if (jFrame==null)
		{
			  jFrame = new JFrame();
			  jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
			  jFrame.setContentPane(getJContentPane());
			  jFrame.setSize(new Dimension(600, 700));
			  jFrame.setResizable(false);
			  jFrame.setTitle(t3Scene.getTitle()); 
		}return  jFrame;
	}

	
	
	
	private JPanel getJContentPane(T3Scene t3Scene) {
		if(jContentPane==null)
		{
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			background = new JLabel(backgroundPicture);
			background.setBounds(0, 0, 600, 700);
		}
		return jContentPane;
	}

	
	
	public String getValueForElement(String title)
	{
		
	}
}
