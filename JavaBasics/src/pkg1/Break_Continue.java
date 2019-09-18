package pkg1;

public class Break_Continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		r:{
		System.out.println("break  with Label ");
		
		int a=5+2;
		System.out.println(a);
	
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+"  "+j);
				if(i==j)
				{
					break r;
				}
			}
		}
	
	}		//r: {int a=5+2;
			//System.out.println(a);}
			/*System.out.println("continue");
			abc1:for(int a=1;a<=10;a++)
			{
				for(int b=4;b<=10;b++)
				{
					System.out.println(a+"  "+b);
					if(a==b)
					{
						continue abc1;
					}
				}
			}*/
	}
}
	