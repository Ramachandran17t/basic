package pkg1;

public class MyFirstPro 
{
	int a=1;
	int b=2;
	int add()
	{
		int c=a+b;
		System.out.println("addition value : "+c);
		return c;
	}
	int sub()
	{
		int c=a=b;
		System.out.println("subtraction value : "+c);
		return c;
	}
	void  PrintTables(int a)
	{
		int b=0;
		for(int i=1;i<=10;i++)
		{
			b=a*i;
			//System.out.println(b);
			System.out.println(a+"*"+i+"="+b);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		MyFirstPro obj=new MyFirstPro();
		obj.add();
		obj.PrintTables(7);
		obj.sub();
		
	}

}
