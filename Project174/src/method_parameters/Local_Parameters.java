package method_parameters;

public class Local_Parameters 
{
	
	//Method without parameter
	public void print_tool()
	{
		String name="webdriver"; //Hardcoded value..
		System.out.println(name);
	}
	
	//Method with local parameter
	public void print_tool(String toolname)
	{
		String name=toolname; 
		System.out.println(name);
	}
	
	//Method with local parameter
	public void print_tool(double value)
	{
		double toolprice=value; 
		System.out.println(toolprice);
	}


	//Method with local parameters
	public void print_tool(String toolname,Double price)
	{
		String name=toolname; 
		System.out.println(name+"    "+price);
	}


	public static void main(String[] args)
	{
		//Create object for class
		Local_Parameters obj=new Local_Parameters();
		obj.print_tool();
		obj.print_tool();
		
		//Calling with using argument
		obj.print_tool("Webdriver");
		obj.print_tool("Grid");
		
		//Calling with multiple argument
		obj.print_tool("IDE", 2000.00);
		obj.print_tool("ABC", 5000.00);
		
		
	}

}
