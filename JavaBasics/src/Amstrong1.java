import java.util.*;

public class Amstrong1 
{
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) 
	{
		//int n=407;
		System.out.println("given number is : ");
		int n=s.nextInt();
		//System.out.println(n);
		int ch=n; 
		int a,r=0;
		while(n>0)
		{
			a=n%10;
			r=r+(a*a*a);
			n=n/10;
		}
		System.out.println("calculation value :"+r);
		if(ch==r)
		{
			System.out.println("given number is amstrong number ");
		}
		else
		{
			System.out.println("given number is not amstrong number ");
		}
	}

}
