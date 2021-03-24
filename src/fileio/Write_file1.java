package fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Write_file1 {

	public static void main(String[] args) throws IOException {
		try {
		File file = new File("C:\\Users\\Shreesh\\Documents\\sms.txt");
        file.createNewFile();
        FileWriter fwrite = new FileWriter(file);
        fwrite.write("Hello Shreesh how are you?");
        fwrite.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("success");
	}

}
