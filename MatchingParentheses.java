package linkedin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MatchingParentheses 
{

	public static void main(String args[])
	{
		String str = "im[agine]";
		String str1 = "(increm)<ent>)";
		System.out.println(isMatching(str));
		System.out.println(isMatching(str1));
	}
	
	public static boolean isMatching(String str) 
	{
		Map<Character, Character> map = new HashMap<>();
		map.put(']', '[');
		map.put(')', '(');
		map.put('>', '<');
		
		Stack<Character> stack = new Stack();
		char arr[] = str.toCharArray();
		
		for(int i=0; i<arr.length; i++)
		{
			if(map.containsValue(arr[i])) {
				stack.push(arr[i]);
				continue;
			}
			
			if(map.containsKey(arr[i]) && (stack.isEmpty() || map.get(arr[i]) != stack.pop()))
				return false;
				
		}
		
		return stack.isEmpty();
	}
}
