package corejava.Arrays;

public class Double_Dimensional_Array {

	public static void main(String[] args) 
	{
		
		/*
		 * Note:-->
		 * 		Double dimensional array store date into tabular format..
		 */
		
		
		//Static Double dimensional array
		String data[][]=new String[3][2];
		
		//First row data
		data[0][0]="Arun";
		data[0][1]="Pwd1";
		
		data[1][0]="Arjun";
		data[1][1]="pwd2";
		
		data[2][0]="kranthi";
		data[2][1]="pwd3";
		
		System.out.println("From Table get firstrow and zero cell data => "+data[1][0]);
		
		
		
		/*
		 * Runtime Double dimensional array
		 */
		 String userinfo[][]=
			 				{
			 						{"rajesh","rajesh@mq.com"},
			 						{"akil","akil@mq.com"},
			 						{"suresh","suresh@mq.com"},
			 						{"harish","Harish@mq.com"},
			 						
			 				};
		
		System.out.println("Runtime data => "+userinfo[2][0]);
		
		
		//Get array size
		int count=userinfo.length;
		System.out.println("array count is => "+count);

	}

}
