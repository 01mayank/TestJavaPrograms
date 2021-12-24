package linkedin;

import java.util.stream.IntStream;

import org.apache.commons.lang3.StringUtils;

public class CheckPalindrome 
{
	public static void main(String[] args) 
	{
		String test = "raceCar";
		//System.out.println(isPalindrome(test));
		//System.out.println(traditionalPalindromeChecker(test));
		System.out.println(streamPalindromeChecker(test));
	}
	
	
	//Method-1
	public static boolean isPalindrome(String str)
	{
		boolean result = true;
		String str1 = str.toLowerCase();
		char[] charArray = str1.toCharArray();
		int arrLength = charArray.length;
		for(int i=0; i<(arrLength-1)/2; i++)
		{
			if(charArray[i] == charArray[arrLength-1-i]) 
			{
				continue;
			}
			else 
			{
				result = false;
				break;
			}
		}
		
		return result;
	}
	
	
	//Method-2
	public static boolean traditionalPalindromeChecker(String str)
	{
		boolean result = false;
		
		char[] charArray = str.toLowerCase().toCharArray();
		
		/*StringBuilder reversed = new StringBuilder();
		for(int i=charArray.length-1; i>=0; i--)
		{
			reversed.append(charArray[i]);
		}*/
		
		//OR
		String reversed = StringUtils.reverse(str.toLowerCase());
		
		if(reversed.toString().equalsIgnoreCase(str))
			result = true;
		
		return result;
	}
	
	
	//Method-3
	public static boolean streamPalindromeChecker(String str1)
	{
		String str = str1.toLowerCase();
		return IntStream.range(0, str.length()/2).allMatch(i -> str.charAt(i) == str.charAt(str.length()-i-1));
	}
	
	
}
