package linkedin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NormalizeString 
{
	public static void main(String[] args) 
	{
		System.out.println("Concatinating Strings by + Operator...");
		String firstName = "John";
		String lastName = "Smith";
		String name = firstName + " " + lastName;
		System.out.println(name);
		
		System.out.println("Concatinating Strings by concat function...");
		System.out.println(firstName.concat(" ").concat(lastName));
		
		List<String> animals = Arrays.asList(" Dog"," Cat ","   Lion ","    ");
		System.out.println("unnormalized Animals list...");
		animals.stream().forEach(s -> System.out.println(s));
		
		System.out.println("Normalized Animals list...");
		List<String> trimmedList = animals.stream().map(s -> s.trim()).collect(Collectors.toList());
		trimmedList.stream().forEach(System.out::println);
		
		trimmedList.stream().map(s -> s.toLowerCase()).forEach(System.out::println);
	}
}
