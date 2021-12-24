package linkedin;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbers 
{
	public static void main(String args[])
	{
		//printBinary(10);
		printBinaryUsingQueue(10);
	}
	
	public static void printBinary(int n)
	{
		if(n<=0) {
			System.out.println("Nothing to Print...");
			return;
		}

		for(int i=1; i<=n; i++)
		{
			System.out.println(Integer.toBinaryString(i));
		}

	}
	
	public static void printBinaryUsingQueue(int n)
	{
		if(n<=0) {
			System.out.println("Nothing to Print...");
			return;
		}
		
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		
		for(int i=1; i<=n; i++)
		{
			Integer current = queue.remove();
			System.out.println(current);
			
			queue.add(current * 10);
			queue.add(current * 10 + 1);
		}
		
		System.out.println();
	}
}

