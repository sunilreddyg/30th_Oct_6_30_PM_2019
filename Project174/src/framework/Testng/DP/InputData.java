package framework.Testng.DP;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class InputData 
{
	
	
	@Test(dataProvider="User_login")
	public void Verify_user_login(String UID,String PWD)
	{
		
	}
	
	@Test(dataProvider="Prduct_info")
	public void Verify_Product_Prices(String Pname, double price, int Count)
	{
		
	}
	
	
	//To get dataprovier annoated data from diff class.
	@Test(dataProvider="dp",dataProviderClass=Example_DataProvider.class)
	public void sample(int a, String b)
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
	  public Object[][] Prduct_info() 
	  {
	    return new Object[][] 
	    {
	      new Object[] { "product1", 100.00 , 1 },
	      new Object[] { "product2", 200.00 , 2 },
	      new Object[] { "product3", 300.00 , 3 },
	    };
	  }

}
