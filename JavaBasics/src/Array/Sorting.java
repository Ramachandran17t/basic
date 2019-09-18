package Array;

public class Sorting {

	public static void main(String[] args) {
		int a[] = { 8, 2, 5, 9, 5, 8456, 77, 8, 9 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] < a[j]) {
					// Swapping logic
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
