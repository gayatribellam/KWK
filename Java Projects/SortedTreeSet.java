package Labs;
import java.util.SortedSet;
import java.util.TreeSet;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SortedTreeSet {
	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("Usage: [string1] [string2] ...");
			System.exit(1);
		}
		
	
		
		try {
			int i =0;
			SortedSet<String> set = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String str;
			
			for(i=0; i < args.length; i++) set.add(args[i]);
			System.out.println("All:" + set);
			
			while(true) {
				str = br.readLine();
				if(set.contains(str)) {
					System.out.println("The set contains \'" + str + "\'");
				}
				else {
					System.out.println("The set does not contain \'" + str + "\'");
					
				}
			} 
			
		}catch(Exception e) {
				System.out.println("Wrong expression" + args[0]);
			}
			
			
		}
	}


