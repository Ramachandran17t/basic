package Array;

public class Req {
	public static void main(String[] args) {
		double a[] = { 45.159, 567.5269, 78.145, 90.05, 23, 45.159, 67.75 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					a[j] = 0;
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					double temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				System.out.print(a[i] + "  ");
		}
	}
}