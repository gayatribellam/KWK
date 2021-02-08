
public class Conversion3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double kmpermile = 1.609; 

		System.out.println(
			"Miles        Kilometers");

		
		for (int i = 1; i <= 10; i++) {
			System.out.printf(
				"%-13d%-10.3f\n", i, (i * kmpermile));
	}

}
	
}
