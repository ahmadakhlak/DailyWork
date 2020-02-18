package cognizant;

public class ConstructorExamples {
public static void main (String [] args) {
	//A a =new A();
	//B b=new B();
	B b=new B(5);
	
	
}
}
  class A{
	A(){
	super();
	System.out.println("1");
	
}
	{
		System.out.println("2");
	}
 }
  class B extends A{
	  B() {
		  super();
		  System.out.println("3");
	  }
	  B(int a){
		  this();
		  System.out.println("4");
	  }
	  {
		  System.out.println("5");
	  }
  }