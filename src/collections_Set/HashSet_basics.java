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

	}

}
