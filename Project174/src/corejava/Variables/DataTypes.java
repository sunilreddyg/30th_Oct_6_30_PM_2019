package corejava.Variables;

public class DataTypes {

	public static void main(String[] args) 
	{
		
		
		/*
		 * int:--> is a Numeric Datatype Accept only numbes to store,
		 * 			And default value of is  [0] -zero
		 * 			
		 */
		
		 int a=100000;
		 int b=200000;
		 int c=a+b;
		 
		 System.out.println("sum value is => "+c);
		 
		 
		 /*
		  * boolean:-->
		  * 		boolean accept true/false values to store,
		  * 		And boolean default value is false.
		  */
		 boolean flag=true;
		 System.out.println("flag value is => "+flag);
		 
		 
		 
		 /*
		  * Double:-->
		  * 		Double accept decimal values to store.
		  * 		Default value is null.
		  */
		 double val=10002.123545;
		 System.out.println("value is => "+val);
		 
		 
		 /*
		  * Char:--> Any single characters to store
		  */
		 char group='A';
		 System.out.println("Single characters is => "+group);
		 
		 
		 /*
		  * String:-->
		  * 		Accept set of and sequence of characters to store.
		  */
		 String name="mqdsnr";
		 String address="#301, Sreemanrama towers";
		 String Area="Chaitanyapuri";
		 String Zipcode="500064";
		 String Mobile="9030248855";
		 
		 System.out.println(name+"   "+address+"   "+Area+"   "+Zipcode+"   "+Mobile);

	}

}
