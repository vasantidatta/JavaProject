package basicsofjava;

import java.util.ArrayList;

public class Switchcase2 {

	public static void main(String[] args) {
		ArrayList<String> months = new ArrayList<String>();
		
		int monthstring = 6;
		
		switch(monthstring) {
		case 1: months.add("January");
		case 2: months.add("February");
		case 3: months.add("March");
		case 4: months.add("April");
		case 5: months.add("May");
		case 6: months.add("June");
		//break;
		case 7: months.add("July");
		case 8: months.add("August");
		case 9: months.add("September");
		case 10: months.add("October");
		case 11: months.add("November");
		case 12: months.add("December");
		break;
		default:break;
			
		}
		//System.out.println(months);
		
		for(String str:months) {
			System.out.println(str);
		}
		

	}

}
