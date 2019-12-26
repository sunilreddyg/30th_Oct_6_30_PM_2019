package robot_window_interfaces;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class CopyString_To_Notepad_File {

	public static void main(String[] args) throws Exception 
	{	
		//Launch Notepad file at runtime.
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(10000);
		
		//Create object for robot class..
		Robot robot=new Robot();
		robot.setAutoDelay(500); //It Delay 500 ms before each action
		
		
		String text="Robot is a java automation framework from  [AWT]"
				+ "Abstarct window toolkit";
		
		
		//Selecting String before add to clipboard
		StringSelection Stext=new StringSelection(text);
		//Enable system default clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set copied content to clipboard
		clipboard.setContents(Stext, Stext);
		
		
		
		//use keyboard shortcut Control+V to paste copied text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Any Down keys after pressing we must release
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		//use keyboard shortcut Control+s to save notepad file
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_S);
		
		//Any Down keys after pressing we must release
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		
		String path="C:\\Users\\Administrator\\git\\30th_Oct_6_30_PM_2019\\Project174\\src"
				+ "\\robot_window_interfaces\\robotsample.txt";
		
		//Copying file path to clipboard
		StringSelection Spath=new StringSelection(path);
		clipboard.setContents(Spath, Spath);  //Set content to clipboard
		
		
		//use keyboard shortcut Control+V to paste copied text
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Press Enter keyboard shortcut
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		//Any Down keys after pressing we must release
		robot.keyRelease(KeyEvent.VK_CONTROL);
		

				
				

	}

}
