package cognizant;

class ThreadTable4 implements Runnable{
	
    public void run(){
    	
    	int b;
    	for(int i=1;i<=10;i++){
            b=i*4;
                System.out.println("Thread-4:"+b);
                
        }
    }
}