
public class TestGenericStack {
	 public static void main(String[] args) {
		GenericStackWithArray<Integer> s1 = new GenericStackWithArray<>();
		s1.push(1);
		//s1.push("one")
		int i = s1.pop();
		System.out.println(i);
		 
	 }
}
