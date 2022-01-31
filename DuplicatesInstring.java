import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicatesInstring 
{
	public static void main(String args[])
	{
		String test ="abfdsfashklf";
		//printDuplicatesUsingHashMap(test);
		//printDuplicates(test);
		removeDuplicatesUsingSet(test);
	}
	
	//Method-1
	public static void printDuplicatesUsingHashMap(String str)
	{
		Map<Character, Integer> map =new HashMap<Character, Integer>();
		char strArray[] = str.toCharArray();
		int count=1;
		
		for(int i=0; i<strArray.length; i++)
		{
			if(strArray[i] != ' ')
			{
				if(map.containsKey(strArray[i]))
					map.put(strArray[i], map.get(strArray[i])+1);
				else
					map.put(strArray[i], count);
			}
		}
		
		//System.out.println(map);
		
		for(Map.Entry<Character, Integer> m : map.entrySet())
		{
			if(m.getValue() > 1)
				System.out.println(m.getKey());
		}
	}
	
	
	//Method-2
	public static void printDuplicates(String str)
	{
		char strArray[] = str.toCharArray();
		int count;
		
		for(int i=0; i<strArray.length; i++)
		{
			count=1;
			for(int j=i+1; j<strArray.length; j++)
			{
				if(strArray[i]==strArray[j] && strArray[i]!=' ')
				{
					count++;
					strArray[j]='0';
				}
			}
			
			if(count>1 && strArray[i]!='0')
				System.out.println(strArray[i]);
			
		}
		
	}
	
	//Method-3
	public static void removeDuplicatesUsingSet(String str)
	{
		Set<Character> set = new TreeSet<>();
		
		for(int i=0; i<str.length(); i++)
		{
			set.add(str.charAt(i));
		}
		
		set.stream().filter(a -> a!=' ').forEach(System.out::print);
	}
}




















