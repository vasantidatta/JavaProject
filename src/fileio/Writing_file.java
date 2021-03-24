package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class Writing_file {

	public static void main(String[] args) throws IOException {
		try {
		FileWriter fr = new FileWriter("C:\\Users\\Shreesh\\Documents\\message.txt");
		fr.write("I am worried always about my family's health and i am scared of life ");
		fr.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Done!");
		try {
			FileWriter fw = new FileWriter("C:\\Users\\Shreesh\\Prayers.txt");
			String str = "please god i am praying all the deep from my heart";
			//fw.append(str);
			fw.write(str);
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("please help");
	}
}
