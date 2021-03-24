package superkeyword_uses;

public class Child extends  Mom {
	
	int num = 110;

	public void display() {
		
		//System.out.println("Num value = "+num);
		
	
		System.out.println("Num value = "+super.num);
	}
		public static void main(String[] args) {
	
		
		Child kid  = new Child();
		kid.display();
		
	}

}

