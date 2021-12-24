
public class TestClass2 
{
	public static void main(String args[]) 
	{
		String str = "my name is mayank";
		str = str.toUpperCase();
		System.out.println(str);
		
		String w[] = str.split("\\s");
		
		for(String s : w)
			System.out.println(s);
	}
}
