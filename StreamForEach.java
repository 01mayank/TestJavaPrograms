import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamForEach 
{
	public static void main(String args[])
	{
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<=10000; i++)
		{
			l.add(5);
			l.add(1);
			l.add(9);
			l.add(3);
		}
		
		long InitialTime = System.currentTimeMillis();
		System.out.println("InitialTime -> " + InitialTime);
		
		//Method 1
		System.out.println("Normal for loop............");
		for(int i=0; i<l.size(); i++)
		{
			System.out.print(l.get(i)+",");
		}
		
		long firstTime = System.currentTimeMillis();
		System.out.println("TimeTaken -> " + (firstTime - InitialTime));
		
		//Mehtod 2
		System.out.println("Enhanced for loop............");
		for(int i: l)
		{
			System.out.print(i+",");
		}
		
		long secondTime = System.currentTimeMillis();
		System.out.println("TimeTaken -> " + (secondTime - firstTime));
		
		//Method 3
		System.out.println("foreach method............");
		l.forEach(i -> System.out.print(i+","));
		
		long thirdTime = System.currentTimeMillis();
		System.out.println("TimeTaken -> " + (thirdTime - secondTime));
		
		//Method 4
		System.out.println("Stream API foreach method............");
		l.stream().forEach(i -> System.out.print(i+","));
		
		long fourthTime = System.currentTimeMillis();
		System.out.println("TimeTaken -> " + (fourthTime - thirdTime));
		
		//Method 5
		System.out.println("Parallel Stream API method...........");
		l.parallelStream().forEach(i -> System.out.print(i+","));
		
		long fifthTime = System.currentTimeMillis();
		System.out.println("TimeTaken -> " + (fifthTime - fourthTime));
		
		
		
	}
}
