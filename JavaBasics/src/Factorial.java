import java.util.Scanner;

public class Factorial 
{
	//static 
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number is : ");
		int n=s.nextInt();
		//int n=5;
		int f=1;
		for(int i=n;i>=1;i--)
		{
			f=f*i;
		}
		System.out.println("factorial values : "+f);

	}

}
