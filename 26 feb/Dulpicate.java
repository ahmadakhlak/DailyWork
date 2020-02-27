package array;

public class Dulpicate {

	public static void main(String[] args) {

		int[] arr = new int[] { 5, 1, 1 };

		System.out.println("Total no. of dulplicates is: ");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}
}