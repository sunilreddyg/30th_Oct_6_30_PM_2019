package method_parameters;

import org.testng.annotations.Test;

import pageobjects.PageFactory.With_Constructor.CT_Flights;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Run_with_page_objects extends Repository
{
  @Test
  public void TextBox_Entry_with_pagefactoryClass() 
  {
	  CT_Flights flights=new CT_Flights(driver);
	  Enter_text(flights.From_EB, "HYD");
  }
  
  
  @BeforeClass
  public void beforeClass() 
  {
	  launch_browser("chrome");
	  load_app("http://cleartrip.com");
	  set_timeout(20);
  }

  @AfterClass
  public void afterClass() throws Exception 
  {
	  Thread.sleep(5000);
	  driver.close();
  }

}
