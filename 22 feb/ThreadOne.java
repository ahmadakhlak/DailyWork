package cognizant;


public class ThreadOne implements Runnable{
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i%2!=0) {
				System.out.println("Thread-1:"+i);
				
			}
		}
		for(int i=1;i<=10;i++) {
			System.out.println("Thread-1:"+i);
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
					
		}
	}

}
