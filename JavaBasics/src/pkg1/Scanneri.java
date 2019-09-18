package pkg1;

import java.util.Scanner;

public class Scanneri {
	Scanner sc = new Scanner(System.in);

	/*void m() {
		int a = sc.nextInt();
	}

	void n() {
		int b = sc.nextInt();
	}
	*/

	public static void main(String[] args) {
		
		double sum=0;
		Scanner r=new Scanner(System.in);
		/*System.out.println("enter a number : ");
		int a=s.nextInt();
		while(a!=0)
		{
			sum=sum+a;
			System.out.println("enter a number : ");
			a=s.nextInt();
		}
		System.out.println("sum = "+sum);
		*/
		System.out.println("enter a number outside looping : ");
		double i=r.nextDouble();
		for(;i!=0.0;)
		{
			sum=sum+i;
			System.out.println("print i values : "+i);
			System.out.println("enter a number inside looping : ");
			//i++;
			i=r.nextDouble();
			i++;
		}
		System.out.println("sum : "+sum);
		
	}

}
