package practiceWithShravan;

public class MinValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 30, 50, 40, 70, 90, 20 };
		int min=a[0];
		for(int i=0; i<=a.length-1;i++) {
			
				if(min<a[i]) {
					min=a[i];
				}
				
			}System.out.println(min);
		}

	}


