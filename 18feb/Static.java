package cognizant;

public class Static {

	public static void main(String1[] args) {
		// TODO Auto-generated method stub
		StaticDemo d=new StaticDemo();
		StaticDemo d2=new StaticDemo();
		
		System.out.println(d.x);
		System.out.println(d.y);
		d2.x=50; 
		d2.y=30;
		System.out.println(d2.y);
		System.out.println(d2.x);
	}

}

class StaticDemo{
	int x=10;
	static int y=20;
	static public void show() {
		System.out.println("x");
	}
}