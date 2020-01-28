package framework.Junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeClass_And_AfterClass 
{


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
	
	
	@BeforeAll //Invoke before executino of first @Test annotated method
	static void setUpBeforeClass() throws Exception 
	{
		System.out.println("Precondition for class");
	}

	@AfterAll//Invoke after execution of last @Test annotated method
	static void tearDownAfterClass() throws Exception 
	{
		System.out.println("post condition for class");
	}



}
