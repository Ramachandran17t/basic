package example_27_02_2019;

import java.util.Scanner;

public class Multiply {
static final Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static final Scanner s = new Scanner(System.in);
		System.out.println("enter the 'N' numbers: ");
		int n = s.nextInt();
		int mul=1;
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the " + i + " vaule: ");
			int sa = s.nextInt();	
			//n=n/2;
			//if(n==n/2)
				//break;
			//System.out.println("n values: "+n);
			mul=mul*sa;
			//System.out.println("Multiplication of "+i+" numbers : "+mul);
		}
		System.out.println("Multiplication of 'N' numbers : "+mul);


	}

}
