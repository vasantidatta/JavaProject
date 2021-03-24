package basicsofjava2;

public class FirstString {

	public static void main(String[] args) {
		
		char ch[]= {'S','h','r','e','e','s','h'};
		String s = new String(ch);
		String s1=new String ("Vasantidatta");
		String s2="Dattatreya";
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println("string length of s = "+s.length());
		
		if(s1.length()>5) {
			
			System.out.println("string s1 is not empty and has length of "+s1.length());
		}
		
		if (s2.length()==10) {
			
			System.out.println("string s2 has length of "+s2.length());
		}

	}

}
