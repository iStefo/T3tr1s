

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JLabel;
public class MAINMENU {

	private JFrame jFrameMainMenu = null;  //  @jve:decl-index=0:visual-constraint="59,11"
	private JPanel jContentPaneMainMenu = null;
	private JButton jButtonGameMode = null;
	private JButton jButtonOptions = null;
	private JButton jButtonHelp = null;  //  @jve:decl-index=0:visual-constraint="164,280"
	private JButton jButtonHighscores = null;  //  @jve:decl-index=0:visual-constraint="358,288"
	private JButton jButtonLogout = null;
	private JLabel jLabelMainMenu = null;

	/**
	 * This method initializes jFrameMainMenu	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameMainMenu() {
		if (jFrameMainMenu == null) {
			jFrameMainMenu = new JFrame();
			jFrameMainMenu.setSize(new Dimension(600, 700));
			jFrameMainMenu.setResizable(false);
			jFrameMainMenu.setTitle("Main Menu");
			jFrameMainMenu.setContentPane(getJContentPaneMainMenu());
		}
		return jFrameMainMenu;
	}

	/**
	 * This method initializes jContentPaneMainMenu	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneMainMenu() {
		if (jContentPaneMainMenu == null) {
			jLabelMainMenu = new JLabel();
			jLabelMainMenu.setBounds(new Rectangle(259, 16, 70, 31));
			jLabelMainMenu.setText("MainMenu");
			jContentPaneMainMenu = new JPanel();
			jContentPaneMainMenu.setLayout(null);
			jContentPaneMainMenu.add(getJButtonOptions(), null);
			jContentPaneMainMenu.add(getJButtonLogout(), null);
			jContentPaneMainMenu.add(getJButtonGameMode(), null);
			jContentPaneMainMenu.add(jLabelMainMenu, null);
		}
		return jContentPaneMainMenu;
	}

	/**
	 * This method initializes jButtonGameMode	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonGameMode() {
		if (jButtonGameMode == null) {
			jButtonGameMode = new JButton();
			jButtonGameMode.setText("Spielmodus");
			jButtonGameMode.setBounds(new Rectangle(92, 128, 101, 26));
		}
		return jButtonGameMode;
	}

	/**
	 * This method initializes jButtonOptions	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonOptions() {
		if (jButtonOptions == null) {
			jButtonOptions = new JButton();
			jButtonOptions.setBounds(new Rectangle(329, 112, 128, 51));
			jButtonOptions.setText("Optionen");
		}
		return jButtonOptions;
	}

	/**
	 * This method initializes jButtonHelp	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonHelp() {
		if (jButtonHelp == null) {
			jButtonHelp = new JButton();
			jButtonHelp.setText("Hilfe");
		}
		return jButtonHelp;
	}

	/**
	 * This method initializes jButtonHighscores	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonHighscores() {
		if (jButtonHighscores == null) {
			jButtonHighscores = new JButton();
			jButtonHighscores.setText("Highscores");
		}
		return jButtonHighscores;
	}

	/**
	 * This method initializes jButtonLogout	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonLogout() {
		if (jButtonLogout == null) {
			jButtonLogout = new JButton();
			jButtonLogout.setBounds(new Rectangle(450, 604, 131, 55));
			jButtonLogout.setText("Logout");
		}
		return jButtonLogout;
	}

}
