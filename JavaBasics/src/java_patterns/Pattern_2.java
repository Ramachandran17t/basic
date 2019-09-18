package java_patterns;

public class Pattern_2 {
	public static void main(String[] args) {
		{
			for(int i=1;i<=3;i++)
			{
				for(int j=1;j<=1;j++)
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
						//System.out.print(a);
						//a++;
					}
					//System.out.print(a);
					//a++;
				}
				System.out.println();
			}

		}
}
}

