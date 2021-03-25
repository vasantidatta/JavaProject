package strings;
public class Strings_comparing {
	public static void main(String[] args) {
		String s = new String("Vasanti");
		String r = s.intern();
		System.out.println(r);
		String s0 = "Roopali ";
		String v = "Narayan ";
		String s1 = "Vasanti";
		String s2 = "vasanti";
		String s3 = "Kulkarni";
		String s5 = "Dattatreya";
		String a = "";
		System.out.println(s1+" "+s5);
		System.out.println(s1+" and "+s5+" are made for each other");
		System.out.println(s==s1);
		System.out.println(s1==r);
		System.out.println(s2.isEmpty());
		System.out.println(a.isEmpty());
		String v1 = v.concat(s3);
		System.out.println(v1);
		String s4 = s2.concat(s3);
		System.out.println(s4);
		System.out.println(s1+s3);
		System.out.println(s0+v+s3);
		System.out.println(v.substring(0,6));
		System.out.println(s1);
		System.out.println(s1.charAt(3));
		System.out.println(s2.trim());
		System.out.println(s3.indexOf("i"));
		System.out.println(s2.endsWith("ni"));
		System.out.println(s1.contains("ti"));
		System.out.println(s2.hashCode());
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s2.compareTo(s3));
		System.out.println(s2.compareToIgnoreCase(s1));
		System.out.println(s1==s2);
		System.out.println(s4.substring(0, 11));
		System.out.println(s4.substring(2,8));
		
		
					

	}

}
