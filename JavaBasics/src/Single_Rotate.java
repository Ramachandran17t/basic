public class Single_Rotate	{
	public static void main(String[] args)	{		
		int a[]={7,5,4,3,2,9};
		System.out.println("given array..."+"\n**************"+"\n");				
		for(int i=0;i<a.length;i++)		{
			if(i==0)	{
				System.out.print("\t { "+a[i]);
			}
			else
			System.out.print(","+a[i]);
		}
		System.out.print(" }");
		//single rotate...
		System.out.println("\n\nSingle_Rotate..."+"\n**************"+"\n");
		int temp=a[0];
		for(int i=0;i<a.length-1;i++)	{
			if(i==0)	{
				System.out.print("\t { "+a[i+1]+",");
			}
			else	{
				a[i]=a[i+1];
				System.out.print(a[i]+",");
			}
		}		
		System.out.println((a[a.length-1]=temp)+" }");		
	}
}
