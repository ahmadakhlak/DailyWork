package cognizant;

import java.util.Scanner;

public class StringSplit{  
public static void main(String args[]){  
	Scanner input = new Scanner(System.in);
	System.out.println("Enter String:");
	String str = input.nextLine();
	String[] arrSplit = str.split("\\s");
    for (int i=0; i < arrSplit.length; i++){
      System.out.println(arrSplit[i]);
    }
  }
}
