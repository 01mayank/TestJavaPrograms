
public class mergeArrayTest 
{
	public static int[] mergeArray(int[] arr1, int[] arr2)
	{
		
		int[] arr3 = new int[arr1.length+arr2.length];
		System.arraycopy(arr1, 0, arr3,  0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);
		
		for(int i=0; i<arr3.length; i++)
		{
		    for(int j=i+1; j<arr3.length; j++)
		    {
		    	int temp=0;
		    	if(arr3[i] > arr3[j])
		    	{
		    		temp = arr3[i];
			        arr3[i] = arr3[j];
			        arr3[j] = temp;
		    	}
		    }
		}
		
		return arr3;
	}
	
	
	public static void main(String[] args) 
	{
		int[] a = {2,5,1,4,0,-1};
		int[] b = {8,3,2,1,9,-2};
		
		for(int i: mergeArray(a,b))
		{
			System.out.println(i);
		}
	}
}
	