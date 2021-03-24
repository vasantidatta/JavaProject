package superkeyword_uses;

public class Child3 extends Mom {
	String myname;
	public Child3() {
		System.out.println("Hi mom ");
	}
	public Child3(String myname) {
		super("Vasanti");
		this.myname = name;
		System.out.println("I am doing great");
	}
	
	public void greet() {
		System.out.println("Good morning "+myname);
	}
	

	public static void main(String[] args) {
		
		Child3 child = new Child3();
		child.greet();
		
		Child3 son  =new Child3("Shreesh");
		son.greet();
		
	}

}
