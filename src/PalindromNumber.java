import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		
		
		/* A palindromic number is a number that remains the same when its digits are reversed. In other words, 
		it has reflectional symmetry across a vertical axis. The term palindromic is derived from palindrome*/
		int number,sum=0, temp, reminder;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		number =sc.nextInt();
		
		// Store the number
		temp=number;
		
		while(number>0) {
			
			reminder = number%10;
			
		sum= (sum*10)+reminder;
		number = number/10;
		}	
			
if (sum==temp)
	System.out.println("palindro number");

else
	
	System.out.println("not a palindrom");
		}

	}


