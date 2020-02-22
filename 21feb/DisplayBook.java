package cognizant;

import java.util.Scanner;

public class DisplayBook {

	public static void main(String[] args) {
	 Scanner detail=new Scanner(System.in);
	 System.out.println("Enter your choice");
	 int choice=detail.nextInt();
	 switch(choice) {
	 
	 case 1: 
		 System.out.println("enter book details");
		
		 
		 System.out.println("enter name of the book \n");
		 String name=detail.nextLine();
		 System.out.println("enter price of the book ");
		 double price=detail.nextDouble();
		 
		 System.out.println("enter author of the book \n");
		 String author=detail.nextLine();
		 
		 
		 
		 break;
		 
	 case 2:
		 System.out.println("Display book Details \n");
		 
		 
		 
		 
	 }
	 

	}

}
