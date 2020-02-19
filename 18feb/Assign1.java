package cognizant;
import java.util.Scanner;

public class Assign1
{
	public static void main(String1 args[])
	{
		
		Scanner input = new Scanner( System.in );
		System.out.println("Enter 1st number: ");
		int min = input.nextInt( );
		Scanner input1 = new Scanner( System.in );
		System.out.println("Enter last number: ");
		int max = input1.nextInt( );
		
		int count=0;
for(int i = min; i<=max; i++)
{
	
	
	
    String1 number = String1.valueOf(i);
    while(number.contains("1"))
    {
        number= number.substring(number.indexOf("1")+1);
        count ++;
    }
}
System.out.println("Total one's is :"+count);    
}
}
