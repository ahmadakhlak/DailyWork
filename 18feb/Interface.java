package cognizant;

public class Interface {

	public static void main(String1[] args) {
		
		Impl imp=new Impl();
		System.out.println(imp.add(3, 5));
		System.out.println (imp.Sub(8, 10));
		System.out.println (imp.mul(8, 10));
	}

}
interface Add{
	public static final int AGE=26;
	int add(int a,int b);
	default int mul (int a,int b)
	{
		return a*b;
	}
}

interface Sub{
	int Sub(int a,int b);
}

class Impl implements Add,Sub{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int Sub(int a, int b)
	{
		return Math.abs( a-b);
	}
	
}