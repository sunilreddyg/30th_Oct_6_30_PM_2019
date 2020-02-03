package framework.Testng.DP.Excel_integration;

import org.testng.annotations.Test;

public class GetDp_Data 
{
  @Test(dataProvider="get_data",dataProviderClass=Excel_DataProvider_Intergration.class)
  public void Verify_Reg(String name, String Mobile, String email) 
  {
	  
  }
}
