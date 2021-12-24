package linkedin;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class WordCounter 
{
	public static void main(String[] args) 
	{
		String text = "Many novice writers tend to make a sharp distinction between "
				+ "content and style, thinking that a paper can be strong in one and "
				+ "weak in the other, but focusing on organization shows how content "
				+ "and style converge in deliberative novice academic writing. Your professors "
				+ "will novice view even the most elegant prose as rambling and tedious if there "
				+ "isn’t a careful, coherent argument to give the text meaning. Paragraphs "
				+ "are the “stuff ” of academic writing and, thus, novice worth our attention here.";
		
		
		try {
		System.out.println("Most Repeated Word : " + getMostRepeatedWord(text));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String getMostRepeatedWord(String text)
	{
		String[] words = text.toLowerCase().split("[ \\n\\t\\r.,';:]");
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count=1;
		
		for(String str : words) 
		{
			if(map.containsKey(str))
				map.put(str, map.get(str)+1);
			else
				map.put(str, count);
		}
		
		map.remove("");
		
		//Method 1
		//return map.entrySet().stream().max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get();
		
		//Method 2
		//return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
		
		//Method 3
		int max=0;
		String mostRepeatedWord="";
		for(String key : map.keySet())
		{
			if(map.get(key) > max)
			{
				max = map.get(key);
				mostRepeatedWord = key;
			}
		}
		
		return mostRepeatedWord;
	}
}
