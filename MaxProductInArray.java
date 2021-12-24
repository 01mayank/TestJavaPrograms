package linkedin;

import java.util.Arrays;

public class MaxProductInArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {5,8,4,3,6,7,1,2};
		System.out.println(getMaxProduct(arr));
		System.out.println();
		System.out.println(getMaxProduct2(arr));
	}
	
	public static int getMaxProduct(int[] arr)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i] * arr[j] > max)
					max = arr[i] * arr[j];
			}
		}
		
		return max;
	}
	
	public static int getMaxProduct2(int[] arr)
	{
		Arrays.sort(arr);
		int maxProduct = arr[arr.length-2] * arr[arr.length-1];
		int minProduct = arr[0] * arr[1];
		
		if(maxProduct > minProduct)
			return maxProduct;
		else
			return minProduct;
	}
}
