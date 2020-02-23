package cognizant;

public class ThreadDemo {
	public static void main(String args[]) {
		//Thread.currentThread().setPriority(Thread.MAX_PRIORITY - 2);
		//System.out.println(Thread.currentThread().getName());
		Resource res=new Resource();
		
		ThreadThree threadThree = new ThreadThree(res);// new born state
		ThreadFour threadFour = new ThreadFour(res);
		Thread t3 = new Thread(threadThree);
		Thread t4 = new Thread(threadFour);
		//t3.setPriority(Thread.MAX_PRIORITY);
		//t4.setPriority(Thread.MIN_PRIORITY);

		t3.start();// reday state
		t4.start();

		// for(int i=1;i<=5;i++) {
		// System.out.println(Thread.currentThread().getName()+" :"+i);
		// }
		//System.out.println("main thread priority:" + Thread.currentThread().getPriority());
		System.out.println("Thread-3 priority:" + t3.getPriority());
		System.out.println("Thread-4 priority:" + t4.getPriority());
	}

}
