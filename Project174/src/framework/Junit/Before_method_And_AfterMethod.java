package framework.Junit;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Before_method_And_AfterMethod {



	@Test//invoke method to run without object creation and main method.
	void tc001() 
	{
		System.out.println("tc001 executed successfull");
	}
	
	@Test//invoke method to run without object creation and main method.
	void tc002() 
	{
		System.out.println("tc002 executed successfull");
	}

	
	@Test//invoke method to run without object creation and main method.
	void tc003() 
	{
		System.out.println("tc003 executed successfull");
	}
	
	
	@BeforeEach//Invoke every @Test annotated method before
	void setUp() throws Exception 
	{
		System.out.println("preconditionf or method");
	}

	@AfterEach//Invoke every @Test annotated method after
	void tearDown() throws Exception 
	{
		System.out.println("postcondition for method"+"\n");
	}
	
}
