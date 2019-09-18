package java_patterns;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=(i*b)-1;j++)
			{
				if((i==1 && j==1)||(i==1 && j==2)||
						(i==1 && j==4)||(i==1 && j==5)||
						(i==2 && j==1)||(i==2 && j==5))
				{
					System.out.print(" ");
				}
				else
				{
					//System.out.println();
					//System.out.print(j);
					System.out.print(a);
					a++;
				}
				//System.out.print(a);
				//a++;
			}
			System.out.println();
		}

	}

}
