import java.util.ArrayList;

public class LoveProgram {

	public static void main(String[] args) {

        // declare and initialize variable for output size 
		
		int ages[] = {20, 22, 18, 35, 48, 26, 87, 70};
  float avg , sum=0;
  
  int length = ages.length;
  for (int age : ages) {
	  sum += age;
	}
  avg = sum/length;
  System.out.println(avg);
		
	}
	
}


