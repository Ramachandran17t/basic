package inheritance;


//import java.io.*;
class Mltply
{
	//PrintStream pi=new PrintStream();
	void mul(int a,int b)
	{
		System.out.println("sum of two: " +(a*b));		
	}
	void mul(int a,int b,int c)
	{
		System.out.println("sum of three:  " +(a*b*c));		
	}
}
public class Polymorphism 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Mltply m=new Mltply();
		m.mul(6, 10);
		m.mul(10, 6, 5);		
	}

}
