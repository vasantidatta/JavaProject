package fileio;
import java.io.*;

public class CeatNewFile1 {

	public static void main(String[] args) throws IOException {
	    
		File file = new File("C:\\Users\\kulkarnivasanti\\newfile.txt");
		
		file.createNewFile();
		try {
			
			boolean filevar = file.createNewFile();
			
			if(filevar) {
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
