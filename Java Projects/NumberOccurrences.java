package HW2;

import java.util.Scanner;
import java.util.ArrayList;

public class NumberOccurrences
{
public static void main(String args[])
{
	System.out.println("Enter the numbers(excluding 0) and only enter 0 when you're done: ");
	Scanner input=new Scanner(System.in);
	
	ArrayList<Integer> nums=new ArrayList<Integer>();
	

	boolean stop = false;
	while(stop!=true) {
		int num=input.nextInt();
		if(num==0) {
			stop=true;
		}
		nums.add(num);
	}

	System.out.println("The list is: " + nums);
	

	int p;
	ArrayList<Integer> numberOccurences=new ArrayList<Integer>();
	for(int i=0;i<nums.size();i++){
		
		numberOccurences.add(0);
		
	for(int j=0;j<nums.size();j++){
		
		if(nums.get(i)==nums.get(j)){
			
			
			p=numberOccurences.get(i);
			p++;
			numberOccurences.set(i,p);
			}
		}
	}
	
	
	int max=0;
	for(int i=0;i<nums.size();i++) {
	if(numberOccurences.get(i)>max)max=numberOccurences.get(i);
	}
	
	
	
	ArrayList<Integer> repeated=new ArrayList<Integer>();
	
	for(int i=0;i<nums.size();i++){
		
	if(max==numberOccurences.get(i)){
		
	if(!repeated.contains(nums.get(i)))
	{
	repeated.add(nums.get(i));
			}
		}
	}

	System.out.println("Occurences that appeared in the numbers entered are: " + repeated);

	
	
	}


	}
