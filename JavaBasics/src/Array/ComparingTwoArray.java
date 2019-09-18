package Array;

public class ComparingTwoArray {

	public static void main(String[] args) {
		int a[] = { 7, 8, 3, 2, 5 };
		int b[] = { 4, 8, 5, 1 };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					System.out.println(a[i]+ " "+b[j]);
				}
			}
		}

	}

}
