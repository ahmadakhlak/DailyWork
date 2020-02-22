package cognizant;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main (String args[]) throws FileNotFoundException,IOException{
		String path="C:\\Users\\seed\\Desktop\\java\\data.txt";
		FileOutputStream out=new FileOutputStream(path,true);
		String message="Joining date is 28th january";
		byte b[]=message.getBytes();
		out.write(b);
		out.close();
	}
	

}
