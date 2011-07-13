package view;


import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JTextField;
public class OPTIONS {

	private JFrame jFrameOptions = null;  //  @jve:decl-index=0:visual-constraint="22,14"
	private JPanel jContentPaneOptions = null;
	private JLabel jLabelOptions = null;
	private JButton jButtonBack = null;
	private JTextField jTextFieldTurnRight = null;
	private JTextField jTextFieldTurnLeft = null;
	private JTextField jTextFieldGoDownFaster = null;
	private JTextField jTextFieldPutDown = null;
	private JTextField jTextFieldPause = null;
	/**
	 * This method initializes jFrameOptions	
	 * 	
	 * @return javax.swing.JFrame	
	 */
	private JFrame getJFrameOptions() {
		if (jFrameOptions == null) {
			jFrameOptions = new JFrame();
			jFrameOptions.setSize(new Dimension(600, 700));
			jFrameOptions.setResizable(false);
			jFrameOptions.setContentPane(getJContentPaneOptions());
		}
		return jFrameOptions;
	}

	/**
	 * This method initializes jContentPaneOptions	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneOptions() {
		if (jContentPaneOptions == null) {
			jLabelOptions = new JLabel();
			jLabelOptions.setBounds(new Rectangle(263, 23, 59, 35));
			jLabelOptions.setText("Options");
			jContentPaneOptions = new JPanel();
			jContentPaneOptions.setLayout(null);
			jContentPaneOptions.add(jLabelOptions, null);
			jContentPaneOptions.add(getJButtonBack(), null);
			jContentPaneOptions.add(getJTextFieldTurnRight(), null);
			jContentPaneOptions.add(getJTextFieldTurnLeft(), null);
			jContentPaneOptions.add(getJTextFieldGoDownFaster(), null);
			jContentPaneOptions.add(getJTextFieldPutDown(), null);
			jContentPaneOptions.add(getJTextFieldPause(), null);
		}
		return jContentPaneOptions;
	}

	/**
	 * This method initializes jButtonBack	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButtonBack() {
		if (jButtonBack == null) {
			jButtonBack = new JButton();
			jButtonBack.setBounds(new Rectangle(476, 610, 92, 49));
			jButtonBack.setText("Back");
		}
		return jButtonBack;
	}

	/**
	 * This method initializes jTextFieldTurnRight	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTurnRight() {
		if (jTextFieldTurnRight == null) {
			jTextFieldTurnRight = new JTextField();
			jTextFieldTurnRight.setBounds(new Rectangle(249, 81, 143, 40));
			jTextFieldTurnRight.setText("turn right");
		}
		return jTextFieldTurnRight;
	}

	/**
	 * This method initializes jTextFieldTurnLeft	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldTurnLeft() {
		if (jTextFieldTurnLeft == null) {
			jTextFieldTurnLeft = new JTextField();
			jTextFieldTurnLeft.setBounds(new Rectangle(252, 142, 139, 34));
			jTextFieldTurnLeft.setText("turn left");
		}
		return jTextFieldTurnLeft;
	}

	/**
	 * This method initializes jTextFieldGoDownFaster	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldGoDownFaster() {
		if (jTextFieldGoDownFaster == null) {
			jTextFieldGoDownFaster = new JTextField();
			jTextFieldGoDownFaster.setBounds(new Rectangle(257, 194, 130, 42));
			jTextFieldGoDownFaster.setText("go down faster");
		}
		return jTextFieldGoDownFaster;
	}

	/**
	 * This method initializes jTextFieldPutDown	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPutDown() {
		if (jTextFieldPutDown == null) {
			jTextFieldPutDown = new JTextField();
			jTextFieldPutDown.setBounds(new Rectangle(256, 254, 135, 36));
			jTextFieldPutDown.setText("put down");
		}
		return jTextFieldPutDown;
	}

	/**
	 * This method initializes jTextFieldPause	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPause() {
		if (jTextFieldPause == null) {
			jTextFieldPause = new JTextField();
			jTextFieldPause.setBounds(new Rectangle(258, 315, 123, 41));
			jTextFieldPause.setText("pause");
		}
		return jTextFieldPause;
	}

}
