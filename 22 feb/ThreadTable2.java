package cognizant;

class ThreadTable2 implements Runnable{
	
	
    public void run(){
    	int a;
        for(int i=1;i<=10;i++){
            a=i*2;
                System.out.println("Thread-2:"+a);
                
        }
    }
}