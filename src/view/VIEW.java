package view;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class VIEW {

	private JFrame jFrame;
	private JPanel jContentPane;
	private JLabel background;
	BREAK pause;
	GAMEMODE gamemode;
	GAMEOVER gameover;
	HELP help;
	LOGIN login;
	MAINMENU mainmenu;
	OPTIONS options;
	REGISTRATION registration;
	RegistrationSuccesful registrationSuccesful;
	
	ImageIcon backgroundPicture = new ImageIcon("J:\\T3tr1s\\Pictures\\HintergrundTetris.png");
	
	public VIEW()
	{
		
	}
	
	public void displayScene(int id)
	{
		   switch(id)
		   {
		   case 0: //Login
			   
		   break;
		   
		   case 1: //Mainmenu
			   break;
			   
		   case 2: //Logout
			   break;
			   
		   case 3: //Registration
			   break;
			   
		   case 4: //RegistrationSuccesfull
			   break;
			   
		   case 5: //Pause
			   break;
			   
		   case 6: //Options
			   break;
			   
		   case 7: //Help
			   break;
			   
		   case 8: //Gamemode
			   break;
			   
		   case 9: //Gameover
			   break;
			   
		   case 10: //Gamescreen
			   break;
		   }
	       
	}
	
	
	
	
	public String getValueForElement(String title)
	{
		
	}
	 
}
