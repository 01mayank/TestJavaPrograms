package linkedin;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamAPI 
{
	public static void main(String args[])
	{
		//Create a stream
		Stream<String> shoppingStream = Stream.of("apples", "bananas", "Cherries", "Coffee");
		System.out.println("Printing shoppingStream...");
		shoppingStream.forEach(System.out::println);
		
		//Create a stream from other collection types
		
		//Array
		String[] shoppingArray = new String[]{"apples", "bananas", "Cherries", "Coffee"};
		
		//Convert Array into Stream
		Stream<String> shoppingArrStream = Arrays.stream(shoppingArray);
		//For Loop in one line
		System.out.println("\nPrinting shoppingArrStream...");
		shoppingArrStream.forEach(System.out::println);
				
		//Lists
		List<String> shoppingList = Arrays.asList(new String[]{"apples", "bananas", "Cherries", "Coffee"});
		Stream<String> shoppingListStream = shoppingList.stream();
		
		//For Loop in one line
		System.out.println("\nPrinting shoppingListStream...");
		shoppingListStream.forEach(System.out::println);
		
		//Another way
		System.out.println("\nPrinting shoppingList using stream...");
		shoppingList.stream().forEach(System.out::println);
		
		//Parallel Stream
		System.out.println("\nPrinting shoppingList using Parallel Stream...");
		shoppingList.parallelStream().forEach(System.out::println);
		
		//Match-1
		System.out.println("\nMatching the item-1...");
		Optional<String> a = shoppingList.stream().findAny();
		if(a.isPresent())
			System.out.println(a.get());
		
		//Match-2
		System.out.println("\nMatching the item-2...");
		Boolean isMatch = shoppingList.stream().anyMatch(item -> item.contains("Coffee"));
		System.out.println(isMatch);
		
		//Filter
		System.out.println("\nFiltering the stream...");
		Stream<String> filteredStream = shoppingList.stream().filter(item -> item.startsWith("C"));
		filteredStream.forEach(System.out::println);
		
		//Map
		System.out.println("\nUse of Map...");
		List<Integer> numbersList = Arrays.asList(2,5,4,5,1,9,3,4);
		Stream<Integer> doubleStream = numbersList.stream().map(n -> n*n);
		doubleStream.forEach(System.out::println);
		
		//Collect - To convert Map to list
		System.out.println("\nUse of Collect - To convert Map to list...");
		List<Integer> doubleList = numbersList.stream().map(n -> n*n).collect(Collectors.toList());
		doubleList.stream().forEach(System.out::println);
		
		System.out.println("\nUsing String's method on Map...");
		shoppingList.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}

