import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Check2 
{
	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		list.add(454);
		list.add(778);
		list.add(964);
		list.add(751);
		
		//Binary Stream since 1.8
		list.forEach(System.out::println);
		
		System.out.println("List Elements Before Sorting...");
		for(int l : list)
		{
			System.out.println(l);
		}
		
		
		//Anonymous Class Example also
		/*Comparator<Integer> com = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {

				if(o1 > o2)
					return 1;
				
				return -1;
			}	
		};*/
		
		///////////////// OR /////////////////////////
		
		/*Comparator<Integer> com = (Integer o1, Integer o2) -> {

				if(o1 > o2)
					return 1;
				
				return -1;
		};*/
		
		
		///////////////// OR /////////////////////////
		
		/*Comparator<Integer> com = (o1, o2) -> 
		{
			return o1>o2 ? 1 : -1;
		};
		
		Collections.sort(list, com);*/
		
		///////////////// OR /////////////////////////
		
		Collections.sort(list, (o1,o2)->{return o1>o2 ?1 :-1;});
		
		System.out.println("List Elements After Sorting...");
		for(int l : list)
		{
			System.out.println(l);
		}
	}
}


/*class ComparatorImpl implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {

		if(o1 > o2)
			return 1;
		
		return -1;
	}	
	
}*/
