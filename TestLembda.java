package linkedin;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TestLembda 
{
	public static void main(String args[])
	{
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Apple");
		fruits.add("Guava");
		fruits.add("Pinapple");
		
		//fruits.forEach(f -> System.out.println(f));
		
		//Consumer
		Consumer<String> con = n -> System.out.println(n);
		fruits.forEach(con);
		
		//Function
		Function<Integer, Integer> doubly = n -> n*n;
		System.out.println(doubly.apply(5));
		
		//Predicate
		IntPredicate isDivByFive = n -> n % 5 == 0;
		System.out.println(isDivByFive.test(25));
		
		//Supplier
		Supplier<Double> randomNo = () -> Math.random() * 100;
		System.out.println(randomNo.get());
		
		
	}
}
