package Labs;

import java.util.*;
import java.util.Collections;
import java.util.LinkedList;

public class Lab4P2
{
   public static void main(String args[])
   {
    
	   //Creating LinkedList
       LinkedList<Integer> list = new LinkedList<Integer>();       
       Scanner input = new Scanner(System.in);                            


  
       
       System.out.println("Please enter each number in a separate line.Enter 'Quit' to stop adding numbers to the list");
       
     do {
       
    	   String num = input.next(); //getting input from user as a string              

          if ( num.equals("Quit" )) {      //checking if user wants to stop adding numbers to the list         
              break;
          }
           
           if(!list.contains(new Integer(num))) { //checking if number entered is already in list
        	   list.add(new Integer(num)); //adding number to the list
           }
           
       }
while(true);
     
       
       System.out.println("Linked List:" + list);
       
       Collections.sort(list);
       
       System.out.println("Sorted: " + list);         
       
 Collections.reverse(list);
       
       System.out.println("Reversed: " + list);
       
 Collections.shuffle(list);
       
       System.out.println("Shuffled: " + list);
   }
}