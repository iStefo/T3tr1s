package View;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
public class Login {

	private JFrame jFrameLogin = null;  //  @jve:decl-index=0:visual-constraint="39,30"
	private JPanel jContentPaneLogin = null;
	private JLabel jLabel = null;  //  @jve:decl-index=0:visual-constraint="246,22"
	private JLabel jLabelLogin = null;
	private JTextField jTextFieldUsername = null;
	private JLabel jLabelUsername = null;
	private JLabel jLabelPassword = null;
	private JPasswordField jPasswordFieldPassword = null;
	private JButton jButtonLogin = null;
	private JButton jButtonTestGame = null;
	private JButton jButtonRegistration = null;
	/**
	 * This method initializes jFrameLogin	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameLogin() {
		if (jFrameLogin == null) {
			jFrameLogin = new JFrame();
			jFrameLogin.setSize(new Dimension(600, 700));
			jFrameLogin.setContentPane(getJContentPaneLogin());
			jFrameLogin.setResizable(false);
		}
		return jFrameLogin;
	}

	/**
	 * This method initializes jContentPaneLogin	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneLogin() {
		if (jContentPaneLogin == null) {
			jLabelPassword = new JLabel();
			jLabelPassword.setBounds(new Rectangle(66, 140, 138, 36));
			jLabelPassword.setText("Password");
			jLabelUsername = new JLabel();
			jLabelUsername.setBounds(new Rectangle(70, 91, 135, 35));
			jLabelUsername.setText("Username");
			jLabelLogin = new JLabel();
			jLabelLogin.setBounds(new Rectangle(122, 14, 282, 36));
			jLabelLogin.setText("Login");
			jContentPaneLogin = new JPanel();
			jContentPaneLogin.setLayout(null);
			jContentPaneLogin.add(jLabelLogin, null);
			jContentPaneLogin.add(getJTextFieldUsername(), null);
			jContentPaneLogin.add(jLabelUsername, null);
			jContentPaneLogin.add(jLabelPassword, null);
			jContentPaneLogin.add(getJPasswordFieldPassword(), null);
			jContentPaneLogin.add(getJButtonLogin(), null);
			jContentPaneLogin.add(getJButtonTestGame(), null);
			jContentPaneLogin.add(getJButtonRegistration(), null);
		}
		return jContentPaneLogin;
	}

	/**
	 * This method initializes jTextFieldUsername	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldUsername() {
		if (jTextFieldUsername == null) {
			jTextFieldUsername = new JTextField();
			jTextFieldUsername.setBounds(new Rectangle(262, 94, 144, 32));
		}
		return jTextFieldUsername;
	}

	/**
	 * This method initializes jPasswordFieldPassword	
	 * 	
	 * @return javax.swing.JPasswordField	
	 */
	private JPasswordField getJPasswordFieldPassword() {
		if (jPasswordFieldPassword == null) {
			jPasswordFieldPassword = new JPasswordField();
			jPasswordFieldPassword.setBounds(new Rectangle(264, 145, 144, 24));
		}
		return jPasswordFieldPassword;
	}

	/**
	 * This method initializes jButtonLogin	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonLogin() {
		if (jButtonLogin == null) {
			jButtonLogin = new JButton();
			jButtonLogin.setBounds(new Rectangle(54, 191, 166, 29));
			jButtonLogin.setText("Login");
		}
		return jButtonLogin;
	}

	/**
	 * This method initializes jButtonTestGame	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonTestGame() {
		if (jButtonTestGame == null) {
			jButtonTestGame = new JButton();
			jButtonTestGame.setBounds(new Rectangle(259, 183, 117, 36));
			jButtonTestGame.setText("Test Game");
		}
		return jButtonTestGame;
	}

	/**
	 * This method initializes jButtonRegistration	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonRegistration() {
		if (jButtonRegistration == null) {
			jButtonRegistration = new JButton();
			jButtonRegistration.setBounds(new Rectangle(387, 183, 165, 35));
			jButtonRegistration.setText("Registration");
		}
		return jButtonRegistration;
	}

	/**
	 * This method initializes jLabel	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	

}
