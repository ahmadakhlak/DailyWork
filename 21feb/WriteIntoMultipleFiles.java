package cognizant;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteIntoMultipleFiles {

	public static void main(String[] args) throws IOException{
		String path1="C:\\Users\\seed\\Desktop\\java\\cse.txt";
		String path2="C:\\Users\\seed\\Desktop\\java\\it.txt";
		String path3="C:\\Users\\seed\\Desktop\\java\\ec.txt";
		String path4="C:\\Users\\seed\\Desktop\\java\\me.txt";
		
		FileOutputStream out1=new FileOutputStream(path1);
		FileOutputStream out2=new FileOutputStream(path2);
		FileOutputStream out3=new FileOutputStream(path3);
		FileOutputStream out4=new FileOutputStream(path4);
		ByteArrayOutputStream bout= new ByteArrayOutputStream();
		
		String data="This is a common data to be written in the files";
		byte[] b=data.getBytes();
		
		bout.write(b);
		
		bout.writeTo(out1);
		bout.writeTo(out2);
		bout.writeTo(out3);
		bout.writeTo(out4);
		
	}

}
