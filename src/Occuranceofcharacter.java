
public class Occuranceofcharacter {

	public static void main(String[] args) {
		
		String str= "Java program and java opps";
		int totalcount =str.length();// total len of string
	int totalcountafterremove=	str.replace("a", "").length();
		
		int count = totalcount-totalcountafterremove;
		System.out.println("number of occurnace word:" +count);

	}

}
