package practiceWithShravan;

public class SumofTarget {

	public static void main(String[] args) {
	 int a[]= {10, 4,11,17,16,19, 6, 15,2,0};
	 int target=17;
	 int sum;
	 for (int i=0; i<a.length;i++) {
		 for (int j=1; j<a.length;j++) {
			 sum=a[i]+a[j];
			 if(target==sum) {
				System.out.println("index postion of first element "+i +"index postion of 2nd element "+j); 
				 
			 }
			 
		 }
		 
	 }

	}

}
