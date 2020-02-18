package cognizant;
import java.util.Scanner;
public class Employee {
	 int empid;
	 String name;
	 float salary;
	 String address;
	 public void getInput() {
	  Scanner in = new Scanner(System.in);
	  System.out.print("Enter the empid :: ");
	  empid = in.nextInt();
	  System.out.print("Enter the name :: ");
	  name = in.next();
	  System.out.print("Enter the address :: ");
	  address = in.next();
	  System.out.print("Enter the salary :: ");
	  salary = in.nextFloat();
	 }
	 public void display() {
	  System.out.println("Employee id = " + empid);
	  System.out.println("Employee name = " + name);
	  System.out.println("Employee salary = " + salary);
	  System.out.println("Employee address = " + address);
	 }
	 public static void main(String[] args) {
	  Employee e = new Employee();
	  e.getInput();
	  e.display();
	 }
	}