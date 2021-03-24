package arrays_Demo;

public class Arrays2 {

	public static void main(String[] args) {
		
		String[] days = new String[6];
		
		// = {"monday","tuesday","wednesday","thursday","friday","saturday"};
		
		days[0]="monday";
		days[1]="tuesday";
		days[2]="wednesday";
		days[3]="thursday";
		days[4]="friday";
		days[5]="saturday";
		
		for(String str:days) {
			System.out.println(str);
		}
		
		System.out.println("The third day of week is ->"+days[2]);

	}

}
