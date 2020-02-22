package cognizant;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException{
		String path="C:\\Users\\seed\\Desktop\\java\\data.txt";
		String newPath="C:\\Users\\seed\\Desktop\\java\\copy.txt";
		File file=new File(path);
		//System.out.println("File Name is : "+file.getName());
		//System.out.println("File Parent is : "+file.getParent());
		//System.out.println("File Path is : "+file.getPath());
		//System.out.println("File space is : "+file.getTotalSpace());
		FileInputStream in =new FileInputStream(file);
		BufferedInputStream bin=new BufferedInputStream(in); 
		FileOutputStream out =new FileOutputStream(newPath);
		BufferedOutputStream bout=new BufferedOutputStream(out);
		
		int i;
		while((i=in.read()) !=-1) {
			
			//System.out.print(i);
			//System.out.print((char)i);
				bout.close();
		
		}

	}

}
