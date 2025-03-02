
public class palindronstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="Aman";
String Org_str= str;
String rev="";
int len=str.length();
for (int i=len-1;i>=0;i--) {
	rev=rev+str.charAt(i);
	if(Org_str.equals(rev)) {
		System.out.println("palindro");
	}else {
		System.out.println("Not palindrom");
	}
}
	}

}
