

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
public class Mainwindow {

	private JFrame TetrisWindow = null;  //  @jve:decl-index=0:visual-constraint="234,12"
	private JPanel jContentPane = null;

	public Mainwindow()
	{

	}
	
	
	/**
	 * This method initializes TetrisWindow	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public JFrame getTetrisWindow() {
		if (TetrisWindow == null) {
			TetrisWindow = new JFrame();
			TetrisWindow.setSize(new Dimension(600, 700));
			TetrisWindow.setContentPane(getJContentPane());
			TetrisWindow.setResizable(false);
			TetrisWindow.setDefaultCloseOperation(TetrisWindow.DISPOSE_ON_CLOSE);
			TetrisWindow.setVisible(true);
			
		}
		return TetrisWindow;
	}

	/**
	 * This method initializes jContentPane	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(null);
			jContentPane.setVisible(true);
		}
		return jContentPane;
	}

}
