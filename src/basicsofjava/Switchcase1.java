package basicsofjava;

public class Switchcase1 {

	public static void main(String[] args) {
         
		int num = 5;
		String day ;
		String daytype;
		
		switch (num) {
		
		case 1:
			 day = "Monday";
			break;
		case 2:
			day = "Tuesday";
			break;
		case 3:
			day = "Wednesday";
			break;
		case 4:
			day = "Thursday";
			break;
		case 5:
			day = "Friday";
			break;
		case 6:
			day = "Saturday";
			break;
		case 7:
			day = "Sunday";	
			break;
		default:
			day ="invalid day";
		}
		System.out.println(day);
		switch (num) {
		case 1:
			daytype = "Ekadashi";
			break;
		case 2:
			daytype  ="Dwadashi";
			break;
		case 3:
			daytype = "Trayodashi";
			break;
		case 4:
			daytype = "Chaturthi";
			break;
		case 5:
			daytype = "Panchami";
			break;
		case 6:
			daytype = "Shashti";
			break;
		case 7:
			daytype = "Saptami";
		    break;
		default:
			daytype = "Holiday";
		}
		System.out.println(daytype);
	}

}
