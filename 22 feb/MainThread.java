package cognizant;

public class MainThread {

	public static void main(String[] args) {
		
		Thread t=Thread .currentThread();
		System.out.println(t);
		System.out.println(t.getName());
		t.setName("Thread1");
		System.out.println(t);
		
		System.out.println(t.getPriority()); 
		
		System.out.println("is Demon :"+ t.isDaemon());

		System.out.println("is Demon :"+ t.isAlive());
		
		System.out.println("is Demon :"+ t.isInterrupted());
		
		
		
		
	}

	

}
