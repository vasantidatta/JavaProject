package fileio;
import java.io.*;

public class CreatFileDemo {

	public static void main(String[] args) {
		try {
		File fs = new File("C:\\Users\\kulkarnivasanti\\myfile.txt");
		fs.createNewFile();
		
		boolean fsr = fs.createNewFile();
		
		if(fsr) {
			System.out.println("File has been created");
		}
		else {
			System.out.println("File already exist");
		}
		
		}
		catch(IOException e) {
			System.out.println(e);
		}

	}

}
