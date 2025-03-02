package practiceWithShravan;

public class ReverseTargetWord {

	public static void main(String[] args) {
		String str = "Aman and shravan are working in chetu";
		String target = "SHRAVAN";
		String result = "";
		String s = str.toUpperCase();
		String[] temp = s.split(" ");

		for (String p : temp) {
			String rev = "";
			if (p.equals(target)) {
				for (int i = target.length()-1; i>= 0; i--) {
					rev = rev+target.charAt(i);

				}

			} else {
				rev = rev + p;

			}
			result = result + rev + " ";
		}
		System.out.println(result);

	}

}
