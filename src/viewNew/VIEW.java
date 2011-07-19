package viewNew;
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
	
	
	
	public void displayScene(int id)
	{
		   switch(id)
		   {
		   case 0: //Login
			   login.getJFrameLogin();
		   break;
		   
		   case 1: //Mainmenu
			   mainmenu.getJFrameMainMenu();
			   break;
			   
		   //case 2: //Logout
			 //  logout.getJFrameLogout();
			   //break;
			   
		   case 3: //Registration
			   registration.getJFrameRegistration();
			   break;
			   
		   case 4: //RegistrationSuccesfull
			   registrationSuccesful.getJFrameRegistrationSuccesful();
			   break;
			   
		   case 5: //Pause
			   pause.getJFrameBreak();
			   break;
			   
		   case 6: //Options
			   options.getJFrameOptions();
			   break;
			   
		   case 7: //Help
			   help.getJFrameHelp();
			   break;
			   
		   //case 8: //Gamemode
			 //  gamemode.getJFrameGameMode();
			   //break;

		   case 9: //Gameover
			   registration.getJFrameRegistration();
			   break;
			   
		   case 10: //Gamescreen
			   break;
		   }
	       
	}
	
	
	
	
	public char[] getValueForElement(String title)
	{
		if(title == "password")
		{
			return login.getPassword();
	    }
		else
		{
			return login.getUsername();
		}
	}
	 
}
