package framework.Testng.DP;

import org.testng.annotations.Test;

public class Get_Test_Data_Using_Dataprovider_From_Diff_Class {

	//Provide class name to access dataprovider data in diff class.
	@Test(dataProvider="Product_info",dataProviderClass=InputData.class)
	public void Verify_products(String name,double price,int count)
	{
		
	}
	
}
