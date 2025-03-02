package practiceWithShravan;

public class Nthelement {

	public static void main(String[] args) {
		int a[] = { 30, 50, 40, 70, 90, 20 };
		int temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
			}

		}

		for(int b:a) {
			System.out.println(b);
		}
	}

}
