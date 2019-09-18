package pkg1;

public class Divisible_By_3_Or_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1, count3 = 0,count5=0;
		while (a <= 100) {
			if (a % 3 == 0 || a % 5 == 0) 
			{
				if(a%3==0)
				{
					System.out.println(a);
					count3++;
				}
				else 
				{
					System.out.println(a);
					count5++;
				}				
				// i++;
			}
			a++;
		}
		System.out.println("number of divisible by 3 : " + count3);
		System.out.println("number of divisible by 5 : " + count5);
		System.out.println();
		System.out.println("total number of divisible by both 3 or 5 : " + (count3+count5));
	}

}
