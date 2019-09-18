package abstract_class;


public abstract class Honda4
{
	 abstract void run1();
	void run()
	{
		 System.out.println("running fast & safety..");
	 }
	 	
	public static void main(String args[])
	 {
		 Honda4 obj = new Bike1();
		 obj.run1();
	 }
}

class Bike1 extends Honda4
{
	 void run1()
	 {
		 System.out.println("running safely..");
		 //obj.run();
	 }

	 /*public static void main(String args[])
	 {
		 Bike1 obj = new Honda4();
		 obj.run();
	 }*/
}
