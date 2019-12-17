package corejava.Variables;

public class VariableTypes 
{
	String email="qadarshan@gmail.com";    //Instant varaible
	final String add="#301,Chaitanyapuri"; //Instant variable with final keword
	
	static String phone="9030248855";      //Class variable
	
	public void method1()
	{
		String name="Webdriver";  //Local variable
	}
	
	
	public static void main(String args[])
	{
		/*
		 * Calling Instant Variables;-->
		 * 			new Classname().VariableName();
		 */
		String Return_email=new VariableTypes().email;
		System.out.println(Return_email);
		
		//Instant variable Accept changes at runtime
		String New_Email=new VariableTypes().email="info.dsnr@gmail.com";
		System.out.println(New_Email);
		
		/*
		 * calling Class variable;-->
		 * 		
		 * 		Classname.variableName;
		 */
		String My_phone_num=VariableTypes.phone;
		System.out.println(My_phone_num);
		
		
		
	}

}
