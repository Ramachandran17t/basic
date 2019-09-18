package pkg1;

public class ExamplePro {

	void odd_even() {
		int a = 7;
		System.out.println("odd or even");
		System.out.println("given number : " + a);
		if (a % 2 == 0) {
			System.out.println("given number is even :");
		} else {
			System.out.println("given number is odd :");
		}
		System.out.println();
	}

	void dividible_multiply() {
		int a = 15;
		System.out.println("divisible/multiply of 3");
		System.out.println("given number : " + a);
		if (a % 3 == 0) {
			System.out.println("given number is divisble and multiply by 3");
		} else
			System.out.println("given number is not divisble and multiply by 3");
		System.out.println();
	}

	void swap() {
		int a = 10;
		int b = 5;
		System.out.println("swapping of 2 numbers :");
		System.out.println("before swapping : a" + "=" + a + ", " + "b=" + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("after swapping : a" + "=" + a + ", " + "b=" + b);
		System.out.println();
	}

	void greater() {
		int a = 20;
		int b = 15;
		System.out.println("check greater");
		System.out.println("giver number" + "a" + "=" + a + ", " + "b=" + b);
		if (a > b) {
			System.out.println("A is greater");
		} else {
			System.out.println("B is greater");
		}
		System.out.println();
	}

	void split_digit() {
		int num = 426;
		System.out.println("split digit");
		System.out.println("given number" + "=" + num);
		int a = num / 100;
		int x = num % 100;
		int b = x / 10;
		int c = x % 10;
		System.out.println("split digit");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExamplePro obj = new ExamplePro();
		obj.odd_even();
		obj.dividible_multiply();
		obj.swap();
		obj.greater();
		obj.split_digit();
	}

}
