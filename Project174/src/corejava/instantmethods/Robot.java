package corejava.instantmethods;

public class Robot
{
	
	public void run()
	{
		System.out.println("run executed");
	}
	
	public void walk()
	{
		System.out.println("walk executed");
	}
	
	public static void main(String args[])
	{
		 new Robot().walk();
		 new Robot().run();
	}
	
}
