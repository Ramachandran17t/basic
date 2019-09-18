package pkg1;

public class Divisible_By_3_And_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,count=0;
		while(i<=100)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
				count++;
				//i++;
			}
			i++;
		}
		System.out.println("number of divisible by 3 and 5: "+count);

	}

}
