import java.util.Arrays;
import java.util.Scanner;

public class StringSorting 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter digit...");
		
		int t = scan.nextInt();
		System.out.println("Please enter Strings...");
		
		scan.nextLine();
		
		String[] input = new String[t];
		
		for(int i=0; i<t; i++)
		{
			input[i] = scan.nextLine();
		}
		
		char[] arr;
		StringBuilder sb = new StringBuilder();
		for(String s: input)
		{
			arr = s.toCharArray();
			Arrays.sort(arr);
			for(char c : arr)
			{
				sb.append(c);
			}
			
			System.out.println(sb.toString());
			sb.setLength(0);
		}
		
		scan.close();
	}
}
