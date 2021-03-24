/**
 * 
 */
package basicsofjava;


public class AssignmentOperators {

	public static void main(String[] args) {
		
		 int num1 = 100;
	      int num2 = 200;

	      num2 = num1;
	      System.out.println("num2 =  "+num2);

	      num2 +=num1;
	      
	      System.out.println("num2 = "+num2);
		      
	      num2 -=num1;
	      
	      System.out.println("num2 =  "+num2);
		      
	      num2 *= num1;
	      System.out.println("num2 =  "+num2);
		      
	      num2 /= num1;
	      System.out.println("num2 =  "+num2);
		      
	      num2 %= num1;
	      System.out.println("num2 =  "+num2);
	   }
}
