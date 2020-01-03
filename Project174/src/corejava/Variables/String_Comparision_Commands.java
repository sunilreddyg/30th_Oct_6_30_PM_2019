package corejava.Variables;

public class String_Comparision_Commands {

	public static void main(String[] args) 
	{
		
		
		/*
		 * String:-->
		 * 			String is not only datatype and also called as class.
		 * 			Because String contains set of events [Methods] to 
		 * 			validate store characters and behaviours.
		 */
		
		
		/*
		 * Equals:-->
		 * 		Method verify equal comparison between two strings,
		 * 		And return boolean value true/false.
		 * 		   => Comparison is case sensitive.
		 */
		
		String Exp_result="Account Created";
		String Act_result="account created";
		
		boolean flag=Act_result.equals(Exp_result);
		System.out.println("String equal comparision is => "+flag);

		/*
		 * EqualIgnoreCase:-->
		 * 		Method verify equalIgnorecase comparison between two strings,
		 * 		And return boolean value true/false.
		 * 		   => Comparison is not case sensitive.
		 */
		boolean flag1=Act_result.equalsIgnoreCase(Exp_result);
		System.out.println("Equal ingorecase comparision is => "+flag1);
		
		/*
		 * Contains:-->
		 * 		Method verify paritla characters available at main String.
		 */
		String Status="Account 100 created successfull";
		boolean flag2=Status.contains("100");
		System.out.println("Partial characters available status is => "+flag2);
		
		
		/*
		 * subString:-->
		 * 			Method get sub String from main string using
		 * 			Start and End index numbers.
		 */
		String Account_num="1234555512348888";
		//Get Sub string using begin index numbers
		String Act_last_digits=Account_num.substring(12);
		System.out.println("Account number from 12 th index number is => "+Act_last_digits);
		
		//Get substring using begin and end index number
		String Act_Middle_digits=Account_num.substring(4, 8);
		System.out.println("Account number from 4th index to 8th index is => "+Act_Middle_digits);
		
		
		/*
		 * length:-->
		 * 		Method return count of number of characters available at
		 * 		string.
		 */
		String Mobile="9030248855";
		int len=Mobile.length();
		System.out.println("Mobile number available in characters is => "+len);
		
		
		/*
		 * trim:-->
		 * 			Method trim extra space characters available
		 * 			at string.
		 */
		String Zipcode="    500064   ";
		//Before trim lenth of zipcode is
		System.out.println("Before trim => "+Zipcode.length());
		
		//Trim Extra spaces available at right side of string and left side of string..
		String New_Zip=Zipcode.trim();
		System.out.println("After trim is => "+New_Zip.length());
		
		
		/*
		 * isEmpty:-->
		 * 			Method verify string empty status and retur
		 * 			boolean value true/false.
		 * 			=> Return true when string is empty
		 * 			=> Return false when string is not empty
		 */
		String var="";
		String var1="MQ";
		System.out.println("Var empty status is => "+var.isEmpty());
		System.out.println("var1 empty status is => "+var1.isEmpty());
		
		
		
		
		
	}

}
