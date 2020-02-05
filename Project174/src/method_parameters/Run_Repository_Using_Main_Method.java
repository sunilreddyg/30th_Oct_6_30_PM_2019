package method_parameters;

import org.openqa.selenium.By;

public class Run_Repository_Using_Main_Method {

	public static void main(String[] args) 
	{
		
		Repository obj=new Repository();
		obj.launch_browser("chrome");
		obj.load_app("http://facebook.com");
		obj.set_timeout(20);
		
		obj.Enter_text("//input[@id='email']", "9030248855");
		obj.Enter_text("//input[@id='pass']", "Hello12345");
		
		obj.Enter_text(By.name("firstname"), "Avinash");
		obj.Enter_text(By.cssSelector("#u_0_o"), "krishna");
		
		
		obj.select_dropdown("//select[@id='day']", "16");
		obj.select_dropdown(By.id("month"), "May");
	}

}
