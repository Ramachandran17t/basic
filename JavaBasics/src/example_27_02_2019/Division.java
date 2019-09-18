package example_27_02_2019;

//import java.util.*;
public class Division {
	 // Scanner s=new Scanner(System.in);
	 static double div=1.0;
	 static int a=4;
	static double m()
	 {
		 //static double div=1.0;
		 for (double i = 1; i <= 5; i++) {
				//System.out.println("enter the " + i + " vaule: ");
				//double sa = s.nextInt();
				div = div / i;
				
			}
		 System.out.println(a);
		 return div;
			 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter the 'N' numbers: ");		
		//double n = s.nextInt();
		//double div = 1;
		/*for (double i = 1; i <= n; i++) {
			System.out.println("enter the " + i + " vaule: ");
			double sa = s.nextInt();
			div = div / sa;			
		}*/
		Division d=new Division();
		double e=d.m();
		System.out.println("division of  Numbers: " + e);
		

		//int n=1/0;
		//System.out.println(n);
	}

}
