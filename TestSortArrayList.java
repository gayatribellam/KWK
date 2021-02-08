import java.util.ArrayList;

public class TestSortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(9);
		a.add(6);
		a.add(4);
		a.add(8);
		for(Integer e: a) {
			System.out.print(e);
		}
		SortArrayList.sort(a);
		for(Integer e:a) {
			System.out.print(e);
		}
		System.out.println(LargestInArrayList.max(a));

	}

}
