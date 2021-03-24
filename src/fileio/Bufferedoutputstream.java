package fileio;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Bufferedoutputstream {

	public static void main(String[] args)throws IOException {
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Shreesh\\Documents\\sms.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String str = "Sri Ram Jai Ram Jai Jai Ram, please protect us god";
			byte[] b = str.getBytes();
			bout.write(b);
			bout.close();
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("Jai Sri Ram");
		}
		try {
			FileOutputStream fout = new FileOutputStream("C:\\Users\\Shreesh\\Prayers.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			String song = "om sai sri sai jai jai sai sadguru sai";
			byte[] by = song.getBytes();
			bout.write(by);
			bout.close();
			fout.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
		System.out.println("sung");
		}

	}

}
