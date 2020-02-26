package seed;

import java.util.Scanner;

public class SumOfDigit {

	public static int NumberofTimes(String str) {
		int sum = 0, count = 0;
		while (str.length() > 1) {
			sum = 0;
			for (int i = 0; i < str.length(); i++)
				sum += (str.charAt(i) - '0');

			str = sum + "";
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
		String str = s.next();
		System.out.println(NumberofTimes(str));
	}
}