package corejava.Variables;

public class Variable_Initiations {

	public static void main(String[] args) 
	{
		
		
		//Local Initiation of variable
		int a=100;
		System.out.println("Value is => "+a);
		
		//Global initiation of variables
		int x;
		x=100;
		System.out.println("X value is => "+x);
		x=200;
		System.out.println("X value is => "+x);
		
		
		//Global Initation with in conditions
		int m;
		if(true)
		{
			m=10;
		}
		System.out.println("m value is =>"+ m);
		
	}

}
