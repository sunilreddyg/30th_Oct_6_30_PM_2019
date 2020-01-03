package corejava.Loops;

public class For_Loop 
{

	public static void main(String[] args) 
	{
		
		//Example:--> Print numbers from 1 to 10
		for (int i = 1; i <= 10; i++) 
		{
			System.out.println(i);
		}
		
		//Print number 10 to 1 using decrement
		for (int j = 10; j >=1 ; j--) 
		{
			System.out.println(j+" => D");
		}
		
		//Conduct Sum between 1 to 100
		int sum=0;
		for (int i = 1; i <= 100; i++) 
		{
			sum=sum+i;
			
		}
		System.out.println("total value is => "+sum);
				
		
		//How to reverse a string
		String toolname="webdriver";
		char[] c=toolname.toCharArray();
		
		for (int i = c.length-1; i >=0; i--) 
		{
			char ch=toolname.charAt(i);
			System.out.print(ch);
		}
		
		System.out.println("\n");
		
		
		//Print all array values
		String tools[]= {"IDE","RC","WD","GRID","APPIUM"};
		for (int i = 0; i < tools.length; i++) 
		{
			System.out.println(tools[i]);
		}
		
		
		
		
		//Check given string is palindrome...
		//How to reverse a string
		String rstr="";
		
		String str="SIS";
		char[] chr=str.toCharArray();
				
		for (int i = chr.length-1; i >=0; i--) 
		{
			rstr=rstr+str.charAt(i);
	
		}
		
		if(str.equals(rstr))
		{
			System.out.println("Given string is palandrome");
		}
		else
		{
			System.out.println("given string in not palandrome");
		}
				
		
	}

}
