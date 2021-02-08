package Labs;
import java.util.Scanner;
import java.util.ArrayList;

public class BinPackFirstFit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number of objects: ");
		int numObj = input.nextInt();
		ArrayList<Integer> objects = new ArrayList<Integer>();
		System.out.print("Enter weights of objects: ");
		for(int i=0; i<numObj; i++) {
			objects.add(input.nextInt());
		}
		int numContainers = 1;
		while(!objects.isEmpty()) {
			System.out.println("Container" + numContainers + "contains objects with weight " + getBin(objects,10));
			numContainers+=1;
		}
	}
	public static String getBin(ArrayList<Integer> obj, int space) {
		String listofweights = "";
		for(int i=0; i < obj.size(); i++) {
			int current = obj.get(i);
			if(current <= space) {
				listofweights += (current + " ");
				obj.remove(i);
				return listofweights + getBin(obj, space - current);
			}
		}
		
		
		
		
		return listofweights;
	}
}
