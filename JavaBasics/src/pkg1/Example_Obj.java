package pkg1;

import java.util.Scanner;

public class Example_Obj {
	Scanner sc=new Scanner(System.in);
	void m()
	{
		System.out.println(" enter a instance input number ");
		int a=sc.nextInt();
		System.out.println("input instance method "+a);
	}
	//
	

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//int b=sc.nextInt();
		Example_Obj e=new Example_Obj();
		e.m();
		System.out.println("enter a number");
		int c=e.sc.nextInt();
		System.out.println("input number is :"+c);

	}

}
