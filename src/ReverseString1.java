
public class ReverseString1 {

	public static void main(String[] args) {
		// using concatenation 
		String str= "aman mishra"; 
	      String rev ="";
	      
	      int len = str.length();
	      System.out.print(len);
	      
	      for (int i=len-1; i>=0; i-- ){
	        
	        rev =rev + str.charAt(i);
	        
	      }
	      System.out.print(rev);
	}

}
