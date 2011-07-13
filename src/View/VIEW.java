package View;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class VIEW {

	private JFrame jFrame;
	private JPanel jContentPane;
	
	public void displayScene(T3Scene t3Scene)
	{
	  jFrame = new JFrame();
	  jFrame.setDefaultCloseOperation(jFrame.DISPOSE_ON_CLOSE);
	  jFrame.setContentPane(getJContentPane());
	  jFrame.setSize(new Dimension(600, 700));
	  jFrame.setResizable(false);
	  jFrame.setTitle(t3Scene.getTitle());
	 
	  
	}
	
	private Container getJContentPane() {
		if(jContentPane==null)
		{
			jContentPane = jLabel(bildvomJonas);
		}
		return jContentPane;
	}

	public String getValueForElement(String title)
	{
		
	}
}
