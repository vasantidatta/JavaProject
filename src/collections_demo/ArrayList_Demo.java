package collections_demo;

import java.util.*;
import java.util.ArrayList;
//import java.util.ArrayList;


public class ArrayList_Demo {

	public static void main(String[] args) {
		int i;
		ArrayList<String> ali = new ArrayList<String>(Arrays.asList("hello","excuse me","what","is","name"));
		
		for (i=0;i<=ali.size();i++){
			 
			System.out.println(i+" ");
		}
		
		int a = ali.size();
		System.out.println(ali);
		
		
		
		

	}

}
