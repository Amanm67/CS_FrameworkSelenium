package practiceWithShravan;

public class ReverseStringwithpostion {

	public static void main(String[] args) {
		String str= "My name is Aman";
		String s[]=str.split(" ");
	     
		String rev="";
		for(int i=0; i<s.length; i++) {
			for(int j=s[i].length()-1; j>=0; j--) {
				rev=rev+s[i].charAt(j);
				
			}
			rev=rev+" ";
		}
System.out.println(rev);
	}

}
