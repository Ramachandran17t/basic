package example_27_02_2019;

import java.util.*;

public class Addition {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the 'N' numbers: ");
		int n = s.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the " + i + " vaule: ");
			int sa = s.nextInt();
			sum = sum + sa;			
		}
		System.out.println("Addition of 'N' Numbers: " + sum);		
	}

}
