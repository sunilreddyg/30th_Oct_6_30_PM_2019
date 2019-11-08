package corejava.instantmethods;

public class Run_Robot 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Inorder to call any instant method from public
		 * class, We should create object for class.
		 * 			new classname().methodname();
		 */
		new Robot().run();
		new Robot().walk();
		
		/*
		 * Object Creation using referal.
		 *			Classname obj=new Classname();
		 *			obj.methodname();
		 */
		Robot obj=new Robot();
		obj.walk();
		obj.run();

	}

}
