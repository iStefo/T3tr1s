package viewNew;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class HIGHSCORE {

	private JFrame jFrameHighscore = null;  //  @jve:decl-index=0:visual-constraint="204,17"
	private JPanel jContentPaneHighscore = null;

	/**
	 * This method initializes jFrameHighscore	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameHighscore() {
		if (jFrameHighscore == null) {
			jFrameHighscore = new JFrame();
			jFrameHighscore.setContentPane(getJContentPaneHighscore());
			jFrameHighscore.setSize(new Dimension(606, 733));
			
		}
		return jFrameHighscore;
	}

	/**
	 * This method initializes jContentPaneHighscore	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneHighscore() {
		if (jContentPaneHighscore == null) {
			jContentPaneHighscore = new JPanel();
			jContentPaneHighscore.setLayout(new BorderLayout());
		}
		return jContentPaneHighscore;
	}

}
