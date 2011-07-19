package view;


import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JLabel;
import java.awt.Rectangle;
import javax.swing.JTextArea;
public class HELP {

	private JFrame jFrameHelp = null;  //  @jve:decl-index=0:visual-constraint="42,20"
	private JPanel jContentPaneHelp = null;
	private JLabel jLabelHelp = null;
	private JTextArea jTextAreaClassic = null;
	private JTextArea jTextAreaTimeWarp = null;
	ImageIcon backgroundII = new ImageIcon("J:\\T3tr1s\\Pictures\\HintergrundTetris.png");  //  @jve:decl-index=0:
    private JLabel backgroundLabel = null;
    
	public void HELP() {
		getJFrameHelp();
	}
	
	public JFrame getJFrameHelp() {
		if (jFrameHelp == null) {
			jFrameHelp = new JFrame();
			jFrameHelp.setSize(new Dimension(606, 733));
			jFrameHelp.setContentPane(getJContentPaneHelp());
		}
		return jFrameHelp;
	}

	/**
	 * This method initializes jContentPaneHelp	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJContentPaneHelp() {
		if (jContentPaneHelp == null) {
			jLabelHelp = new JLabel();
			jLabelHelp.setBounds(new Rectangle(154, 15, 293, 62));
			jLabelHelp.setText("Help");
			jContentPaneHelp = new JPanel();
			jContentPaneHelp.setLayout(null);
			jContentPaneHelp.add(jLabelHelp, null);
			jContentPaneHelp.add(getJTextAreaClassic(), null);
			jContentPaneHelp.add(getJTextAreaTimeWarp(), null);
			
			backgroundLabel = new JLabel(backgroundII);
			backgroundLabel.setBounds(new Rectangle(0, 0, 600, 700));
			jContentPaneHelp.add(backgroundLabel, null);
			backgroundLabel.setVisible(true);
		}
		return jContentPaneHelp;
	}

	/**
	 * This method initializes jTextAreaClassic	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaClassic() {
		if (jTextAreaClassic == null) {
			jTextAreaClassic = new JTextArea();
			jTextAreaClassic.setBounds(new Rectangle(94, 117, 400, 166));
			jTextAreaClassic.setText("");
		}
		return jTextAreaClassic;
	}

	/**
	 * This method initializes jTextAreaTimeWarp	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	private JTextArea getJTextAreaTimeWarp() {
		if (jTextAreaTimeWarp == null) {
			jTextAreaTimeWarp = new JTextArea();
			jTextAreaTimeWarp.setBounds(new Rectangle(94, 346, 405, 159));
			jTextAreaTimeWarp.setText("hallo ich schreibe gerade irgendeinen mist, weil ich schauen muss, wie ich einen zeilenumbruch mache");
		}
		return jTextAreaTimeWarp;
	}

}
