package example;

public class While_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=1;
		while(n<=20)
		{
			if(n%10==0)
			{
				System.out.println(n+" ");
				//n++;
			}
			//System.out.println();
			else
			{
				System.out.print(n+" ");
			}
				n++;
			}
		}
	}
