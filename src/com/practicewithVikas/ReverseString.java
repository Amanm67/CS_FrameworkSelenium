package com.practicewithVikas;

public class ReverseString {

	public static void main(String[] args) {
		int a[]= {10,20,40,50,98,110,30,40,50,60};
		int temp;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1; j<=a.length-1;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				
			}
				
			
				
			}
		}for(int b:a) {
			System.out.println(b);
		}
		System.out.println(a[2]);

		
	}
}
