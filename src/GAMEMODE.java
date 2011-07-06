

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
public class GAMEMODE {

	private JFrame jFrameGameMode = null;  //  @jve:decl-index=0:visual-constraint="109,16"
	private JPanel jContentPaneGameMode = null;
	private JLabel jLabelGameMode = null;

	/**
	 * This method initializes jFrameGameMode	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameGameMode() {
		if (jFrameGameMode == null) {
			jFrameGameMode = new JFrame();
			jFrameGameMode.setSize(new Dimension(600, 700));
			jFrameGameMode.setResizable(false);
			jFrameGameMode.setTitle("Game Modes");
			jFrameGameMode.setContentPane(getJContentPaneGameMode());
		}
		return jFrameGameMode;
	}

	/**
	 * This method initializes jContentPaneGameMode	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneGameMode() {
		if (jContentPaneGameMode == null) {
			jLabelGameMode = new JLabel();
			jLabelGameMode.setBounds(new Rectangle(258, 18, 76, 55));
			jLabelGameMode.setText("Game Mode");
			jContentPaneGameMode = new JPanel();
			jContentPaneGameMode.setLayout(null);
			jContentPaneGameMode.add(jLabelGameMode, null);
		}
		return jContentPaneGameMode;
	}

}
