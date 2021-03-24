package fileio;
import java.io.*;

public class FileReading {

	public static void main(String[] args)throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\kulkarnivasanti\\myfile.txt");
		
		int i;
		
		while((i=fr.read())!=-1) {
		
			System.out.print((char)i);
			
			fr.ready();

	}
	}

}
