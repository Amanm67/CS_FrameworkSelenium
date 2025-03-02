
public class RString3 {

	public static void main(String[] args) {

		String str = "Aman weds Shrishti at zero";
		String targetw = "weds";
		String result = "";
		String split[] = str.split(" ");

		for (String s : split) {
			String rev = "";
			if (s.equals(targetw)) {

				for (int i = targetw.length() - 1; i >= 0; i--) {
					rev = rev + targetw.charAt(i);
				}
			} else {
				rev = rev + s;
			}
             result=result+rev+" ";
		}
		System.out.print(result);

	}

}
