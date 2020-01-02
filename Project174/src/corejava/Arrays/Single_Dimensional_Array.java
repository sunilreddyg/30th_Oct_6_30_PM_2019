package corejava.Arrays;

public class Single_Dimensional_Array 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Arrays:-->
		 * 		Arrays are list of variables which we
		 * 		refer to store into single reference variable.
		 * 		
		 * 		=> Array accept only similar values to store.
		 * 
		 * 		1. Static Array
		 * 		2. Runtime Array
		 */
		
		/*
		 * 1. Static Array:-->
		 * 			=> Static Array contains fixed boundaries.
		 * 			=> During static array declaration time, Programmer
		 * 				should declare fixed boundaries and then store
		 * 				values to array w.r.t with in range.
		 */
		
		
		//variable is a temporary location to store any single value..
		String variable="WebDriver";
		System.out.println("Variable value is => "+variable);
		
	
		//static Array initiation
		String arr[]=new String[4];
		//Adding Data to Static array...
		arr[0]="IDE";
		arr[1]="WD";
		arr[2]="GRID";
		arr[3]="Appium";

		//Retrieve data from static array...
		System.out.println("Array second index value is => "+arr[2]);
		
	
		
		/*
		 * Runtime Array:-->
		 * 			=> During this array programmer store set of
		 * 				value without defining any boundaries.
		 * 			=> This array store dynamic range of values..
		 * 			=> During runtime array index value organize
		 * 				it self.
		 */
		String browsers[]= {"chrome","firefox","ie","safari","opera"};
		System.out.println("Runtime array second index value is => "+browsers[2]);
		
		
		//Integer runtime array
		int num[]= {100,200,300,400,500,600};
		System.out.println("Second index number value is => "+num[3]);
		
		
		
		/*
		 * Split:-->
		 * 		=> method belongs to String class, it can split
		 * 			chracters using delimeter.
		 */
		
		String email="sunil@gmail.com";
		String new_email[]=email.split("@");
		System.out.println(new_email[0]+"    "+new_email[1]);
		
		
		String mobile="+91-90302040506";
		String new_mobile[]=mobile.split("-");
		System.out.println(new_mobile[0]+" "+new_mobile[1]);
		
		
		String toolname="selenium";
		char c[]=toolname.toCharArray();
		System.out.println(c[0]+""+c[1]+""+c[2]);
		
	}
	
}


