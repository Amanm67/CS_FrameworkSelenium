package infosyasP;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome to Aman";
		String arr[] = str.split(" ");
		String rev = "";
		String target= "Aman";
		

		for (String s : arr) {
			String reva = "";
			for (int i = s.length() - 1; i >= 0; i--) {
				reva = reva + s.charAt(i);

			}
                rev = rev + reva + " ";
		}System.out.println(rev);

	}

}
