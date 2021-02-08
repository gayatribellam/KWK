package HW1;

import java.util.*;
import java.util.ArrayList;

public class RemoveDuplicates { 
  
	
	 public static void main(String[] args)
	   {

	ArrayList<Integer> intlist = new ArrayList<Integer>();
	
	for(int i=0; i<5; i++) {
		intlist.add(i);
		intlist.add(i);
	}

 

    System.out.println("Original List: " + intlist);
    
    removeDuplicates(intlist);
    
    System.out.println("After removing duplicates: " + intlist);
    
	   }
	

    public static ArrayList removeDuplicates(ArrayList list)  {
		for(int i=0; i < list.size(); i++) {
			for(int j=0; j<list.size(); j++) {
				if(i==j) {
					continue;
				}
				else if(list.get(i)==list.get(j)) {
					list.remove(j);
				}
			}
		}
		return list;
		
	}
    
}