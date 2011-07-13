package View;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JButton;
public class BREAK {

	private JFrame jFrameBreak = null;  //  @jve:decl-index=0:visual-constraint="19,4"
	private JPanel jContentPaneBreak = null;
	private JTextField jTextFieldBreak = null;
	private JButton jButtonContinue = null;
	private JButton jButtonHelp = null;
	private JButton jButtonMainMenue = null;

	/**
	 * This method initializes jFrameBreak	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameBreak() {
		if (jFrameBreak == null) {
			jFrameBreak = new JFrame();
			jFrameBreak.setSize(new Dimension(600, 700));
			jFrameBreak.setContentPane(getJContentPaneBreak());
			jFrameBreak.setResizable(false);
		}
		return jFrameBreak;
	}

	/**
	 * This method initializes jContentPaneBreak	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneBreak() {
		if (jContentPaneBreak == null) {
			jContentPaneBreak = new JPanel();
			jContentPaneBreak.setLayout(null);
			jContentPaneBreak.add(getJTextFieldBreak(), null);
			jContentPaneBreak.add(getJButtonContinue(), null);
			jContentPaneBreak.add(getJButtonHelp(), null);
			jContentPaneBreak.add(getJButtonMainMenue(), null);
		}
		return jContentPaneBreak;
	}

	/**
	 * This method initializes jTextFieldBreak	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldBreak() {
		if (jTextFieldBreak == null) {
			jTextFieldBreak = new JTextField();
			jTextFieldBreak.setBounds(new Rectangle(223, 14, 125, 26));
			jTextFieldBreak.setText("Break");
		}
		return jTextFieldBreak;
	}

	/**
	 * This method initializes jButtonContinue	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonContinue() {
		if (jButtonContinue == null) {
			jButtonContinue = new JButton();
			jButtonContinue.setBounds(new Rectangle(132, 73, 132, 42));
			jButtonContinue.setText("Continue");
		}
		return jButtonContinue;
	}

	/**
	 * This method initializes jButtonHelp	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonHelp() {
		if (jButtonHelp == null) {
			jButtonHelp = new JButton();
			jButtonHelp.setBounds(new Rectangle(290, 74, 161, 42));
			jButtonHelp.setText("Help");
		}
		return jButtonHelp;
	}

	/**
	 * This method initializes jButtonMainMenue	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonMainMenue() {
		if (jButtonMainMenue == null) {
			jButtonMainMenue = new JButton();
			jButtonMainMenue.setBounds(new Rectangle(127, 128, 279, 78));
			jButtonMainMenue.setText("Main Menue");
		}
		return jButtonMainMenue;
	}

}
