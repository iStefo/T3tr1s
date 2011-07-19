package viewNew;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
public class REGISTRATION {

	private JFrame jFrameRegistration = null;  //  @jve:decl-index=0:visual-constraint="39,13"
	private JPanel jContentPaneRegistration = null;
	private JLabel jLabelUsername = null;
	private JLabel jLabelPassword = null;
	private JLabel jLabelRepeatPassword = null;
	private JLabel jLabelRegistration = null;
	private JLabel jLabelError = null;
	private JButton jButtonCreateAccount = null;
	private JButton jButtonBack = null;
	private JPasswordField jPasswordFieldPassword = null;
	private JPasswordField jPasswordFieldRepeatPassword = null;
	private JTextField jTextFieldUsername = null;
	ImageIcon backgroundII = new ImageIcon("J:\\T3tr1s\\Pictures\\HintergrundTetris.png");  //  @jve:decl-index=0:
    private JLabel backgroundLabel = null;

	/**
	 * This method initializes jFrameRegistration	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	public JFrame getJFrameRegistration() {
		if (jFrameRegistration == null) {
			jFrameRegistration = new JFrame();
			jFrameRegistration.setSize(new Dimension(606, 733));
			jFrameRegistration.setContentPane(getJContentPaneRegistration());
			jFrameRegistration.setTitle("Registration");
			jFrameRegistration.setResizable(false);
		}
		return jFrameRegistration;
	}

	/**
	 * This method initializes jContentPaneRegistration	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneRegistration() {
		if (jContentPaneRegistration == null) {
			jLabelError = new JLabel();
			jLabelError.setBounds(new Rectangle(149, 264, 298, 104));
			jLabelError.setText("\"Hier erscheint die Fehlermeldung bei falschen Passwort oÄ\"");
			jLabelRegistration = new JLabel();
			jLabelRegistration.setBounds(new Rectangle(220, 2, 157, 53));
			jLabelRegistration.setText("Registration");
			jLabelRepeatPassword = new JLabel();
			jLabelRepeatPassword.setBounds(new Rectangle(16, 179, 125, 41));
			jLabelRepeatPassword.setText("Repeat Password");
			jLabelPassword = new JLabel();
			jLabelPassword.setBounds(new Rectangle(15, 138, 124, 36));
			jLabelPassword.setText("Password");
			jLabelUsername = new JLabel();
			jLabelUsername.setBounds(new Rectangle(16, 90, 115, 43));
			jLabelUsername.setText("username");
			jContentPaneRegistration = new JPanel();
			jContentPaneRegistration.setLayout(null);
			jContentPaneRegistration.add(jLabelUsername, null);
			jContentPaneRegistration.add(jLabelPassword, null);
			jContentPaneRegistration.add(jLabelRepeatPassword, null);
			jContentPaneRegistration.add(jLabelRegistration, null);
			jContentPaneRegistration.add(jLabelError, null);
			jContentPaneRegistration.add(getJButtonCreateAccount(), null);
			jContentPaneRegistration.add(getJButtonBack(), null);
			jContentPaneRegistration.add(getJPasswordFieldPassword(), null);
			jContentPaneRegistration.add(getJPasswordFieldRepeatPassword(), null);
			jContentPaneRegistration.add(getJTextFieldUsername(), null);
			
			backgroundLabel = new JLabel(backgroundII);
			backgroundLabel.setBounds(new Rectangle(0, 0, 600, 700));
			jContentPaneRegistration.add(backgroundLabel, null);
			backgroundLabel.setVisible(true);
		}
		return jContentPaneRegistration;
	}

	/**
	 * This method initializes jButtonCreateAccount	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonCreateAccount() {
		if (jButtonCreateAccount == null) {
			jButtonCreateAccount = new JButton();
			jButtonCreateAccount.setBounds(new Rectangle(343, 521, 153, 63));
			jButtonCreateAccount.setText("Create Account");
		}
		return jButtonCreateAccount;
	}

	/**
	 * This method initializes jButtonBack	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBack() {
		if (jButtonBack == null) {
			jButtonBack = new JButton();
			jButtonBack.setBounds(new Rectangle(160, 534, 101, 61));
			jButtonBack.setText("Back");
		}
		return jButtonBack;
	}

	/**
	 * This method initializes jPasswordFieldPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJPasswordFieldPassword() {
		if (jPasswordFieldPassword == null) {
			jPasswordFieldPassword = new JPasswordField();
			jPasswordFieldPassword.setBounds(new Rectangle(182, 140, 144, 31));
		}
		return jPasswordFieldPassword;
	}

	/**
	 * This method initializes jPasswordFieldRepeatPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJPasswordFieldRepeatPassword() {
		if (jPasswordFieldRepeatPassword == null) {
			jPasswordFieldRepeatPassword = new JPasswordField();
			jPasswordFieldRepeatPassword.setBounds(new Rectangle(181, 180, 143, 26));
		}
		return jPasswordFieldRepeatPassword;
	}

	/**
	 * This method initializes jTextFieldUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldUsername() {
		if (jTextFieldUsername == null) {
			jTextFieldUsername = new JTextField();
			jTextFieldUsername.setBounds(new Rectangle(188, 71, 229, 23));
		}
		return jTextFieldUsername;
	}

}
