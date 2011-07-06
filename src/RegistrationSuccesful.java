

import javax.swing.JFrame;
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

	/**
	 * This method initializes jFrameRegistrationSuccesful	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameRegistrationSuccesful() {
		if (jFrameRegistrationSuccesful == null) {
			jFrameRegistrationSuccesful = new JFrame();
			jFrameRegistrationSuccesful.setSize(new Dimension(600, 700));
			jFrameRegistrationSuccesful.setContentPane(getJContentPaneRegistrationSuccesful());
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
