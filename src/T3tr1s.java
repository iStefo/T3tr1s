import java.awt.*;
import javax.swing.*;

public class T3tr1s extends JApplet {
	  /**
	 * 
	 */
	//private static final long serialVersionUID = 0001;	// Eclipse wants that...

	public void init() {
		/*//WindowUtilities.setNativeLookAndFeel();
		Container content = getContentPane();
		content.setBackground(Color.white);
		content.setLayout(new FlowLayout()); 
		content.add(new JButton("Button 2"));
		content.add(new JButton("Button 2"));
		content.add(new JButton("Button 3"));

		// we want to open an extra window?
		//1. Create the frame.
		JFrame frame = new JFrame("FrameDemo");

		//2. Optional: What happens when the frame closes?
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//3. Create components and put them in the frame.
		//...create emptyLabel...
		frame.getContentPane().add(new JButton("Huhu"), BorderLayout.CENTER);

		//4. Size the frame.
		frame.pack();

		//5. Show it.
		frame.setVisible(true);*/
		Mainwindow window;
		window = new Mainwindow();
		window.getTetrisWindow();
	}
}