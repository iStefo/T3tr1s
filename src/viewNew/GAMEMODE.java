package viewNew;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class GAMEMODE {

	private JFrame jFrameGameMode = null;  //  @jve:decl-index=0:visual-constraint="100,19"
	private JPanel jContentPaneGameMode = null;
	private JLabel jLabelGameMode = null;
	private JButton jButtonArcade = null;
	private JButton jButtonClassic = null;
	private JButton jButtonTimeWarp = null;
	private JButton jButtonHelp = null;
	private JButton jButtonBack = null;
	ImageIcon backgroundII = new ImageIcon("J:\\T3tr1s\\Pictures\\HintergrundTetris.png");  //  @jve:decl-index=0:
    private JLabel backgroundLabel = null;
    
	
    
    /**
	 * This method initializes jFrameGameMode	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameGameMode() {
		if (jFrameGameMode == null) {
			jFrameGameMode = new JFrame();
			jFrameGameMode.setSize(new Dimension(606, 733));
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
			jContentPaneGameMode.add(getJButtonArcade(), null);
			jContentPaneGameMode.add(getJButtonClassic(), null);
			jContentPaneGameMode.add(getJButtonTimeWarp(), null);
			jContentPaneGameMode.add(getJButtonHelp(), null);
			jContentPaneGameMode.add(getJButtonBack(), null);
			
			backgroundLabel = new JLabel(backgroundII);
			backgroundLabel.setBounds(new Rectangle(0, 0, 600, 700));
			jContentPaneGameMode.add(backgroundLabel, null);
			backgroundLabel.setVisible(true);
		}
		return jContentPaneGameMode;
	}

	/**
	 * This method initializes jButtonArcade	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonArcade() {
		if (jButtonArcade == null) {
			jButtonArcade = new JButton();
			jButtonArcade.setBounds(new Rectangle(41, 91, 190, 68));
			jButtonArcade.setText("Arcade");
		}
		return jButtonArcade;
	}

	/**
	 * This method initializes jButtonClassic	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonClassic() {
		if (jButtonClassic == null) {
			jButtonClassic = new JButton();
			jButtonClassic.setBounds(new Rectangle(329, 91, 177, 67));
			jButtonClassic.setText("Classic");
		}
		return jButtonClassic;
	}

	/**
	 * This method initializes jButtonTimeWarp	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonTimeWarp() {
		if (jButtonTimeWarp == null) {
			jButtonTimeWarp = new JButton();
			jButtonTimeWarp.setBounds(new Rectangle(44, 265, 183, 51));
			jButtonTimeWarp.setText("TimeWarp");
		}
		return jButtonTimeWarp;
	}

	/**
	 * This method initializes jButtonHelp	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonHelp() {
		if (jButtonHelp == null) {
			jButtonHelp = new JButton();
			jButtonHelp.setBounds(new Rectangle(250, 188, 72, 53));
			jButtonHelp.setText("???");
		}
		return jButtonHelp;
	}

	/**
	 * This method initializes jButtonBack	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBack() {
		if (jButtonBack == null) {
			jButtonBack = new JButton();
			jButtonBack.setBounds(new Rectangle(372, 586, 138, 57));
			jButtonBack.setText("Back");
		}
		return jButtonBack;
	}

}
