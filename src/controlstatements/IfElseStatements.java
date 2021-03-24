package controlstatements;

public class IfElseStatements {

	public static void main(String[] args) {
		
		int a=50;
		int b=40;
		int c=30;
		int d=60;
		
		
		System.out.println("if statement:-->");
		
		if(a>=0) {
			
			System.out.println("a is a positive number");
		}
		
		System.out.println("nested if statements-->");
		
		if(a>b) {
			System.out.println("a is bigger than b");
			if(a<b) {
				System.out.println("a is smaller than b");
			}
		}
		
		System.out.println("if else statements-->");
		
		if(c>d) {
			System.out.println("c is bigger than d");
		}
		
		else {
			System.out.println("c is smaller than d");
		}
		
		System.out.println("if else if statements-->");
		
		if(a>b) {
			System.out.println("a is bigger than b");
		}
		else {
			System.out.println("a is not bigger than b");
		}
		if(b>a) {
			System.out.println("b is bigger than a");
		}
		
		System.out.println("if elseif elseif and if statements--> ");
		
		if(d<a) {
			System.out.println("d is smaller than a");
		}
		else if(d<c) {
			System.out.println("d is smaller than c");
		}
		else if(d<b) {
			System.out.println("d is smaller than b");
		}
		else if(d>a) {
			System.out.println("d is bigger than a");
		}
		else if(d>b) {
			System.out.println("d is bigger than b");
		}
		else if(d>c) {
		   System.out.println("d is bigger than c");
	   }
		else {
			System.out.println("d is bigger than a,b,c.");
		}

	}

}
