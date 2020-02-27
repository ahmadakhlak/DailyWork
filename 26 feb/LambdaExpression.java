package array;

public class LambdaExpression {

	public static void main(String[] args) {
	//	Runnable r=() -> System.out.println("Helloo Runnable");
		//Thread t=new Thread(r);
		//t.start();
		Hello h=() ->"Good morning";
		System.out.println(h.greetings());
		
		Hello h1=() ->"Good evening";
		System.out.println(h1.greetings());
		
		Hello h2=() ->"Good afternoon";
		System.out.println(h2.greetings());
		
	}

}
@FunctionalInterface
interface Hello
{
	String greetings();
	//public void display() ;
		
	
	}