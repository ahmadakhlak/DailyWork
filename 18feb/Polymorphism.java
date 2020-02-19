package cognizant;

public class Polymorphism {

	public static void main(String1[] args) {
		A a1=new B();
		a1.display();
		
		// TODO Auto-generated method stub

	}

}

class A{
	public void display() {
		System.out.println("Class A");
	}
}
class B extends A {
	@Override
	public void display() {
		System.out.println("class B");
	}
}