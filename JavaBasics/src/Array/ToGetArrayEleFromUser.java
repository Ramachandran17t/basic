package Array;
import java.util.Scanner;
public class ToGetArrayEleFromUser {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int l = sc.nextInt();
		int a[] = new int[l];
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter element at " + i + " index:");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
}}}