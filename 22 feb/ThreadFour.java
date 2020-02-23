package cognizant;

public class ThreadFour implements Runnable{
	Resource resource;
	

	
	 public ThreadFour(Resource resource) {
		this.resource=resource;
	}
	 @Override
	 public void run() {
		 try {
			resource.display("Thread-4");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	 }

}

