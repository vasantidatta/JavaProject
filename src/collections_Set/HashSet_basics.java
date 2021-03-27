package collections_Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet_basics {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("vasanti");
		hs.add("datta");
		hs.add("Shreesh");
		hs.add("kulkarni");
		
		Iterator<String> itr = hs.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next().toString());
		}
		
		hs.remove("kulkarni");
		
		System.out.println(hs);
		
		hs.add("love");
		hs.add("happy");
		hs.add("peace");
		hs.add("trust");
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
			}
		System.out.println(hs);
		
	    int size = hs.size();
	    System.out.println(size);
	    

	}

}
