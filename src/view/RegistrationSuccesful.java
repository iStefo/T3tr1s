package view;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JTextField;
import java.awt.Rectangle;
import javax.swing.JButton;
public class RegistrationSuccesful {

	private JFrame jFrameRegistrationSuccesful = null;  //  @jve:decl-index=0:visual-constraint="42,11"
	private JPanel jContentPaneRegistrationSuccesful = null;
	private JTextField jTextFieldRegistrationSuccesful = null;
	private JButton jButtonNext = null;
	ImageIcon backgroundII = new ImageIcon("J:\\T3tr1s\\Pictures\\HintergrundTetris.png");  //  @jve:decl-index=0:
    private JLabel backgroundLabel = null;
	/**
	 * This method initializes jFrameRegistrationSuccesful	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public JFrame getJFrameRegistrationSuccesful() {
		if (jFrameRegistrationSuccesful == null) {
			jFrameRegistrationSuccesful = new JFrame();
			jFrameRegistrationSuccesful.setSize(new Dimension(606, 733));
			jFrameRegistrationSuccesful.setContentPane(getJContentPaneRegistrationSuccesful());
			jFrameRegistrationSuccesful.setResizable(false);
		}
		return jFrameRegistrationSuccesful;
	}

	/**
	 * This method initializes jContentPaneRegistrationSuccesful	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneRegistrationSuccesful() {
		if (jContentPaneRegistrationSuccesful == null) {
			jContentPaneRegistrationSuccesful = new JPanel();
			jContentPaneRegistrationSuccesful.setLayout(null);
			jContentPaneRegistrationSuccesful.add(getJTextFieldRegistrationSuccesful(), null);
			jContentPaneRegistrationSuccesful.add(getJButtonNext(), null);
			
			backgroundLabel = new JLabel(backgroundII);
			backgroundLabel.setBounds(new Rectangle(0, 0, 600, 700));
			jContentPaneRegistrationSuccesful.add(backgroundLabel, null);
			backgroundLabel.setVisible(true);
		}
		return jContentPaneRegistrationSuccesful;
	}

	/**
	 * This method initializes jTextFieldRegistrationSuccesful	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldRegistrationSuccesful() {
		if (jTextFieldRegistrationSuccesful == null) {
			jTextFieldRegistrationSuccesful = new JTextField();
			jTextFieldRegistrationSuccesful.setBounds(new Rectangle(118, 14, 306, 52));
			jTextFieldRegistrationSuccesful.setText("Registration Succesful");
		}
		return jTextFieldRegistrationSuccesful;
	}

	/**
	 * This method initializes jButtonNext	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonNext() {
		if (jButtonNext == null) {
			jButtonNext = new JButton();
			jButtonNext.setBounds(new Rectangle(172, 136, 205, 115));
			jButtonNext.setText("Next");
		}
		return jButtonNext;
	}

}
