package corejava.Variables.PageObjects;

import org.openqa.selenium.By;

public class FB_Home_Loc
{
	
	public static By FB_Signin_UID=By.xpath("//input[@name='email']");
	public static By Fb_Signin_PWD=By.xpath("//input[contains(@id,'pass')]");
	public static By Fb_Signin_Login_btn=By.xpath("//input[@value='Log In']");
}
