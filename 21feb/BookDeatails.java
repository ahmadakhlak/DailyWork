package cognizant;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BookDeatails {
	
	public static void main(String[] args) throws IOException	
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your choice:");
		int choice=sc.nextInt();	
		
		
		
		switch(choice)
		{
		case 1:
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			String path="C:\\Users\\seed\\Desktop\\java\\FileData.txt";
			FileWriter out=new FileWriter(path);
			String msg="File Writed Data";
			System.out.println("1:Enter the book details:\n");
			System.out.println("Enter book name:");
	        String name=br.readLine();			
			System.out.println("Enter author name:");
			String aname=br.readLine();			
			System.out.println("Enter book price:");
			int price=sc.nextInt();		
			
			break;
			
		case 2:
			String path1="C:\\Users\\seed\\Desktop\\java\\FileData.txt";
			FileWriter in=new FileWriter(path1);
			System.out.println("Display the book details:");
		
			
			
			break;
			
		case 3:
			System.out.println("Exit");	
		}	
		
			
		
	}

}


	

