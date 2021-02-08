package HW2;

public class WordOccurrence implements Comparable<WordOccurrence> {
	private String word;
	private Integer count;

	
	public WordOccurrence(String word, int count){
		this.word = word;
		this.count = count;
	}

	
	public int compareTo(WordOccurrence o) {
		return o.count.compareTo(count);
	}


	public String toString() {
		return word + " occurs " + count + " times";
	}
}
