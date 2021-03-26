package fileio;

import java.io.File;
import java.io.IOException;

public class File_handling {

	public static void main(String[] args) throws Throwable {
		
		File file = new File("C://Users//vasan//git.txt");
		
		if(file.createNewFile()) {
			
			System.out.println("file has been created");
		}

	}

}
