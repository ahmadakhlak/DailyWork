package cognizant;

public class ThreadThree implements Runnable{
	Resource resource;
	

	
	 public ThreadThree(Resource resource) {
		this.resource=resource;
	}
	 @Override
	 public void run() {
		 try {
			resource.display("Thread-3");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
