package superkeyword_uses;

public class Mom {
	
	int num = 100;
	String name;
	
	public Mom() {
		System.out.println("hi,my dear son");
	}
	
	public Mom(String name) {
		this.name = "Shreesh";
		System.out.println("How are you "+name);
	}
	
	public void addition() {
		
		num = num+1;
		System.out.println(num);
	}
	
	public void number() {
		num = num*3;
		System.out.println(num);
	}

	public static void main(String[] args) {
		

	}

}
