 package abstract_class;

abstract class Shape
{  
	 abstract void draw();  
	/*static void Shape(int a,int b)
	{
		a=10;
		b=20;
		int c=a+b;
		
		System.out.println("parameter constructors..."+c);
	}
	*/
	static void tvs()
	{
		System.out.println("static block...");
		
	}
	
	static int a=10;
	static int b=a;
	static int c=a+b;
	
	void print()
	{
		System.out.println(c);
		this.tvs();
	}
	//this.print();
}

//In real scenario, implementation is provided by others i.e. unknown by end user  

abstract class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing rectangle");
		//this.print();
	}
	void draw1()
	{

	}
}  
	
class Circle1 extends Shape
{  
	void draw()
	{
		System.out.println("drawing circle");
	}
}  
	
//In real scenario, method is called by programmer or user  

abstract class TestAbstraction1
{
	
	public static void main(String args[])
	{
		Shape s=new Circle1();//In a real scenario, object is provided through method, e.g., getShape() method
		s.draw();
		//s.tvs();
		//s.print();
		Shape.tvs();
		//Circle1.draw();
		//this.print();
		
		
	}  
}  