package superkeyword_uses;

public class Child2 extends Mom {
	int num = 200;
	public void addition() {
		super.addition();
		num = num+1;
		System.out.println(num);
	}
	
	public void add() {
		
		number();
	}

	public static void main(String[] args) {
		
		Child2 kid = new Child2();
		kid.addition();
		kid.add();
	}

}
