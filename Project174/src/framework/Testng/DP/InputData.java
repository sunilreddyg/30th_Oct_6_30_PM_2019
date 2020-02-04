package framework.Testng.DP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InputData 
{
	
	
	@Test(dataProvider="User_login",enabled=false)
	public void Verify_user_login(String UID,String PWD)
	{
		
	}
	
	@Test(dataProvider="Product_info")
	public void Verify_Product_Prices(String Pname, double price, int Count)
	{
		
	}
	
	
	
	@DataProvider
	public String[][] User_login()
	{
		String data[][]=
			{
					{"user1","pwd1"},
					{"user2","pwd2"},
					{"user3","pwd3"},
			};
		
		return data;
		
	}
	
	 @DataProvider
	  public Object[][] Product_info() 
	  {
	    return new Object[][] 
	    {
	      new Object[] { "product1", 100.00 , 1 },
	      new Object[] { "product2", 200.00 , 2 },
	      new Object[] { "product3", 300.00 , 3 },
	    };
	  }

}
