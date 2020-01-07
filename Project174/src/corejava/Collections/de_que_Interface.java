package corejava.Collections;

import java.util.ArrayDeque;
import java.util.Collection;


public class de_que_Interface
{
	
	public static void main(String args[])
	{
	  // Creating an empty ArrayDeque 
        Collection<String> de_que = new ArrayDeque<String>(); 

        // Use add() method to add elements into the Deque 
        de_que.add("IDE"); 
        de_que.add("RC"); 
        de_que.add("WD"); 
        de_que.add("GRID"); 
        de_que.add("APPIUM"); 
        
        //Convert into array
        Object arr[]=de_que.toArray();
        for (Object object : arr) 
        {
			System.out.println(object);
		}
       
        // Displaying the ArrayDeque 
        System.out.println("ArrayDeque: " + de_que); 
    } 

}
