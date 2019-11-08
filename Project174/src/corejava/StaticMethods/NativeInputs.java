package corejava.StaticMethods;

public class NativeInputs 
{
	
	public static void keyboard()
	{
		System.out.println("keyboard executed");
	}
	
	public static void mouse()
	{
		System.out.println("mouse executed");
	}
	
	
	/*
	 * In mainmethod static access specifier allowed to
	 * call any static method and variable directly without
	 * help of object creation.
	 */
	public static void main(String[] args) 
	{
		keyboard();
		mouse();
		
	}

}
