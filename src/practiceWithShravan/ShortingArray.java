package practiceWithShravan;

public class ShortingArray {

	public static void main(String[] args) {
		String arr[] = {"Aman", "Kallu", "Bhure", "Malakhan"};
		String  temp;
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i].compareTo(arr[j])>0) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}
		for (String a : arr) {

			System.out.println(a);
		}

	}

}
