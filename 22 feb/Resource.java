package cognizant;

public class Resource {
	public void display(String name) throws InterruptedException {
		for (int i = 1; i <= 5; i++) {
			System.out.println("Name Count:" + i + "-" + name);
			Thread.sleep(2000);
		}
	}

}
