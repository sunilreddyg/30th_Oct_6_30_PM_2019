package corejava.Collections;

import java.util.Hashtable;
import java.util.Set;

public class HashTable {

	public static void main(String[] args)
	{
		
		/*
		 *  => Map is a collection interface it accept pair values to 
		 * 		store.  
		 * 		Pair value store in key and value format.
		 * 			[keyname= value]
		 * => Map is a sorted list of set interface, Which means after
		 * 	  storing objects in doesn't main order..
		 */
		
		Hashtable<Integer, String> map=new Hashtable<Integer,String>();
		map.put(1, "IDE");
		map.put(2, "RC");
		map.put(3, "WD");
		map.put(4, "GRId");
		
		
		//Get value using keyname
		String obj=map.get(3);
		System.out.println("3 keyname value is => "+obj);
		
		//get All keyset values
		Set<Integer> set=map.keySet();
		for (Integer Eachitem : set) 
		{
			String item=map.get(Eachitem);
			System.out.println(item);
		}
		
		
		
		
		
	}

}
