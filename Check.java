

class A
{
	static int i = 100;
	
	static
	{
		System.out.println("A Static Block");
		i = i-- - --i;
		System.out.println("First : "+i);
	}
	
	{
		System.out.println("A Normal Block");
		i = i++ + ++i;
		System.out.println("Second : "+i);
	}
	
}

class B extends A
{
	static
	{
		System.out.println("B Static Block");
		i = --i - i--;
		System.out.println("Third : "+i);
	}
	
	{
		System.out.println("B Normal Block");
		i = ++i + i++;
		System.out.println("Fourth : "+i);
	}
}

public class Check 
{
	public static void main(String args[])
	{
		B b = new B();
		System.out.println(b.i);
	}
	
	
}
