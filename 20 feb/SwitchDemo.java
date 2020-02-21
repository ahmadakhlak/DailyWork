package ahmad;

import java.util.Scanner;

public class SwitchDemo {
	public static void main(String args[]) {

		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		int num=s.nextInt();
		
		
		switch(num){
			case 1:
				
				System.out.println("Add Employee details:\n");
				
				System.out.println("Enter employee id:");
				int id=s.nextInt();
				System.out.println("Enter employee name:");
				String name=s.nextLine();
				System.out.println("Enter employee address:");
				String address=s.nextLine();
				System.out.println("Enter employee desgination:");
				String designation=s.nextLine();
				System.out.println("Enter employee age:");
				int age=s.nextInt();
				System.out.println("Enter employee salary:");
				double salary=s.nextDouble();
				System.out.println("Enter employee contact number:");
				long phone=s.nextLong();
				break;
			case 2:
				System.out.println("update Employee details:\n");
				
				System.out.println("Enter employee id:");
				int id=s.nextInt();
				System.out.println("Enter employee name:");
				String name=s.nextLine();
				System.out.println("Enter employee address:");
				String address=s.nextLine();
				System.out.println("Enter employee desgination:");
				String designation=s.nextLine();
				System.out.println("Enter employee age:");
				int age=s.nextInt();
				System.out.println("Enter employee salary:");
				double salary=s.nextDouble();
				System.out.println("Enter employee contact number:");
				long phone=s.nextLong();
				break;
	}

}
}