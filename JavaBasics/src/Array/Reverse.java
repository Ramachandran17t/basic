package Array;

public class Reverse {

	public static void main(String[] args) {
		int a[] = { 7, 3, 5, 9 };

		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		// Printing the elements
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}
