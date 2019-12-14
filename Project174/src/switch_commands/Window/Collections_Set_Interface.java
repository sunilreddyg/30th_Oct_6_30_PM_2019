package switch_commands.Window;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Collections_Set_Interface 
{

	public static void main(String[] args)
	{
		
		/*
		 * Set:-->
		 * 			Set is a unorder collection of objects.
		 */
		
		Set<String> set=new HashSet<String>();
		set.add("IDE");
		set.add("RC");
		set.add("WD");
		set.add("GRID");
		
		
		//Convert Collectin of objects into iterators
		Iterator<String> itr=set.iterator();
		
		//Read next itertor object at collection
		String obj1=itr.next();
		System.out.println(obj1);
		
		//Read next itertor object at collection
		String obj2=itr.next();
		System.out.println(obj2);
		
		//Read next itertor object at collection
		String obj3=itr.next();
		System.out.println(obj3);
		
		//Read next itertor object at collection
		String obj4=itr.next();
		System.out.println(obj4);
		
		
		

	}

}
