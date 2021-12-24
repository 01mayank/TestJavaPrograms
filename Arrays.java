

public class Arrays 
{
	static int x = 0;
	
	public static void main(String args[]) 
	{
		int a[] = {4,3,1,6,4,3,6,4};
		int b[][] = new int[a.length][2];
		
		System.out.println("Before Sorting Array a --");
		for(int o : a) 
		{
			System.out.print(o+",");
		}
		
		a = sort(a);
		
		System.out.println();
		System.out.println("After Sorting Array a --");
		for(int o : a) 
		{
			System.out.print(o+",");
		}
		
		b[x][0] = a[0];
		b[x][1] = 1;
		for(int i=1; i<a.length; i++)
		{
			if(a[i] == a[i-1])
				b[x][1] = b[x][1] + 1;
			else 
			{
				x++;
				b[x][0] = a[i];
				b[x][1] = b[x][1] + 1;
			}
				
		}
		x++;
		
		System.out.println("No of Rows -- > " + x);
		
		System.out.println("2D Array b[][] --> ");
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		
		b = sort(b);
		
		for(int i=0; i<x; i++)
		{
			for(int j=0; j<b[i][1]; j++)
			{
				System.out.print(b[i][0] + " ");
			}
		}
		
	}
	
	
	public static int[][] sort(int[][] b)
	{
		int c[] = new int[2];
		for(int i=0; i<x; i++)
		{
			for(int j=i; j<x; j++) 
			{
				if(b[i][1] < b[j][1]) 
				{
					c = b[i];
					b[i] = b[j];
					b[j] = c;
				}
			}
		}
		
		return b;
	}
	
	public static int[] sort(int[] a) 
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i]>a[j]) 
				{
					int temp;
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
}
