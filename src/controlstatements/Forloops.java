package controlstatements;
import java.util.*;

public class Forloops {

	public static void main(String[] args) {
		int i;
		for(i=10;i>=1;i--) {
			System.out.println(i);
		}
		
		// Infinite loops example
		
		for (i=1;i>=1;i++) {
			//System.out.println(i);
		}
		
		int arr[] = {2,4,6,8,9,7,5,3,1};
		
		for(i=0;i<arr.length;i++) {
			System.out.println(i);
		}
		//enhanced for loops are also called for each loops
		
		String array[] = {"hi","my","name","is","vasanti"};
		for(String str : array) {
			System.out.println(str);
		}
		
		ArrayList<String> ali = new ArrayList<String>(Arrays.asList("vasanti","Datta","shreesh","kulkarni")); 
		
		System.out.println(ali);
			/*for(String str : ali) {
				System.out.println(str);
			}
			int a = ali.size();
			System.out.println("the size of the Arraylist is "+a);*/
		}

	}


