package example_27_02_2019;

import java.util.*;
public class Addition_Start_Minus_5 {

	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the 'N' numbers: ");		
		int n = s.nextInt();
		int sum = -5;
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the " + i + " vaule: ");
			int sa = s.nextInt();
			sum = sum + sa;			
			System.out.println("Addition of " + i + " Numbers: " + sum);
		}
		System.out.println("Addition of 'N' Numbers: " + sum);

	}

}
