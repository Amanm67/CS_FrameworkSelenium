package infosyasP;

import java.util.HashMap;
import java.util.Map;

public class Duplicatenumber {
	 public static void main(String[] args) {
		
		 int a[]= {6,6,8,11,17,13,9,8};
		 int target =17;
		 int sum=0;
		 for(int i=0;i<=a.length-1;i++) {
			 for(int j=0;j<=a.length-1;j++) {
				 sum =a[i]+a[j];
				 if(sum==target) {
					 System.out.println(i+":"+j);

						 
					 }
					 
				 }
				 
			 }
		
		 }
		 
		 
	 }
		