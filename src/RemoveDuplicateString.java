import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 
		        String word = "programming programming programming aman aman vikas";

		        String[] words = word.split(" ");
		        Set<String> seenWords = new HashSet<>();
		        Set<String> duplicates = new HashSet<>();

		        // Loop through each word
		        for (String s : words) {
		            // If the word is already in seenWords, add it to duplicates
		            if (!seenWords.add(s)) {
		                duplicates.add(s);
		            }
		        }

		        // Print the duplicates
		        System.out.println("Duplicate words: " + duplicates);
		        
		    }
		

}