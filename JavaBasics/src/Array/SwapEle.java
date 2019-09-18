package Array;

public class SwapEle {

	public static void main(String[] args) {
		int a[] = { 7, 8, 3, 2, 5 };
		int x = 8;
		int y = 5;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == x) {
				a[i] = y;
			} else if (a[i] == y) {
				a[i] = x;
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

	}

}
