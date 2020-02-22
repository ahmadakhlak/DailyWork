package cognizant;

public class series1 {
	public static void main(String args[]) {
		int max =36;
		int count=0;
		for (int i=max;i>=10;i--)
		{
		    count++;
			System.out.println(i);
			i--;
			if (count%2==0)
				i=i-2;
		}
}
}
