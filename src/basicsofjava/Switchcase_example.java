package basicsofjava;

public class Switchcase_example {

	public static void main(String[] args) {
		
		//String day = "Thursday";
		int day = 4;
		String weekday;
		
	/*	switch(day) {
		
		case "Monday":
			System.out.println("Today is Monday");
		case "Tuesday":
			System.out.println("Today is Tuesday ");
		case "Wednesday":
			System.out.println("Today is wednesday");
		case "Thursday":
			System.out.println("Today is Thursday");
		case "Friday":
			System.out.println("Today is Friday");
		case "Saturday":
			System.out.println("Today is Saturday");
		case "Sunday":
			System.out.println("Today is Sunday");
			break;
		default :
			System.out.println("Not available");
			
			
		}*/
		
		// or we can code as following
		
		switch(day) {
		
		case 1:
			weekday = "Monday";
			break;
		case 2:
			weekday = "tuesday";
			break;
		case 3:
			weekday = "wednesday";
			break;
		case 4:
			weekday = "thursday";
			break;
		case 5:
			weekday = "friday";
			break;
		case 6:
			weekday = "saturday";
			break;
		case 7:
			weekday = "sunday";
			break;
		default:
			weekday = "Invalid day";	
		}
		System.out.println(weekday);

	}

}
