import java.util.Scanner;

public class palindronumber123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int org= num;
		
		while(num!=0) {
			
			 rev =rev*10+num%10
					 ;
			num =num/10;
			}
		if (org==rev) {
			
			System.out.println("Palindrom number");
		}
		else {
			System.out.println("not ");
		}
		
		

	}

}
