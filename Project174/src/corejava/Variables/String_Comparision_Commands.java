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
		
		
	}

}
