package cognizant;

public class ThreadTable {

    public static void main(String[] args) {
        Runnable r = new ThreadTable2();
        Thread t = new Thread(r);
        t.start();
        Runnable r2 = new ThreadTable4();
        Thread t2 = new Thread(r2);
        t2.start();
    }
}