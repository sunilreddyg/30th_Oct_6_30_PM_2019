package corejava.Calling_From_otherpackges;

import corejava.StaticMethods.NativeInputs;
import corejava.instantmethods.Robot;

public class Run_public_methods_From_Diff_packge 
{

	public static void main(String[] args) 
	{
		
		/*
		 * Calling other package public mehtods
		 * 		1. We should import packge referals to current class.
		 */
		Robot obj=new Robot();
		obj.walk();
		obj.run();
		
		//Static Methods to call
		NativeInputs.keyboard();
		NativeInputs.mouse();
		
	
		
	}

}
