package cognizant;

import java.util.Scanner;

public class StringToggle {
	public static void main(String...args) {
		
		//String str = "Java programming is easy";
		Scanner input = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = input.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			
			if(i%2==0)
				System.out.print(Character.toUpperCase(str.charAt(i)));
			else
				System.out.print(Character.toLowerCase(str.charAt(i)));
		}
	
	}

}
