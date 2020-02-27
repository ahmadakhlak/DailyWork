package array;
import java.util.Scanner;
public class TwoDArrayTask {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input the number of row and colums");
		int number = sc.nextInt();
		int[][] arr = new int[number][number];
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				System.out.println("Enter elements of  Row " + (i + 1) + " column: " + (j + 1));
				arr[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < number; i++) {
			int sum = 0;
			for (int j = 0; j < number; j++) {
				sum = sum + arr[i][j];
			}
			System.out.println("Sum of Row: " + (i + 1) + " is: " + sum);
		}
		System.out.println();
		for (int i = 0; i < number; i++) {
			int sum = 0;
			for (int j = 0; j < number; j++) {
				sum = sum + arr[j][i];
			}
			System.out.println("Sum of Column: " + (i + 1) + " is: " + sum);
		}
		System.out.println();
		int sum = 0;
		for (int j = 0; j < number; j++) {
			sum = sum + arr[j][j];
		}
		System.out.println("Sum of Diagonal element is: " + sum);
		System.out.println();
		int sum1 = 0;
		for (int i = 0; i < number; i++) {
			for (int j = 0; j < number; j++) {
				if (arr[i][j] % 2 == 0 && arr[i][j] % 3 == 0) {
					sum1 = sum1 + arr[i][j];
				}
			}
		}
		System.out.println("Sum of elements which are divisible by 2 and 3 is : " + sum1);
	}
}