package array;

public class SecondLargestElement {

	public static void main(String[] args) {

		int[] arr = new int[] { 2, 7, 4, 5, 9 };
		int temp = 0;

		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();

		
			System.out.print("second largest element is:"+arr[1]);
		}
	}
