

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
public class Login {

	private JFrame jFrameLogin = null;  //  @jve:decl-index=0:visual-constraint="39,30"
	private JPanel jContentPaneLogin = null;
	private JLabel jLabel = null;  //  @jve:decl-index=0:visual-constraint="246,22"
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
			jContentPaneLogin = new JPanel();
			jContentPaneLogin.setLayout(null);
		}
		return jContentPaneLogin;
	}

	/**
	 * This method initializes jLabel	
	 * 	
	 * @return javax.swing.JLabel	
	 */
	

}
