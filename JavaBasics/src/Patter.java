
public class Patter {

	public static void main(String[] args) {

		String s = "Ramachandran";
		// alternae caps --> RaMaChAnDrAn
		// replace a by @ --> R@m@ch@ndr@n
		// sort char in your name --> acdhmnr
		// Ram ach and ran split as 3 char each

		System.out.println("GIVEN STRING: ");
		System.out.print("**************");
		System.out.println();
		System.out.println();

		System.out.println(s);
		System.out.println();

		// alternae caps --> RaMaChAnDrAn

		System.out.println("ALTERNATE CAPS: ");
		System.out.print("******************");
		System.out.println();
		System.out.println();

		String alternate_caps = s.toUpperCase();

		// String alternate_caps=s;

		char a[] = alternate_caps.toCharArray();

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {

				System.out.print(a[i]);
			} else {
				a[i] = (char) (a[i] + 32);
				System.out.print(a[i]);
			}
		}
		System.out.println();
		System.out.println();

		// replace a by @ --> R@m@ch@ndr@n

		System.out.println("replace a by @: ");
		System.out.print("******************");
		System.out.println();
		System.out.println();

		char b[] = s.toCharArray();
		for (int i = 0; i < b.length; i++) {
			if (b[i] == 'a') {
				System.out.print("@");
			} else {
				System.out.print(b[i]);
			}
		}
		System.out.println();
		System.out.println();
		// sort char in your name --> acdhmnr

		System.out.println("sort character : ");
		System.out.print("******************");
		System.out.println();
		System.out.println();

		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] == c[j]) {
					c[i] = ' ';
				}
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					// System.out.print(c[i]);
				}
			}
		}

		for (int i = 0; i < c.length; i++) {
			if (c[i] != ' ')
				System.out.print(c[i]);
		}
		System.out.println();
		System.out.println();

		// Ram ach and ran split as 3 char each

		System.out.println("split as 3 char each : ");
		System.out.print("******************");
		System.out.println();
		System.out.println();
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (count == 3) {
				count = 0;
				System.out.print(" ");
			}
			System.out.print(b[i]);
			count++;
		}
	}

}
