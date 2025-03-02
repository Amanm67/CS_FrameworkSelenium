
public class ReverseeachwordinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str= "Welcome to java";
		
         String []words=str.split(" ");// spliting multiple word 
         
         String revw="";
         for(String s: words) {
        	 String rew="";
        	 for(int i=s.length()-1;i>=0;i--) {
        		 rew= rew+s.charAt(i);
        		 
        	 }
        	 revw =revw+rew+" ";
         }
         System.out.println(revw);
		
	}

}
