package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Rectangle;
public class GAMEOVER {

	private JFrame jFrameGameOver = null;  //  @jve:decl-index=0:visual-constraint="39,28"
	private JPanel jContentPaneGameOver = null;
	private JButton jButtonChooseMode = null;
	private JButton jButtonOnceAgain = null;
	private JButton jButtonHighscore = null;
	private JButton jButtonMenu = null;
	private JLabel jLabelGameOver = null;

	public GAMEOVER () {
		getJFrameGameOver();
	}
	
	private JFrame getJFrameGameOver() {
		if (jFrameGameOver == null) {
			jFrameGameOver = new JFrame();
			jFrameGameOver.setSize(new Dimension(600, 700));
			jFrameGameOver.setContentPane(getJContentPaneGameOver());
			jFrameGameOver.setResizable(false);
			jFrameGameOver.setVisible(true);
			jFrameGameOver.setTitle("Game Over");
		}
		return jFrameGameOver;
	}

	/**
	 * This method initializes jContentPaneGameOver	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneGameOver() {
		if (jContentPaneGameOver == null) {
			jLabelGameOver = new JLabel();
			jLabelGameOver.setBounds(new Rectangle(167, 16, 278, 57));
			jLabelGameOver.setText("Game Over");
			jLabelGameOver.setFont(new Font("GameOver",0,50));
			jContentPaneGameOver = new JPanel();
			jContentPaneGameOver.setLayout(null);
			jContentPaneGameOver.add(getJButtonChooseMode(), null);
			jContentPaneGameOver.add(getJButtonOnceAgain(), null);
			jContentPaneGameOver.add(getJButtonHighscore(), null);
			jContentPaneGameOver.add(getJButtonMenu(), null);
			jContentPaneGameOver.add(jLabelGameOver, null);
		}
		return jContentPaneGameOver;
	}

	/**
	 * This method initializes jButtonChooseMode	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonChooseMode() {
		if (jButtonChooseMode == null) {
			jButtonChooseMode = new JButton();
			jButtonChooseMode.setBounds(new Rectangle(42, 106, 244, 66));
			jButtonChooseMode.setText("Choose Mode");
			jButtonChooseMode.setFont(new Font("ChooseMode",0, 40));
		}
		return jButtonChooseMode;
	}

	/**
	 * This method initializes jButtonOnceAgain	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonOnceAgain() {
		if (jButtonOnceAgain == null) {
			jButtonOnceAgain = new JButton();
			jButtonOnceAgain.setBounds(new Rectangle(354, 115, 217, 50));
			jButtonOnceAgain.setText("Try again");
		}
		return jButtonOnceAgain;
	}

	/**
	 * This method initializes jButtonHighscore	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonHighscore() {
		if (jButtonHighscore == null) {
			jButtonHighscore = new JButton();
			jButtonHighscore.setBounds(new Rectangle(59, 584, 206, 44));
			jButtonHighscore.setText("Highscore");
		}
		return jButtonHighscore;
	}

	/**
	 * This method initializes jButtonMenu	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonMenu() {
		if (jButtonMenu == null) {
			jButtonMenu = new JButton();
			jButtonMenu.setBounds(new Rectangle(362, 245, 222, 58));
			jButtonMenu.setText("Menu");
		}
		return jButtonMenu;
	}

}
