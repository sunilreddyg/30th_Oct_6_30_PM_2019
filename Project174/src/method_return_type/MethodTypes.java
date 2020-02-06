package method_return_type;

import org.openqa.selenium.By;

public class MethodTypes 
{
	
	//Method without return type
	public void method1()
	{
		String name="MQ-DSNR";
		//Void method doesn't return any value
	}
	
	
	/*
	 * => Other void for all methods we should write return keyword at end of the method
	 * => Return value should match with method type
	 * => Finally it return value to methodname..
	 */
	
	
	
	//Method with return type
	public String method2()
	{
		String name="MQ-DSNR";
		return name;
	}
	
	//Method with return type
	public int method3(int a, int b)
	{
		int c=a+b;
		return c;
	}
	
	
	//Method with By return value
	public By Email_location()
	{
		return By.id("email");
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		//Creat object for class
		MethodTypes obj=new MethodTypes();
		
		//calling void method
		obj.method1();
		
		//Calling string return method
		String Inst_name=obj.method2();
		System.out.println("Method Return value is => "+Inst_name);

		//Calling int return method
		int total=obj.method3(100, 200);
		System.out.println("total value is => "+total);
	}

}
