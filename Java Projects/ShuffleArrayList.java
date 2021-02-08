package HW1;
import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
	
	public static void main(String[] args) {
		
	ArrayList<Integer> intList = new ArrayList<>();
	for (int i = 0; i < 20; i++) {
			intList.add(i);
			}
	System.out.println("Before shuffling:" + intList);
	
	shuffle(intList);
	
	System.out.println("Shuffled list:" + intList);
	}
	
	public static void shuffle(ArrayList<Integer> list) {
	
		Collections.shuffle(list);
	}
}
