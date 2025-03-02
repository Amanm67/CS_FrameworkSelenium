package infosyasP;

public class Simpleword {

	public static void main(String[] args) {
		  // static void main(String[] args) {
		        String word = "john and charles are two player";
		        String[] splitted = word.split(" ");
		        String target = "john";
		        
		        String res = "";
		        for (int i = 0; i < splitted.length; i++) {
		            String name = splitted[i];
		            String result = "";

		            if (!name.equals(target)) {
		                // Reverse the word
		                for (int j = name.length() - 1; j >= 0; j--) {
		                    result += name.charAt(j);
		                }
		            } else {
		                // Otherwise, keep the word as it is
		                result = name;
		            }
		            
		            res += result + " ";
		        }

		        // Trim the final result to remove the trailing space
		        res = res.trim();

		        System.out.println(res);
		    }
		}
