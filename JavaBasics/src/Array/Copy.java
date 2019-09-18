package Array;

public class Copy {

	public static void main(String[] args) {
		double a[] = { 567.5269, 78.145, 90.05, 23, 45.159, 67.75 };

		double b[] = new double[a.length];

		for (int i = 0; i < a.length; i++) {
			System.out.print(b[i] + "--->");
			b[i] = a[i];
			System.out.print(b[i]);
			System.out.println();
		}

	}

}
