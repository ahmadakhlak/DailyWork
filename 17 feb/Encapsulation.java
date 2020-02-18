package cognizant;

 class Example1 {
	
		 private int age;
		 private double salary;
		 public int getAge()
		 {
			 return age;
		 }
		 public void setAge(int age)
		 {
			 this.age=age;
		 }
	}
	 public class Encapsulation
	 {
		 public static void main(String[] args)
		 {
			 Example1 en=new Example1();
			 en.setAge(45);
			 int age= en.getAge();
			 System.out.println(age);
		 }
	 }

