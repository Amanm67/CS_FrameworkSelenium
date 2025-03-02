import java.util.Scanner;

public class Rnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number=" );
		int num =sc.nextInt();
		
		int rev=0;
		while(num!=0) {
			rev =rev*10+ num%10;//0+1234%10=4
			num=num/10;	// 1234/10=123
		}
		System.out.println(""+rev);

	}
	
	
	

}



