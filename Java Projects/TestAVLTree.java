package Labs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class TestAVLTree {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		int length = 50000;
		Random r = new Random();
		
		for(int i =0; i < length; i++) {
			list.add(r.nextInt(length));
		}
		
		AVLTree<Integer> avl = new AVLTree<>();
		BST<Integer> bst = new BST<>();
		
		long time = System.currentTimeMillis();
		for(int i =0; i<length; i++) {
			bst.insert(list.get(i));
		}
		System.out.println("BST insertion took " + (System.currentTimeMillis() - time) + " milliseconds");
		
		time = System.currentTimeMillis();
		for(int i =0; i<length; i++) {
			avl.insert(list.get(i));
		}
		System.out.println("AVL insertion took " + (System.currentTimeMillis() - time) + " milliseconds");
		
		Collections.shuffle(list);
		time = System.currentTimeMillis();
		for(int i = 0; i < length; i++) {
			bst.search(list.get(i));
		}
		System.out.println("BST search took " + (System.currentTimeMillis() - time) + " milliseconds");
		
		}
}
