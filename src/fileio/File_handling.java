package fileio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File_handling {

	public static void main(String[] args) throws Throwable {
		
		File file = new File("C://Users//vasan//git.txt");
		
		if(file.createNewFile()) {
			
			System.out.println("file has been created");
		}
		
		FileOutputStream fout = new FileOutputStream(file);
		
		String str = "Selenium is open source testing tool for web based applications";
		
		byte[] b = str.getBytes();
		fout.write(b);
		fout.close();
		
		FileInputStream fis = new FileInputStream(file);
		int i;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		System.out.println("");
		
        String msg = " cucumber is behavior driven development framework";
        
        byte[] bt = msg.getBytes();
        
        FileOutputStream fist = new FileOutputStream(file);
        fist.write(bt);
        fist.close();
        
        FileReader read = new FileReader(file);
        
        int j;
        
        while((j=read.read())!=-1) {
        	System.out.print((char)j);
        }
        System.out.println("");
}

}
