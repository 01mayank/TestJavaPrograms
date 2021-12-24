package linkedin;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;;

public class NoOfVowels 
{
	public static void main(String[] args) 
	{
		String str = "there is a quite Mouse";
		System.out.println("By Method-1..." + getVowelsCount(str));
		System.out.println("By Method-2..." + getVowelsCount2(str));
		System.out.println("By Method-2..." + getVowelsCount3(str));
	}
	
	
	//Method-1 to count Number of vowels in given String
	public static int getVowelsCount(String str) 
	{
		char[] charArray = str.toLowerCase().toCharArray();
		int count=0;
		for(int i=0; i<charArray.length; i++)
		{
			if(charArray[i] == 'a'|| charArray[i] == 'e' || charArray[i] == 'i' || charArray[i] == 'o' || charArray[i] == 'u')
				count++;
		}
		
		return count;
	}
	
	//Method-2
	public static int getVowelsCount2(String str)
	{
		String normalizedStr = str.toLowerCase().trim();
		char[] strCharArray = normalizedStr.toCharArray();
		String vowels = "aeiou";
		int vowelsCount=0;
		for(char c : strCharArray)
		{
			if(vowels.indexOf(c) !=-1)
				vowelsCount++;
		}
			
		return vowelsCount;
	}
	
	//Method-3
	public static int getVowelsCount3(String str)
	{
		String normalizedStr = str.toLowerCase().trim();
		String vowels = "aeiou";
		//To accept only alphabets
		List<Integer> letters = normalizedStr.chars().filter(Character::isAlphabetic).boxed().collect(Collectors.toList());
		return (int)letters.stream().filter(c -> vowels.indexOf(c)!=-1).count();
	}
}
