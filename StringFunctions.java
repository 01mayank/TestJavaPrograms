package linkedin;

import java.util.Arrays;
import java.util.stream.Stream;

public class StringFunctions 
{
	public static void main(String[] args) 
	{
		String apples = "Apples";
		
		System.out.println("apples.charAt(0) -->    "+apples.charAt(0));
		
		System.out.println("apples.indexOf('e')  -->   "+apples.indexOf('e'));
		
		System.out.println("apples.substring(2, 4)  -->   "+apples.substring(2, 4));
		
		System.out.println("apples.contains(\"pp\")  -->  "+apples.contains("pp"));
		
		char[] charArray = apples.toCharArray();
		System.out.println("charArray  -->  ");
		
		for(char c : charArray) 
		{
			System.out.println(c);
		}
		
		
		
		String text = "Many novice writers tend to make a sharp distinction between "
						+ "content and style, thinking that a paper can be strong in one and "
						+ "weak in the other, but focusing on organization shows how content "
						+ "and style converge in deliberative academic writing. Your professors "
						+ "will view even the most elegant prose as rambling and tedious if there "
						+ "isn’t a careful, coherent argument to give the text meaning. Paragraphs "
						+ "are the “stuff ” of academic writing and, thus, worth our attention here.";
		
		String[] sentences = text.split("\\. ");
		System.out.println("Number of sentences -->  " + sentences.length);
		
		String[] words = text.split(" |-");
		System.out.println("Number of words -->  " + words.length);
		System.out.println("words --> " + Arrays.asList(words));
		
		System.out.println("Text has characters -->  " + text.length());
		
		System.out.println("isEmpty -->  " + text.isEmpty());
	}
}
