package fileio;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filereader_writer {

	public static void main(String[] args) throws IOException{
		try {
			File file = new File("C://Users//Kulkarnivasanti//Demo.txt");
			FileWriter write = new FileWriter(file);
			String str = "Python is interpreted programming language";
			write.write(str);
			write.close();
			System.out.println("Written the string");
			
			FileReader fread = new FileReader(file);
			int i;
			while((i=fread.read())!=-1) {
				System.out.print((char)i);
			}
			fread.close();
			System.out.println();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
