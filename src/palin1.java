import java.util.Scanner;



public class palin1 {
	//how to acive method overloading- Return, data type or sequence of datatype
	
	public int add(int a, int b) {
		return 0;
		}

	public int add(int b, int a, int c) {
		int d=a+b+c;
		System.out.println("value :-"+d);
		 return d;
		 
		}
	public void add(int b, int a, float c) {
		float d= a+b+c;
		System.out.println("value "+d);
		}
	

	public static void main(String[] args) {
		palin1 sc = new palin1();
		sc.add(2, 10, 15);
		
		
		
}
	
	
	}
	
	